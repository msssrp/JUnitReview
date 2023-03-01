
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTest4 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddnumberPositive() {
		calculate total = new calculate();
		assertEquals(14,total.addNumber(5, 9));
	}
	
	@Test
	public void testAddnumberNegative() {
		calculate total = new calculate();
		assertEquals(-4,total.addNumber(5, -9));
	}

}
