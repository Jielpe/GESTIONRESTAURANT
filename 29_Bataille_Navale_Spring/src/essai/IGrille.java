package essai;

import java.util.List;

public interface IGrille {

	public abstract String toString();

	public abstract int getNb_colonnes();

	public abstract void setNb_colonnes(int nb_colonnes);

	public abstract int getNb_lignes();

	public abstract void setNb_lignes(int nb_lignes);

	public abstract List<IBateau> getLstBateau();

	public abstract void setLstBateau(List<IBateau> lstBateau);

	public abstract void addBateau(IBateau pBateau);

}