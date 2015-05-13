package metier;


public interface IChat {

	
	
	/**
	 * Add the string parameter to the attribut lstMessage
	 * @param pMessage : toAdd (String)
	 */
	public abstract void addMessage( String pMessage );
	
	/**
	 * Clear message list
	 */
	public abstract void clear();
	
	
	
	
	
	
}
