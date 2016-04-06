import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {

		Calculator cal = new Calculator();
		assertEquals(2,cal.add(1, 1));
	}
	@Test
	public void testadd1() {

		Calculator cal = new Calculator();
		assertEquals(2,cal.add(1, 1));
	}
}
