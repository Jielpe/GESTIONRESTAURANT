package metier;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "commande")
public class Commande implements ICommande {

	@Id
	@Column(name = "IDCOMMANDE", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "PRIX")
	protected double prix;

	@ManyToMany(cascade = { CascadeType.PERSIST })
	@JoinTable(name = "commande_assiette", joinColumns = @JoinColumn(name = "IDCOMMANDE"), inverseJoinColumns = @JoinColumn(name = "IDASSIETTE"))
	private Set<Assiette> lstAssiette = new HashSet<Assiette>();

	public Commande() {
		super();
	}

	public Commande(Set<Assiette> lstAssiette) {
		super();
		this.lstAssiette=lstAssiette;
	}

	/* (non-Javadoc)
	 * @see metier.ICommande#toString()
	 */

	@Override
	public String toString() {
		return "Commande [id=" + id + ", lstAssiette=" + lstAssiette
				+ ", prix=" + prix + "]";
	}

	protected double calculPrix() {
		double somme = 0;
		for (IAssiette current : lstAssiette) {
			somme = somme + current.getPrix();
		}
		return somme;
	}

	/* (non-Javadoc)
	 * @see metier.ICommande#getId()
	 */
	@Override
	public Integer getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see metier.ICommande#setId(java.lang.String)
	 */
	@Override
	public void setId(Integer id) {
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
	public double getPrix() {
		return prix;
	}

	/* (non-Javadoc)
	 * @see metier.ICommande#setPrix(double)
	 */
	@Override
	public void setPrix(double prix) {
		this.prix = prix;
	}



}
