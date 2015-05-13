package exec;

import metier.ICalculette;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import util.IUtil;

public class Exec {
	private static ApplicationContext context ;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");
		IUtil classutil = (IUtil) context.getBean("util");
		ICalculette calc = (ICalculette) context.getBean("calc");
		
		double a = classutil.getDouble("Entrez votre première valeur : ");
		double b = classutil.getDouble("Entrez votre deuxième valeur : ");
		classutil.prompt(a+" + "+b+" = "+calc.addition(a, b));
	}

}
