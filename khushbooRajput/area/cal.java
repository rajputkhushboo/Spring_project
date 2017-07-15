import java.util.Scanner;

public class cal {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the shape");
		String s= sc.next();
		if(s.equals("circle"))
		{
			Circle obj=new Circle();
			obj.area();
		}
		else	if(s.equals("Rectangle"))
		{
			Rectangle obj=new Rectangle();
			obj.area();
		}
		else if(s.equals("Square"))
		{
			Square obj=new Square();
			obj.area();
		}
		sc.close();
	}

}
