package metier;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "assiette")
public class Assiette implements IAssiette {

	@Id
	@Column(name = "IDASSIETTE", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "NOM")
	protected String nom;

	@Column(name = "PRIX")
	protected double prix;

	@Column(name = "TYPE")
	protected Type type;

	@ManyToMany(mappedBy = "lstAssiette")
	private List<Commande> lstCommande = new ArrayList<Commande>();

	/**
	 * Constructeurs
	 */
	public Assiette() {
		super();
	}

	public Assiette(String nom, double prix, Type type) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.type = type;
	}

	/**
	 * Permet d'afficher les attributs d'une assiette
	 */
	@Override
	public String toString() {
		return "Assiette [id=" + id + ", nom=" + nom + ", prix=" + prix
				+ ", type=" + type + "]";
	}

	/**
	 * Permet de définir les attributs de l'assiette
	 * 
	 */

	public void setAll(String nom, double prix, Type type) {
		this.nom = nom;
		this.prix = prix;
		this.type = type;
	}

	/**
	 * Getters et Setters
	 * 
	 */
	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public double getPrix() {
		return prix;
	}

	@Override
	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public Type getType() {
		return type;
	}

	@Override
	public void setType(Type type) {
		this.type = type;
	}

}
