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
    private Client parrain; //
	
	@OneToMany(mappedBy = "client", cascade = {CascadeType.ALL})
	private Set<Facture> factures = new HashSet <Facture>();
	
	@OneToMany(mappedBy = "client", cascade = {CascadeType.ALL})
	private Set<Reservation> reservations = new HashSet <Reservation>();
 
	
	//ef
	public Client(){}
	
	public Client(Integer id, int version, String nom_client,
			String prenom_client, String adresse_rue_client, String tel_client,
			int age, Ville ville, Operateur operateur, Client parrain) {
		super();
		this.id = id;
		this.version = version;
		this.nom_client = nom_client;
		this.prenom_client = prenom_client;
		this.adresse_rue_client = adresse_rue_client;
		this.tel_client = tel_client;
		this.age = age;
		this.ville = ville;
		this.operateur = operateur;
		this.parrain = parrain;
	}

	
	public String toString ()
	{
		return String.format("[%s,%s,%s,%s,%s,%d,%s]",getNom_client(), getPrenom_client(), getAdresse_rue_client(), getTel_client(), getAge(), getVille().toString());
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

	public String getNom_client() {
		return nom_client;
	}

	public void setNom_client(String nom_client) {
		this.nom_client = nom_client;
	}
	
	public String getPrenom_client() {
		return prenom_client;
	}

	public void setPrenom_client(String prenom_client) {
		this.prenom_client = prenom_client;
	}
	
	public String getAdresse_rue_client() {
		return adresse_rue_client;
	}

	public void setAdresse_rue_client(String adresse_rue_client) {
		this.adresse_rue_client = adresse_rue_client;
	}
	
	public String getTel_client() {
		return tel_client;
	}

	public void setTel_client(String tel_client) {
		this.tel_client = tel_client;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public Operateur getOperateur() {
		return operateur;
	}

	public void setOperateur(Operateur operateur) {
		this.operateur = operateur;
	}

	public Client getParrain() {
		return parrain;
	}

	public void setParrain(Client parrain) {
		this.parrain = parrain;
	}

	public Set<Facture> getFactures() {
		return factures;
	}
	
	public void addFacture(Facture facture){
		factures.add(facture);
	}

	public Set<Reservation> getReservations() {
		return reservations;
	}
	
	public void addReservation(Reservation reservation){
		reservations.add(reservation);
	}

	
}
