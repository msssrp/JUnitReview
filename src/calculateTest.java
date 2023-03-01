import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class calculateTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddnumberPositive() {
		calculate total = new calculate();
		assertEquals(14,total.addNumber(5, 9));
	}
	
	@Test
	void testAddnumberNegative() {
		calculate total = new calculate();
		assertEquals(-4,total.addNumber(5, -9));
	}

}
