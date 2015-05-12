package test;

public class Personne implements IPersonne{
	private String nom;
	private String prenom;
	
	public Personne() {
	}

	/* (non-Javadoc)
	 * @see essai.IPersonne#toString()
	 */
	@Override
	public String toString() {
		return nom+" "+prenom;
	}
	
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	/* (non-Javadoc)
	 * @see essai.IPersonne#getNom()
	 */
	@Override
	public String getNom() {
		return nom;
	}

	/* (non-Javadoc)
	 * @see essai.IPersonne#setNom(java.lang.String)
	 */
	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}

	/* (non-Javadoc)
	 * @see essai.IPersonne#getPrenom()
	 */
	@Override
	public String getPrenom() {
		return prenom;
	}

	/* (non-Javadoc)
	 * @see essai.IPersonne#setPrenom(java.lang.String)
	 */
	@Override
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	

}
