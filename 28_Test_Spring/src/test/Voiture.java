package test;

public class Voiture implements IVoiture {
	private String marque;
	private String nom;
	private IPersonne proprio;

	public Voiture() {
	}

	public Voiture(String marque, String nom, IPersonne proprio) {
		super();
		this.marque = marque;
		this.nom = nom;
		this.proprio = proprio;
	}

	/* (non-Javadoc)
	 * @see essai.IVoiture#getMarque()
	 */
	@Override
	public String getMarque() {
		return marque;
	}

	/* (non-Javadoc)
	 * @see essai.IVoiture#setMarque(java.lang.String)
	 */
	@Override
	public void setMarque(String marque) {
		this.marque = marque;
	}

	/* (non-Javadoc)
	 * @see essai.IVoiture#getNom()
	 */
	@Override
	public String getNom() {
		return nom;
	}

	/* (non-Javadoc)
	 * @see essai.IVoiture#setNom(java.lang.String)
	 */
	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}

	/* (non-Javadoc)
	 * @see essai.IVoiture#getProprio()
	 */
	@Override
	public IPersonne getProprio() {
		return proprio;
	}

	/* (non-Javadoc)
	 * @see essai.IVoiture#setProprio(essai.IPersonne)
	 */
	@Override
	public void setProprio(IPersonne proprio) {
		this.proprio = proprio;
	}

	/* (non-Javadoc)
	 * @see essai.IVoiture#toString()
	 */
	@Override
	public String toString() {
		return nom + " " + marque + " " + proprio;
	}

}
