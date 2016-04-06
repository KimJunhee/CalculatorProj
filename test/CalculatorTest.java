import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator cal;
	@Before
	public void setUp() throws Exception {
		 cal = new Calculator();
		 //System.out.println("a");
	}

	@After
	public void tearDown() throws Exception {
		cal=null;
	}

	@Test
	public void test() {

		for(long i=0;i<100000;i++)
		assertEquals(2,cal.add(1, 1));
	}
	@Test
	public void testadd1() {
		assertEquals(4,cal.add(3, 1));
	}
	@Test
	public void testsub() {
		for(long i=0;i<100000;i++)
		assertEquals(2,cal.sub(3, 1));
	}
	
	
}
