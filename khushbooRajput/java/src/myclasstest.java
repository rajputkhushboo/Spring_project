import static org.junit.Assert.*;

import org.junit.Test;

public class myclasstest {
	@Test(expected =IllegalArgumentException.class)
	public void testExceptionIsThrown()
	{
	myclass ob=new myclass();
	ob.multiply(1000, 5);
	}

	@Test
	
	public void multiplytest() {
		myclass ob=new myclass();
		assertEquals("10*5 must be 50", 50, ob.multiply(5,10));
		}
	@Test
	public void addtest() {
		myclass ob=new myclass();
		assertEquals("10*5 must be 50", 50, ob.add(25,25));
		}
	@Test
	public void addsubtract() {
		myclass ob=new myclass();
		assertEquals("10*5 must be 50", 50, ob.subtract(100, 50));
		}

}
