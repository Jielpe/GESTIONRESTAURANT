package metier;

import java.util.List;

public interface IChat {

	/**
	 * Add the string parameter to the attribut lstMessage
	 * @param pMessage : toAdd (String)
	 */
	public abstract void addMessage(String pMessage);

	/**
	 * Clear message list
	 */
	public abstract void clear();

	public abstract List<String> getLstMessages();

	public abstract void setLstMessages(List<String> lstMessages);

	public abstract String toString();

}