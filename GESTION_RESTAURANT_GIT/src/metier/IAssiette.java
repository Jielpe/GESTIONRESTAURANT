package metier;

public interface IAssiette {

	public abstract String toString();

	public abstract String getId();

	public abstract void setId(String id);

	public abstract String getNom();

	public abstract void setNom(String nom);

	public abstract float getPrix();

	public abstract void setPrix(float prix);

	public abstract Type getType();

	public abstract void setType(Type type);

}