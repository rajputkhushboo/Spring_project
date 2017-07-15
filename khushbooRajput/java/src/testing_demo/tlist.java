package testing_demo;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.junit.Test;

public class tlist {

	@Test
	public void testAssertmap()
	{
	 Map<Integer, String> map=new HashMap<Integer,String>();
	 map.put(1, "yes");
	 map.put(2, "sir");
	 map.put(3, "hey");
	 map.put(4, "lmn");
	 map.put(5, "bye");
	 map.remove(3);
	for(Map.Entry m: map.entrySet())
	{
		 System.out.println( m.getKey() +" "+ m.getValue());
		 
	}
	
	 
	 
	}

}