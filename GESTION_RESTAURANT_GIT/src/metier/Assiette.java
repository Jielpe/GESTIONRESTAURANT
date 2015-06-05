package metier;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Assiette implements IAssiette {

	@Id
	@Column(name = "IDASSIETTE", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

	@Column(name = "NOM")
	protected String nom;

	@Column(name = "PRIX")
	protected float prix;

	@Column(name = "TYPE")
	protected Type type;

	@ManyToMany(mappedBy = "lstAssiette")
	private Set<Commande> lstCommande = new HashSet<Commande>();

	public Assiette() {
		super();
	}

	public Assiette(String nom, float prix, Type type) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.type = type;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see metier.IAssiette#toString()
	 */

	@Override
	public String toString() {
		return "Assiette [id=" + id + ", nom=" + nom + ", prix=" + prix
				+ ", type=" + type + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see metier.IAssiette#getId()
	 */
	@Override
	public String getId() {
		return id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see metier.IAssiette#setId(java.lang.String)
	 */
	@Override
	public void setId(String id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see metier.IAssiette#getNom()
	 */
	@Override
	public String getNom() {
		return nom;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see metier.IAssiette#setNom(java.lang.String)
	 */
	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see metier.IAssiette#getPrix()
	 */
	@Override
	public float getPrix() {
		return prix;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see metier.IAssiette#setPrix(float)
	 */
	@Override
	public void setPrix(float prix) {
		this.prix = prix;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see metier.IAssiette#getType()
	 */
	@Override
	public Type getType() {
		return type;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see metier.IAssiette#setType(metier.Type)
	 */
	@Override
	public void setType(Type type) {
		this.type = type;
	}

}
