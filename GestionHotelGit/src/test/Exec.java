package test;

import dao.DAO;
import dao.DAOFactory;
import dao.IDAO;
import dao.VilleDAO;

public class Exec {

	public static void main(String[] args) {
		DAOFactory df = DAOFactory.getInstance();
		IDAO daopays=df.getDAO(DAO.Ville);
		System.out.println(daopays.getFromId(11));
	}

}
