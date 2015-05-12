package essai;

import java.util.HashSet;

public class Bateau implements IBateau {
	
	private int nb_case;
	private Orientation orientation;
	private int ligne;
	private int colonne;
	
	public Bateau() {
	
	}

	public Bateau(int nb_case, Orientation orientation, int ligne, int colonne) {
		super();
		this.nb_case = nb_case;
		this.orientation = orientation;
		this.ligne = ligne;
		this.colonne = colonne;
	}
	
	/* (non-Javadoc)
	 * @see essai.IBateau#toString()
	 */
	@Override
	public String toString() {
		return String.format("[%d,%s,%d,%d]", getNb_case(), getOrientation(), getLigne(), getColonne());
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
	 * @see essai.IBateau#getLigne()
	 */
	@Override
	public int getLigne() {
		return ligne;
	}

	/* (non-Javadoc)
	 * @see essai.IBateau#setLigne(int)
	 */
	@Override
	public void setLigne(int ligne) {
		this.ligne = ligne;
	}

	/* (non-Javadoc)
	 * @see essai.IBateau#getColonne()
	 */
	@Override
	public int getColonne() {
		return colonne;
	}

	/* (non-Javadoc)
	 * @see essai.IBateau#setColonne(int)
	 */
	@Override
	public void setColonne(int colonne) {
		this.colonne = colonne;
	}

	@Override
	public HashSet<String> getWhere() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
