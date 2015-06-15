package dao;

import java.util.Set;

import metier.Assiette;
import metier.Commande;

public interface ICommandeDAO extends IDAO{
	
	public Commande getCommande(Set<Assiette> lstAssiette);

}