package presentation;

import metier.EleveFactory;
import metier.IEleve;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");
		IEleve e1 = (IEleve) context.getBean("eleve");
		System.out.println(e1);
		EleveFactory ef = (EleveFactory) context.getBean("eleveFactory");
		

	}

}
