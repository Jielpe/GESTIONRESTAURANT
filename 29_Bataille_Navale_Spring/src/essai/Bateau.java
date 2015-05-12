package essai;

public class Bateau {
	
	private int nb_case;
	private Orientation orientation;
	private int posX;
	private int posY;
	
	public Bateau() {
	
	}

	public Bateau(int nb_case, Orientation orientation, int posX, int posY) {
		super();
		this.nb_case = nb_case;
		this.orientation = orientation;
		this.posX = posX;
		this.posY = posY;
	}
	
	@Override
	public String toString() {
		return String.format("[%d,%s,%d,%d", getNb_case(), getOrientation(), getPosX(), getPosY());
	}

	public int getNb_case() {
		return nb_case;
	}

	public void setNb_case(int nb_case) {
		this.nb_case = nb_case;
	}

	public Orientation getOrientation() {
		return orientation;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	

}
