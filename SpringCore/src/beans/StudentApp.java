package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class StudentApp {

	public static void main(String[] args){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans/SpringCore.xml");
		Student s= (Student) ctx.getBean("std");
		
		//s.setRegno(123);
		//s.setStdname("deloitte");
		
		System.out.println("Student details : "+s.getRegno()+" "+s.getStdname());
		System.out.println("Student details with address : "+s.getRegno()+" "+s.getStdname());
		System.out.println("Streetname is  : "+s.getAddr().getStreet()+" and City name is  "+s.getAddr().getCity()); 
		
	}
		
	}

	
