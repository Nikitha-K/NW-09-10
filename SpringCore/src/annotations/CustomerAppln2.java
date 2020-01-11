package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CustomerAppln2 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("annotations/SpringAnnot.xml");
		
		Customer c = ctx.getBean("cust", Customer.class);
		System.out.println("The Customer name is "+c.getName());
		System.out.println("The Customer code is "+c.getCode());
		System.out.println("The Customer basic pay is "+c.getSalary().getBasic());
		System.out.println("The Customer HRA pay is "+c.getSalary().getHra());
		System.out.println("The Customer PF pay is "+c.getSalary().getPf());
		
		
		
	}

	
}
