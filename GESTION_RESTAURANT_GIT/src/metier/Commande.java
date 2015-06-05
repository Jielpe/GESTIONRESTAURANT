package metier;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


public class Commande implements ICommande {

	@Id
	@Column(name = "IDCOMMANDE", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

	@Column(name = "PRIX")
	protected float prix;

	@Column(name = "TYPE")
	protected Type type;

	@ManyToMany(cascade = { CascadeType.PERSIST })
	@JoinTable(name = "commande_assiette", joinColumns = @JoinColumn(name = "IDCOMMANDE"), inverseJoinColumns = @JoinColumn(name = "IDASSIETTE"))
	private Set<Assiette> lstAssiette = new HashSet<Assiette>();

	public Commande() {
		super();
	}

	public Commande(String id, float prix, Type type) {
		super();
		this.id = id;
		this.prix = prix;
		this.type = type;
	}

	/* (non-Javadoc)
	 * @see metier.ICommande#toString()
	 */

	@Override
	public String toString() {
		return "Commande [id=" + id + ", lstAssiette=" + lstAssiette
				+ ", prix=" + prix + ", type=" + type + "]";
	}

	protected float calculPrix() {
		float somme = 0;
		for (IAssiette current : lstAssiette) {
			somme = somme + current.getPrix();
		}
		return somme;
	}

	/* (non-Javadoc)
	 * @see metier.ICommande#getId()
	 */
	@Override
	public String getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see metier.ICommande#setId(java.lang.String)
	 */
	@Override
	public void setId(String id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see metier.ICommande#getLstAssiette()
	 */
	@Override
	public Set<Assiette> getLstAssiette() {
		return lstAssiette;
	}

	/* (non-Javadoc)
	 * @see metier.ICommande#setLstAssiette(java.util.Set)
	 */
	@Override
	public void setLstAssiette(Set<Assiette> lstAssiette) {
		this.lstAssiette = lstAssiette;
	}

	/* (non-Javadoc)
	 * @see metier.ICommande#getPrix()
	 */
	@Override
	public float getPrix() {
		return prix;
	}

	/* (non-Javadoc)
	 * @see metier.ICommande#setPrix(float)
	 */
	@Override
	public void setPrix(float prix) {
		this.prix = prix;
	}

	/* (non-Javadoc)
	 * @see metier.ICommande#getType()
	 */
	@Override
	public Type getType() {
		return type;
	}

	/* (non-Javadoc)
	 * @see metier.ICommande#setType(metier.Type)
	 */
	@Override
	public void setType(Type type) {
		this.type = type;
	}

}