package dao;

import java.util.List;
import java.util.Set;

import metier.Assiette;
import metier.Commande;

public interface ICommandeDAO extends IDAO{
	
	public Commande getCommande(List<Assiette> lstAssiette);

}