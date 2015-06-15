package metier;

import java.util.Set;

public interface ICommande {

	public abstract String toString();

	public abstract Integer getId();

	public abstract void setId(Integer id);

	public abstract Set<Assiette> getLstAssiette();

	public abstract void setLstAssiette(Set<Assiette> lstAssiette);

	public abstract double getPrix();

	public abstract void setPrix(double prix);

}