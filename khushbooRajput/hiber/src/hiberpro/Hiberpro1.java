package hiberpro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Employee")
public class Hiberpro1 {
	 @Id @GeneratedValue
	   @Column(name = "name")
	private String name;
	  @Column(name = "age")
	private int age;
	  @Column(name = "salary")
	private double salary;
	  
	public Hiberpro1()
	{
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
