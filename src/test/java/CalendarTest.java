/**
 * 
 */
package test;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//import tw.org.lai.common.EightChars;

/**
 * @author birdming
 * 
 */
public class CalendarTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link tw.org.lai.common.MyCalendar#getEightWords()}.
	 */
	@Test
	public void testSecondToDate() {
		assertTrue(true);
	}

}
