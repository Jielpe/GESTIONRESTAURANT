package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Essai {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");

		IVoiture v = (IVoiture) context.getBean("v1");

		System.out.println(v);
		
	}

}
