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

	}

}
