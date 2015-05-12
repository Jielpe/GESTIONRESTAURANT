package essai;

import java.util.List;

public class Grille implements IGrille {
	
	private int nb_colonnes;
	private int nb_lignes;
	private List<IBateau> lstBateau ;
	
	public Grille() {}

	public Grille(int nb_colonnes, int nb_lignes, List<IBateau> lstBateau) {
		super();
		this.nb_colonnes = nb_colonnes;
		this.nb_lignes = nb_lignes;
		this.lstBateau = lstBateau;
	}
	
	

	/* (non-Javadoc)
	 * @see essai.IGrille#toString()
	 */
	@Override
	public String toString() {
		return "Grille [nb_colonnes=" + nb_colonnes + ", nb_lignes="
				+ nb_lignes + ", lstBateau=" + lstBateau + "]";
	}

	/* (non-Javadoc)
	 * @see essai.IGrille#getNb_colonnes()
	 */
	@Override
	public int getNb_colonnes() {
		return nb_colonnes;
	}

	/* (non-Javadoc)
	 * @see essai.IGrille#setNb_colonnes(int)
	 */
	@Override
	public void setNb_colonnes(int nb_colonnes) {
		this.nb_colonnes = nb_colonnes;
	}

	/* (non-Javadoc)
	 * @see essai.IGrille#getNb_lignes()
	 */
	@Override
	public int getNb_lignes() {
		return nb_lignes;
	}

	/* (non-Javadoc)
	 * @see essai.IGrille#setNb_lignes(int)
	 */
	@Override
	public void setNb_lignes(int nb_lignes) {
		this.nb_lignes = nb_lignes;
	}

	/* (non-Javadoc)
	 * @see essai.IGrille#getLstBateau()
	 */
	@Override
	public List<IBateau> getLstBateau() {
		return lstBateau;
	}

	/* (non-Javadoc)
	 * @see essai.IGrille#setLstBateau(java.util.List)
	 */
	@Override
	public void setLstBateau(List<IBateau> lstBateau) {
		this.lstBateau = lstBateau;
	}
	
	/* (non-Javadoc)
	 * @see essai.IGrille#addBateau(essai.IBateau)
	 */
	@Override
	public void addBateau (IBateau pBateau)
	{
		lstBateau.add(pBateau);
	}
	
	
	

}
