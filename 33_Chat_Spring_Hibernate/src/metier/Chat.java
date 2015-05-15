package metier;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.IDAO;


public class Chat implements IChat {
	private ArrayList<IMessage> lstMessages = new ArrayList<IMessage>();
	
	
	
	public Chat() {
		super();
	}

	
	public Chat(ArrayList<IMessage> lstMessages) {
		super();
		this.lstMessages = lstMessages;
	}


	/* (non-Javadoc)
	 * @see metier.IChat#addMessage(data.IMessage)
	 */
	@Override
	public void addMessage(IMessage message){
		lstMessages.add(message);
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		IDAO idao = (IDAO)context.getBean("dao");
		idao.insert(message);
		
	}
	

	/* (non-Javadoc)
	 * @see metier.IChat#clear()
	 */
	@Override
	public void clear(){
		
	}
	

	/* (non-Javadoc)
	 * @see metier.IChat#toString()
	 */
	@Override
	public String toString(){
		String result = "";
		return result;
	}
	

	/* (non-Javadoc)
	 * @see metier.IChat#purge(java.util.Date)
	 */
	@Override
	public void purge(Date date){
		
	}



	/* (non-Javadoc)
	 * @see metier.IChat#getLstMessages()
	 */
	@Override
	public ArrayList<IMessage> getLstMessages() {
		return lstMessages;
	}



	/* (non-Javadoc)
	 * @see metier.IChat#setLstMessages(java.util.ArrayList)
	 */
	@Override
	public void setLstMessages(ArrayList<IMessage> lstMessages) {
		this.lstMessages = lstMessages;
	}
	
	
}
