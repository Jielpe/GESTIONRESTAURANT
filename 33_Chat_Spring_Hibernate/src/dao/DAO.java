package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import metier.IMessage;



public class DAO implements IDAO {

	// Design pattern Singleton
	private static IDAO instance;
	
	private static String TABLE_NAME = "messages";
	
	private static String CLASS_NAME =  "Message";

	public static IDAO getInstance() {
		if (null == instance) {
			instance = new DAO();
		}
		return instance;
	}

	// Recuperer un entity managerFactory a partir de l'unite de persistance
	private static EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("ChatBCBG");
	// récupérer un EntityManager à  partir de l'EntityManagerFactory
	private static EntityManager em = emf.createEntityManager();
	// début transaction
	private static EntityTransaction tx = em.getTransaction();

	 public void resetDB() {
	 System.out.println("Reseting...");
	
	 tx.begin();
	 // supprimer les éléments de la table formationhibernatetest01_formation
	 em.createNativeQuery("delete from "+TABLE_NAME).executeUpdate();
	 // fin transaction
	 tx.commit();
	 System.out.println("Table Cleared.");
	 }

	// Start commit
	/* (non-Javadoc)
	 * @see dao.IDAO#startTx()
	 */
	@Override
	public void startTx() {
		tx.begin();
		System.out.println("Starting transaction...");
	}

	// End commit
	/* (non-Javadoc)
	 * @see dao.IDAO#endTx()
	 */
	@Override
	public void endTx() {
		tx.commit();
		System.out.println("Table synced.");
	}

	// End all
	/* (non-Javadoc)
	 * @see dao.IDAO#closeAll()
	 */
	@Override
	public void closeAll() {

		// fin EntityManager
		em.close();
		// fin EntityManagerFactory
		emf.close();
		// log
		System.out.println("Terminé ...");
	}

	// Save Object
	/* (non-Javadoc)
	 * @see dao.IDAO#insert(org.aspectj.bridge.IMessage)
	 */
	@Override
	public void insert(IMessage pMessage) {
		
		startTx();
		em.persist(pMessage);
		System.out.println(pMessage + " : saved into persistance domain. ");
		endTx();
		prompt();
		closeAll();
		
	}

	 // Select and prompt in console all objects inside the table
	 public void prompt() {
	 System.out.println("[" + CLASS_NAME + "]");
	 for (Object s : em.createQuery(
	 // "select p from personne p order by p.nom " + pOrder)
	 "select f from " + CLASS_NAME +" f")
	 .getResultList()) {
	 System.out.println(s);
	 }
	 }
}
