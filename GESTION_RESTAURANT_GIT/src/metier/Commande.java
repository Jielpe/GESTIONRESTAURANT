package metier;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
	
	@Column(name = "STATUT")
	protected Statut statut;

	@ManyToMany(cascade = { CascadeType.MERGE })
	@JoinTable(name = "commande_assiette", joinColumns = @JoinColumn(name = "IDCOMMANDE"), inverseJoinColumns = @JoinColumn(name = "IDASSIETTE"))
	private List<Assiette> lstAssiette = new ArrayList<Assiette>();

	public Commande() {
		super();
	}

	public Commande(List<Assiette> lstAssiette) {
		super();
	
		this.lstAssiette=lstAssiette;
		this.statut=statut.commandée;
	}

	/* (non-Javadoc)
	 * @see metier.ICommande#toString()
	 */

	@Override
	public String toString() {
		return "Commande [id=" + id + ", lstAssiette=" + lstAssiette
				+ ", prix=" + prix + "]";
	}
	
	public double calculPrix(){
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
	public List<Assiette> getLstAssiette() {
		return lstAssiette;
	}

	/* (non-Javadoc)
	 * @see metier.ICommande#setLstAssiette(java.util.Set)
	 */
	@Override
	public void setLstAssiette(List<Assiette> lstAssiette) {
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
