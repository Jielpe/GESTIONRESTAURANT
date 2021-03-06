package dao;

import java.util.List;

import metier.Commande;

public interface ICommandeDAO{
	
	public void commit();
	public void closeAll();
	public String tableToString();
	public void remove (Object o);
	public List<Object> getAll();
	public Object getFromId(int id);
	public List<Object> getWhere(String whereClause);
	public void insert(Commande commande);
}