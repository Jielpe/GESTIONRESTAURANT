package dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import metier.Assiette;
import metier.Commande;
import metier.Type;

public class Exec {

	public static void main(String[] args) {

		DAOFactory df = DAOFactory.getInstance();
		IDAO daocommande = df.getDAO(DAO.Commande);
		IDAO daoassiette= df.getDAO(DAO.Assiette);
		// On insère une nouvelle assiette dans la base
		
		ArrayList lstAssiette = new ArrayList<>();
		lstAssiette.add((Assiette) daoassiette.getFromId(4));
		lstAssiette.add((Assiette) daoassiette.getFromId(3));
		lstAssiette.add((Assiette) daoassiette.getFromId(3));
		Commande commande1 = ((ICommandeDAO) daocommande).getCommande(lstAssiette);
		commande1.setPrix(commande1.calculPrix());
		daoassiette.commit();
		daocommande.commit();
		
		// On vérifie que l'assiette a bien été insérée dans la base
		System.out.println(daocommande.getFromId(1));
	}

}
