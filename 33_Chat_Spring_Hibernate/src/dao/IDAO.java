package dao;

import metier.IMessage;


public interface IDAO {

	// Start commit
	public abstract void startTx();

	// End commit
	public abstract void endTx();

	// End all
	public abstract void closeAll();

	// Save Object
	public abstract void insert(IMessage pMessage);

}