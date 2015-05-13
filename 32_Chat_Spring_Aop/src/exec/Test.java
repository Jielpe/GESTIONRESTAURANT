package exec;

import metier.IChat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext context ;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");
		IChat chat = (IChat) context.getBean("chat");
		chat.addMessage("Hello");
		System.out.println(chat.toString());
		chat.clear();
		System.out.println(chat.toString());
		chat.addMessage("Hello");
		chat.addMessage("Coucou");
		chat.addMessage("tu");
		chat.addMessage("veux voir");
		chat.addMessage("ma bite");
//		System.out.println(chat.toString());
		chat.addMessage("Ils");
		chat.addMessage("se");
		chat.addMessage("gavent");
		chat.addMessage("de");
		chat.addMessage("meuh");
		chat.addMessage("por");
		chat.addMessage("gueu");
		chat.addMessage("Prout");
		chat.addMessage("hui");
		System.out.println(chat.toString());
		

	}

}
