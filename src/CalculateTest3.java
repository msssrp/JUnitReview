import junit.framework.TestCase;

public class CalculateTest3 extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	
	public void testAddnumberPositive() {
		calculate total = new calculate();
		assertEquals(14,total.addNumber(5, 9));
	}
	
	
	public void testAddnumberNegative() {
		calculate total = new calculate();
		assertEquals(-4,total.addNumber(5, -9));
	}

}
