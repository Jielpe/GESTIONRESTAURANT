package metier;

import java.util.ArrayList;
import java.util.Date;

public interface IChat {

	public abstract void addMessage(IMessage message);

	public abstract void clear();

	public abstract String toString();

	public abstract void purge(Date date);

	public abstract ArrayList<IMessage> getLstMessages();

	public abstract void setLstMessages(ArrayList<IMessage> lstMessages);

}