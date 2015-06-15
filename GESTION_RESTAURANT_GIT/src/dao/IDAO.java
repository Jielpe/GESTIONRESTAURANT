package dao;

import java.util.List;
import java.util.Set;

import metier.Assiette;
import metier.Commande;
import metier.Type;


public interface IDAO {
	
	public void commit();
	public void closeAll();
	public String tableToString();
	public void remove (Object o);
	public List<Object> getAll();
	public Object getFromId(int id);
	public List<Object> getWhere(String whereClause);
	

}
