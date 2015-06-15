package dao;

import metier.Assiette;
import metier.Type;


public class Exec {

	public static void main(String[] args) {
		DAOFactory df = DAOFactory.getInstance();
		IDAO daoassiette=df.getDAO(DAO.Assiette);
		
		// On insère une nouvelle assiette dans la base
		Assiette assiette1 = daoassiette.getAssiette("carrottes rapees", 2.7, Type.entree);
		daoassiette.commit();
		
		// On vérifie que l'assiette a bien été insérée dans la base
		System.out.println(daoassiette.getFromId(1));
	}

}
