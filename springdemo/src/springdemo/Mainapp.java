package springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainapp {
	public static void main(String args[])
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
		demo obj=(demo) context.getBean("demo");
		obj.getX();
		obj.getY();
		obj.getZ();
	obj.displayInfo();
	}

}
