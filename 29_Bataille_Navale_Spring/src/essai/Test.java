package essai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");
		
		IBateau cdn = (IBateau) context.getBean("coquedenoix");
//		IBateau b = (IBateau) context.getBean("barque");
		
		System.out.println(cdn);
//		System.out.println(b);
		
		IGrille g = (IGrille) context.getBean("g1");
		g.setNb_colonnes(10);
		g.setNb_lignes(10);
		
		System.out.println(g);
//		
		g.addBateau(cdn);
//		
		System.out.println(g);
		

	}

}
