package dao;

import java.util.ArrayList;
import java.util.List;

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
	
	public void resetDB();
	
	public ArrayList<IMessage> selectAll();

}