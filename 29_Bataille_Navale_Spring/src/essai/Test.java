package essai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");
		
		IBateau b = (IBateau) context.getBean("coquedenoix");
		
		System.out.println(b);
		
		IGrille g = (IGrille) context.getBean("g1");
		
		System.out.println(g);
		

	}

}
