package essai;

public class Bateau implements IBateau {
	
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
	
	/* (non-Javadoc)
	 * @see essai.IBateau#toString()
	 */
	@Override
	public String toString() {
		return String.format("[%d,%s,%d,%d", getNb_case(), getOrientation(), getPosX(), getPosY());
	}

	/* (non-Javadoc)
	 * @see essai.IBateau#getNb_case()
	 */
	@Override
	public int getNb_case() {
		return nb_case;
	}

	/* (non-Javadoc)
	 * @see essai.IBateau#setNb_case(int)
	 */
	@Override
	public void setNb_case(int nb_case) {
		this.nb_case = nb_case;
	}

	/* (non-Javadoc)
	 * @see essai.IBateau#getOrientation()
	 */
	@Override
	public Orientation getOrientation() {
		return orientation;
	}

	/* (non-Javadoc)
	 * @see essai.IBateau#setOrientation(essai.Orientation)
	 */
	@Override
	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	/* (non-Javadoc)
	 * @see essai.IBateau#getPosX()
	 */
	@Override
	public int getPosX() {
		return posX;
	}

	/* (non-Javadoc)
	 * @see essai.IBateau#setPosX(int)
	 */
	@Override
	public void setPosX(int posX) {
		this.posX = posX;
	}

	/* (non-Javadoc)
	 * @see essai.IBateau#getPosY()
	 */
	@Override
	public int getPosY() {
		return posY;
	}

	/* (non-Javadoc)
	 * @see essai.IBateau#setPosY(int)
	 */
	@Override
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	

}
