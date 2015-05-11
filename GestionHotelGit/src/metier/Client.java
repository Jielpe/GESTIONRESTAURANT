package metier;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "Client")
public class Client {
	
	@Id
	@Column(name = "CLIENT_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "VERSION", nullable = false)
	@Version
	private int version;

	@Column(name = "NOM_CLIENT", length = 30, nullable = false, unique = true)
	private String nom_client;
	
	@Column(name = "PRENOM_CLIENT", length = 30, nullable = false, unique = true)
	private String prenom_client;
	
	@Column(name = "ADRESSE_RUE_CLIENT", length = 30, nullable = false, unique = true)
	private String adresse_rue_client;
	
	@Column(name = "TEL_CLIENT", length = 30, nullable = false, unique = true)
	private String tel_client;
	
	@Column(name = "AGE", length = 30, nullable = false, unique = true)
	private int age;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade = { CascadeType.PERSIST })
    @JoinColumn(name = "ville_id", nullable = false) 
    private Ville ville;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade = { CascadeType.PERSIST })
    @JoinColumn(name = "operateur_id", nullable = false) 
    private Operateur operateur;
	
	@OneToOne(mappedBy = "parrain", fetch=FetchType.LAZY) 
    private Client parrain; 
 
	
	
	public Pays(){}
	
	public Pays ( String pNom_pays )
	{
		super();
		setNom_pays( pNom_pays );
	}
	
	public String toString ()
	{
		return String.format("[%s]", getNom_pays());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getNom_pays() {
		return nom_pays;
	}

	public void setNom_pays(String nom_pays) {
		this.nom_pays = nom_pays;
	}

}
