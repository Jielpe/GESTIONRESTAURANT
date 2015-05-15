package exec;

import metier.Classe1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	private static ApplicationContext context ;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");
		Classe1 c = (Classe1) context.getBean("m");
		
		double a = c.m1(1, 2);
		

	}

}
