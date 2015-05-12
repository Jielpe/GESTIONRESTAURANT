package essai;

import java.util.Set;

public interface IGrille {

	public abstract String toString();

	public abstract int getNb_colonnes();

	public abstract void setNb_colonnes(int nb_colonnes);

	public abstract int getNb_lignes();

	public abstract void setNb_lignes(int nb_lignes);

	public abstract Set<IBateau> getLstBateau();

	public abstract void setLstBateau(Set<IBateau> lstBateau);

	public abstract void addBateau(IBateau pBateau);

}