package dao;

import metier.Type;


public class Exec {

	public static void main(String[] args) {
		DAOFactory df = DAOFactory.getInstance();
		IDAO daoassiette=df.getDAO(DAO.Assiette);
		
		// On ins�re une nouvelle assiette dans la base
		public Assiette assiette1 = daoassiette.getAssiette(Type.entree, "carrottes rapees", 2.7);
		daoassiette.commit();
		
		// On v�rifie que l'assiette a bien �t� ins�r�e dans la base
		System.out.println(daoassiette.getFromId(1));
	}

}
