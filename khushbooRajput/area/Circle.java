import java.lang.Math;
public class Circle implements Area{
	double r=6;
	double y;
	
public void area()
{
	y=Math.PI * r* r;
	System.out.println("Area of Circle is: " +y);
}
}
