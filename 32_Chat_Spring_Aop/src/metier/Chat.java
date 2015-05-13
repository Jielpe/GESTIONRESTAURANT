package metier;

import java.util.ArrayList;
import java.util.List;

public class Chat implements IChat  {
	
	public List<String> lstMessages = new ArrayList<String>();
	
	public Chat() {
		
	}
	
	

	public Chat(List<String> lstMessages) {
		super();
		this.lstMessages = lstMessages;
	}



	/* (non-Javadoc)
	 * @see metier.IChat#addMessage(java.lang.String)
	 */
	@Override
	public void addMessage(String pMessage) {
		this.lstMessages.add(pMessage);

	}

	/* (non-Javadoc)
	 * @see metier.IChat#clear()
	 */
	@Override
	public void clear() {
		this.lstMessages = new ArrayList<String>();

	}



	/* (non-Javadoc)
	 * @see metier.IChat#getLstMessages()
	 */
	@Override
	public List<String> getLstMessages() {
		return lstMessages;
	}



	/* (non-Javadoc)
	 * @see metier.IChat#setLstMessages(java.util.List)
	 */
	@Override
	public void setLstMessages(List<String> lstMessages) {
		this.lstMessages = lstMessages;
	}



	/* (non-Javadoc)
	 * @see metier.IChat#toString()
	 */
	@Override
	public String toString() {
		return "Chat [lstMessages=" + lstMessages + "]";
	}
	
	

}
