package test;

public interface IVoiture {
	
	public abstract String getMarque();

	public abstract void setMarque(String marque);

	public abstract String getNom();

	public abstract void setNom(String nom);

	public abstract IPersonne getProprio();

	public abstract void setProprio(IPersonne proprio);

	public abstract String toString();

}
