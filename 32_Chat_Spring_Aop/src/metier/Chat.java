package metier;

import java.util.ArrayList;
import java.util.List;

public class Chat implements IChat {
	
	public List<String> lstMessages = new ArrayList<String>();
	
	public Chat() {
		
	}
	
	

	public Chat(List<String> lstMessages) {
		super();
		this.lstMessages = lstMessages;
	}



	@Override
	public void addMessage(String pMessage) {
		this.lstMessages.add(pMessage);

	}

	@Override
	public void clear() {
		this.lstMessages = new ArrayList<String>();

	}



	@Override
	public String toString() {
		return "Chat [lstMessages=" + lstMessages + "]";
	}
	
	

}
