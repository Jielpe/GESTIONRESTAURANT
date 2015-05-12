package essai;

import java.util.HashSet;

public interface IBateau {

	public abstract String toString();

	public abstract int getNb_case();

	public abstract void setNb_case(int nb_case);

	public abstract Orientation getOrientation();

	public abstract void setOrientation(Orientation orientation);

	public abstract int getLigne();

	public abstract void setLigne(int ligne);

	public abstract int getColonne();

	public abstract void setColonne(int colonne);
	
	public abstract HashSet<String> getWhere();

}