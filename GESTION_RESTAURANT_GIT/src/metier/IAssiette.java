package metier;

public interface IAssiette {

	public abstract String toString();

	public abstract String getId();

	public abstract void setId(String id);

	public abstract String getNom();

	public abstract void setNom(String nom);

	public abstract double getPrix();

	public abstract void setPrix(double prix);

	public abstract Type getType();

	public abstract void setType(Type type);

}