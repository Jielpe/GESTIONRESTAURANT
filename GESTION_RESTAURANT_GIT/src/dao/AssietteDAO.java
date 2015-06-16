package dao;

// test

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import metier.Assiette;

public class AssietteDAO implements IAssietteDAO {

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
	public AssietteDAO() {
		emf = Persistence.createEntityManagerFactory("gestionrestaurant");
		em = emf.createEntityManager();
		tx = em.getTransaction();
		tx.begin();
	}

	/**
	 * Récupère une assiette et l'ajoute au contexte de persistance
	 */

	public void insert(Assiette assiette) {
		em.persist(assiette);
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
	 * efface une assiette
	 * 
	 * @param a
	 *            L'assiette
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

		return em.createQuery("select a from Assiette a order by a.id asc")
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
		return em.find(Assiette.class, id);
	}

	/**
	 * recherche une liste d'assiette à partir d'une clause Where
	 * 
	 * @param whereClause
	 *            La clause where
	 * @return la liste d'assiettes
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Object> getWhere(String whereClause) {
		return em.createQuery(
				"select a from Assiette a where " + whereClause
						+ " order by a.id asc").getResultList();
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
		for (Object a : em.createQuery(
				"select a from Assiette a order by a.id asc").getResultList()) {
			result.append(a);
			result.append("\n");
		}

		return result.toString();
	}

}
