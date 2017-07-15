package hiberpro;


import java.util.Iterator;
import java.util.List;
import org.hibernate.cfg.Configuration;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Second {
	private static SessionFactory factory;

	public static void main(String args[]) {
		try {
			factory = ((AnnotationConfiguration) new AnnotationConfiguration().configure())
					.addAnnotatedClass(Hiberpro1.class).buildSessionFactory();
		} 
		catch (Throwable e) {
			System.err.println("session is not created" + e);
			//throw new ExceptionInInitializerError(e);
		}
		Second obj = new Second();
		Integer one = obj.addEmployee("khushboo", 28, 859346);
	//	Integer two = obj.addEmployee("sheetal", 25, 85934);
	//	Integer three = obj.addEmployee("aman", 28, 8593);
	//	Integer four = obj.addEmployee("ishu", 28, 859);
		obj.listemployees();
		obj.updateEmployee(one, 5000);
		// obj.deleteEmployees(four);
		obj.listemployees();
	}

	// create
	public Integer addEmployee(String name, int age, double salary) {
		Session session = factory.openSession();
		Transaction t = null;
		Integer empid = null;
		try {
			t = (Transaction) session.beginTransaction();
			// List ob =(List) session.createQuery("FROM employee");
			Hiberpro1 hiber = new Hiberpro1();
			hiber.setName(name);
			hiber.setAge(age);
			hiber.setSalary(salary);
			empid = (Integer) session.save(hiber);
			t.commit();
		}

		catch (HibernateException e1) {
			if (t != null)
				t.rollback();
			e1.printStackTrace();
		} finally {
			
			session.close();
		}
		return empid;
	}

	// read
	public void listemployees() {
		Session session = factory.openSession();
		Transaction t = null;
		try {

			t = (Transaction) session.beginTransaction();
			List list = session.createQuery("FROM Employee").list();

			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				Hiberpro1 employee = (Hiberpro1) iterator.next();
				System.out.print("First Name: " + employee.getName());
				System.out.print("  Last Name: " + employee.getAge());
				System.out.println("  Salary: " + employee.getSalary());
			}
			t.commit();
		} catch (HibernateException e) {
			if (t != null)
				t.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void updateEmployee(Integer empid, int salary) {

		Session session = factory.openSession();
		Transaction t = null;
		try {
			t = (Transaction) session.beginTransaction();
			Hiberpro1 hiber = (Hiberpro1) session.get(Hiberpro1.class, empid);
			session.delete(hiber);
			t.commit();
		} catch (HibernateException e) {
			if (t != null)
				t.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
