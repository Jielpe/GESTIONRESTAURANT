package metier;

import java.util.Set;

public interface ICommande {

	public abstract String toString();

	public abstract String getId();

	public abstract void setId(String id);

	public abstract Set<Assiette> getLstAssiette();

	public abstract void setLstAssiette(Set<Assiette> lstAssiette);

	public abstract float getPrix();

	public abstract void setPrix(float prix);

	public abstract Type getType();

	public abstract void setType(Type type);

}