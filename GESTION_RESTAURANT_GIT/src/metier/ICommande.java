package metier;

import java.util.List;

public interface ICommande {

	public abstract String toString();

	public abstract Integer getId();

	public abstract void setId(Integer id);

	public abstract List<Assiette> getLstAssiette();

	public abstract void setLstAssiette(List<Assiette> lstAssiette);

	public abstract double getPrix();

	public abstract void setPrix(double prix);

	public void setAll(List<Assiette> lstAssiette);

}