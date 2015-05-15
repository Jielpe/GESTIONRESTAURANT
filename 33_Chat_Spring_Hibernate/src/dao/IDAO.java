package dao;

import java.util.ArrayList;

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

	// remove Object
	public abstract void remove(IMessage pM);

	// Reset DB
	public abstract void resetDB();

	// Select and prompt in console all objects inside the table
	public ArrayList<IMessage> selectAll();
}