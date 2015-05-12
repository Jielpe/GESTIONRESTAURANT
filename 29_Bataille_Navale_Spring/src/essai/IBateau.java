package essai;

public interface IBateau {

	public abstract String toString();

	public abstract int getNb_case();

	public abstract void setNb_case(int nb_case);

	public abstract Orientation getOrientation();

	public abstract void setOrientation(Orientation orientation);

	public abstract int getPosX();

	public abstract void setPosX(int posX);

	public abstract int getPosY();

	public abstract void setPosY(int posY);

}