package dao;

public class DAOFactory {

	// Design Pattern Singleton

	protected static DAOFactory instance = null;

	public static DAOFactory getInstance() {
		if (instance == null) {
			instance = new DAOFactory();
		}
		return instance;

	}

	// Selon le nom du dao entree en parametre, le dao voulu sera retourne
	public IDAO getDAO(DAO pDAO) {
		IDAO dao = null;
		switch (pDAO) {
		case Assiette:
			dao = new AssietteDAO();
			break;
		case Commande:
			dao = new CommandeDAO();
			break;
		}
		return dao;
	}

}
