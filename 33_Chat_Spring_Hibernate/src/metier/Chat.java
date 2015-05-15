package metier;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.IDAO;


public class Chat implements IChat {
	private ArrayList<IMessage> lstMessages = new ArrayList<IMessage>();
	ApplicationContext context;
	IDAO idao;
	
	
	
	public Chat() {
		super();
		this.context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		this.idao = (IDAO)context.getBean("dao");
	}

	
	public Chat(ArrayList<IMessage> lstMessages) {
		super();
		this.lstMessages = lstMessages;
		this.context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		this.idao = (IDAO)context.getBean("dao");
	}


	/* (non-Javadoc)
	 * @see metier.IChat#addMessage(data.IMessage)
	 */
	@Override
	public void addMessage(IMessage message){
		lstMessages.add(message);
		
		idao.startTx();
		idao.insert(message);
		idao.endTx();
		
	}
	
	public void chatTermine(){
		idao.closeAll();
	}
	

	/* (non-Javadoc)
	 * @see metier.IChat#clear()
	 */
	@Override
	public void clear(){
		idao.resetDB();
		
	}
	
	

	/* (non-Javadoc)
	 * @see metier.IChat#toString()
	 */
	@Override
	public String toString(){
		String result = "";
		for (IMessage current : getLstMessages()){
			result = result + current.getTxtMessage()+"\n";
		}
		return result;
	}
	

	/* (non-Javadoc)
	 * @see metier.IChat#purge(java.util.Date)
	 */
	@Override
	public void purge(Date date){
		for (IMessage current : getLstMessages()){
			if ((current.getDateMessage()).before(date)){
				idao.remove(current);
			}
		}
		
	}
	
	public void getLstMessagesFromDB(){
		this.lstMessages=idao.selectAll();
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
