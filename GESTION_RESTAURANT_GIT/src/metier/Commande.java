package metier;

import java.util.ArrayList;
import java.util.List;

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

	/**
	 * Constructeurs
	 */
	public Commande() {
		this.statut = Statut.commandee;
	}

	public Commande(List<Assiette> lstAssiette) {
		super();

		this.lstAssiette = lstAssiette;
		this.statut = Statut.commandee;
	}

	/**
	 * Permet d'afficher les attributs d'une commande
	 */

	@Override
	public String toString() {
		return "Commande n°" + id + " : " + lstAssiette
				+ " : " + prix + "€";
	}

	/**
	 * Calcul le prix d'une commande
	 * 
	 * @return prix
	 */
	public double calculPrix() {
		double somme = 0;
		for (IAssiette current : lstAssiette) {
			somme = somme + current.getPrix();
		}
		return somme;
	}

	/**
	 * Permet de définir les attributs de la commande
	 * 
	 */
	public void setAll(List<Assiette> lstAssiette) {
		this.lstAssiette = lstAssiette;
		this.prix = calculPrix();
	}

	/**
	 * Getters et Setters
	 */
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public List<Assiette> getLstAssiette() {
		return lstAssiette;
	}

	@Override
	public void setLstAssiette(List<Assiette> lstAssiette) {
		this.lstAssiette = lstAssiette;
	}

	@Override
	public double getPrix() {
		return prix;
	}

	@Override
	public void setPrix(double prix) {

		this.prix = prix;
	}

}
