package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import metier.Commande;

public class CommandeDAO implements ICommandeDAO {

	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction tx;

	private static CommandeDAO instance;

	/**
	 * Le DAO fonctionne en singleton
	 * 
	 * @return l'instance unique du DAO
	 */
	public static CommandeDAO getInstance() {
		if (instance == null) {
			instance = new CommandeDAO();
		}
		return instance;
	}

	/**
	 * Constructeur du DAO Il initialise le contexte de persistance
	 */
	public CommandeDAO() {
		emf = Persistence.createEntityManagerFactory("gestionrestaurant");
		em = emf.createEntityManager();
		tx = em.getTransaction();
		tx.begin();
	}

	public void insert(Commande commande) {
		em.persist(commande);
	}

	/**
	 * Synchronise le context de persistance avec la base de donnée. En fait un
	 * commit est effectué et une nouvelle transaction débutée
	 */
	@Override
	public void commit() {
		tx.commit();
		tx.begin();

	}

	/**
	 * Ferme la factory d'entity manager et l'entity manager
	 */
	@Override
	public void closeAll() {
		em.close();
		emf.close();

	}

	/**
	 * efface une commande
	 * 
	 * @param c
	 *            La commande
	 */
	@Override
	public void remove(Object o) {
		em.remove(o);

	}

	/**
	 * Retourne le contenu de la table
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Object> getAll() {

		return em.createQuery("select c from Commande c order by c.id asc")
				.getResultList();
	}

	/**
	 * Retourne une commande selectionnée par son id
	 * 
	 * @param id
	 *            l'id de la commande recherchée
	 * @return la commande
	 */
	@Override
	public Object getFromId(int id) {
		return em.find(Commande.class, id);
	}

	/**
	 * recherche une liste de commandes à partir d'une clause Where
	 * 
	 * @param whereClause
	 *            La clause where
	 * @return la liste de commandes
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Object> getWhere(String whereClause) {
		return em.createQuery(
				"select c from Commande c where " + whereClause
						+ " order by c.id asc").getResultList();
	}

	/**
	 * Construit un bloc de texte affichant le contenu de la table
	 * 
	 * @return le contenu de la table
	 */
	@Override
	public String tableToString() {
		StringBuffer result = new StringBuffer();
		result.append("[ETAT DE LA TABLE]\n");
		for (Object c : em.createQuery(
				"select c from Commande c order by c.id asc").getResultList()) {
			result.append(c);
			result.append("\n");
		}

		return result.toString();
	}

}
