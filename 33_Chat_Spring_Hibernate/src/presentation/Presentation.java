package presentation;

import java.text.ParseException;

import metier.IChat;
import metier.IMessage;
import metier.methodeUtil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Presentation {

	public static void application() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");

		IChat c = (IChat) context.getBean("chat");
		IMessage m = (IMessage) context.getBean("message");
		methodeUtil util = (methodeUtil) methodeUtil.getInstance();
		char rep = Character
				.toUpperCase(util
						.getChar("Commencer à chatter avec des jolies inconnues ? (O/N)"));
		while (rep == 'O') {
			System.out.println("** Message **");
			try {
				m.setAll(util.getDate("Date ? (jj/mm/aaaa)"),
						util.getString("Message ?"));
			} catch (ParseException e) {

				e.printStackTrace();
			}
			c.addMessage(m);
			rep = Character.toUpperCase(util
					.getChar("Voulez-vous envoyer un autre message ? (O/N)"));
		}

		

	}

}
