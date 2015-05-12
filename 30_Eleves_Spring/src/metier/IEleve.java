package metier;

public interface IEleve {

	public abstract String toString();

	public abstract String getNom();

	public abstract void setNom(String nom);

	public abstract String getPrenom();

	public abstract void setPrenom(String prenom);

	public abstract void setNote(float note);

	public abstract float getNote();

}