package presentation;

import metier.EleveFactory;
import metier.IEleve;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");
		
		EleveFactory ef = (EleveFactory) context.getBean("eleveFactory");
		IEleve e1 = ef.getEleve();
		e1.setNom("Doe");
		System.out.println(e1);

	}

}
