
public class myclass {
public int multiply(int x,int y)
{
	if(x>999)
	{
		throw new IllegalArgumentException("x should be less than 1000");
		
	}
	return x*y;
}
public int add (int x,int y)
{
	return x+y;
}
public int subtract(int x,int y)
{
	return x-y;
}
public static void main(String args[])
{
	myclass ob=new myclass();
	ob.add(5, 10);
	ob.subtract(10, 5);
	ob.multiply(5555, 5);
}
}
