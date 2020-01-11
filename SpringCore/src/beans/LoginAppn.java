package beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;


public class LoginAppn {
	
		public static void main(String[] args) {
			
			ApplicationContext ctx = new ClassPathXmlApplicationContext("beans/SpringCore.xml");
			
			Login l = ctx.getBean("log",Login.class);
			System.out.println("The Customer username is "+l.getUsername());
			System.out.println("The Customer pwd is "+l.getPassword());
			
			
			
		}

		
	}



