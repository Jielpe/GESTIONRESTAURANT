package dao;

import java.util.ArrayList;

import metier.Commande;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exec {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");

		IAssietteDAO daoassiette = (IAssietteDAO) context.getBean("ad");
		ICommandeDAO daocommande = (ICommandeDAO) context.getBean("cd");

		// On insère une nouvelle assiette dans la base
		@SuppressWarnings("rawtypes")
		ArrayList lstAssiette = new ArrayList<>();
		Commande commande1 = (Commande) context.getBean("c");
		lstAssiette.add(daoassiette.getFromId(2));
		lstAssiette.add(daoassiette.getFromId(6));
		lstAssiette.add(daoassiette.getFromId(4));
		commande1.setAll(lstAssiette);
		daocommande.insert(commande1);
		daoassiette.commit();
		daocommande.commit();

		// On vérifie que l'assiette a bien été insérée dans la base
		System.out.println(daocommande.getFromId(1));
	}

}
