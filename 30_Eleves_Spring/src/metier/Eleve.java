package metier;

public class Eleve implements IEleve {
	
	private String nom;
	private String prenom;
	private float note;
	
	/* (non-Javadoc)
	 * @see metier.IEleve#toString()
	 */
	@Override
	public String toString()
    {
        StringBuilder strbldr = new StringBuilder();
        strbldr.append("\tNom : "+this.nom+"\n").append("\tPrénom : "+this.prenom+"\n").append("\tNote : "+this.note+"\n");
        String str = strbldr.toString();
        return str;
    }
	
	public Eleve() {}

	public Eleve(String nom, String prenom, float note) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.note = note;
	}


	/* (non-Javadoc)
	 * @see metier.IEleve#getNom()
	 */
	@Override
	public String getNom() {
		return nom;
	}

	/* (non-Javadoc)
	 * @see metier.IEleve#setNom(java.lang.String)
	 */
	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}

	/* (non-Javadoc)
	 * @see metier.IEleve#getPrenom()
	 */
	@Override
	public String getPrenom() {
		return prenom;
	}

	/* (non-Javadoc)
	 * @see metier.IEleve#setPrenom(java.lang.String)
	 */
	@Override
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/* (non-Javadoc)
	 * @see metier.IEleve#setNote(float)
	 */
	@Override
	public void setNote(float note) {
		this.note = note;
	}

	/* (non-Javadoc)
	 * @see metier.IEleve#getNote()
	 */
	@Override
	public float getNote() {
		float res = 0;
		res = this.note;
		return res;
	}

	

}
