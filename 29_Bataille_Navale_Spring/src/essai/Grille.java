package essai;

import java.util.List;

public class Grille {
	
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
	
	

	@Override
	public String toString() {
		return "Grille [nb_colonnes=" + nb_colonnes + ", nb_lignes="
				+ nb_lignes + ", lstBateau=" + lstBateau + "]";
	}

	public int getNb_colonnes() {
		return nb_colonnes;
	}

	public void setNb_colonnes(int nb_colonnes) {
		this.nb_colonnes = nb_colonnes;
	}

	public int getNb_lignes() {
		return nb_lignes;
	}

	public void setNb_lignes(int nb_lignes) {
		this.nb_lignes = nb_lignes;
	}

	public List<IBateau> getLstBateau() {
		return lstBateau;
	}

	public void setLstBateau(List<IBateau> lstBateau) {
		this.lstBateau = lstBateau;
	}
	
	public void addBateau (IBateau pBateau)
	{
		lstBateau.add(pBateau);
	}
	
	
	

}
