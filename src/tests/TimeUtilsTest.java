package tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import timeUtils.TimeUtils;

public class TimeUtilsTest {

	private TimeUtils timeUtils;

	@BeforeEach
	public void setUp() {

		timeUtils = new TimeUtils();
	}

	@SuppressWarnings("static-access")
	@ParameterizedTest
	@CsvSource({ "0, 0:00:00", "60, 0:01:00", "3665, 1:01:05", "3600, 1:00:00", "-30, 0:00:00", "36000, 10:00:00",
			"7200, 2:00:00", "900, 0:15:00", "1, 0:00:01", "-120, 0:00:00" })
	public void testSecToTime(int seconds, String expectedTime) {
		String result = timeUtils.secToTime(seconds);
		assertEquals(expectedTime, result);
	}

}
