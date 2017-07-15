import static org.junit.Assert.*;

import org.junit.Test;

public class hellotest {

	@Test
	public void test() {
		hello h=new hello();
	assertEquals("must be 10", 10, h.hi(10));
	assertEquals("must be 20", 20, h.hi(20));
	assertEquals("must be greater than  50", 60, h.hi(60));
	assertEquals("more than 100", 110, h.hi(110));
	}

}
