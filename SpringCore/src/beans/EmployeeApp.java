package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class EmployeeApp {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans/SpringCore.xml");
		Employee e1= (Employee) ctx.getBean("emp");
		Employee e2= (Employee) ctx.getBean("emp");
		
		
		//e1.setEmpno(12543);
		//e2.setSalary(40000);
		//e2.setJob("Data Analyst");
		
		System.out.println("The Employee1 no is : "+e1.getEmpno());
		System.out.println("The Employee1 salary is : "+e1.getSalary());
		System.out.println("The Employee1 role is : "+e1.getJob());
		System.out.println("The Employee1 skills is : "+e1.getSkills());
		
		System.out.println("The Employee2 no is : "+e2.getEmpno());
		System.out.println("The Employee2 salary is : "+e2.getSalary());
		System.out.println("The Employee2 role is : "+e2.getJob());
		
	}
		
		

	}


