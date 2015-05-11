package metier;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

public class Ligne_Facture {
	@Id
	@Column(name = "OPERATEUR_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "VERSION", nullable = false)
	@Version
	private int version;

	@Column(name = "NOM_HOTEL", length = 30, nullable = false, unique = true)
	private String nom_hotel;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade = { CascadeType.PERSIST })
    @JoinColumn(name = "ville_id", nullable = false) 
    private Ville ville;
	
	@OneToMany(mappedBy = "hotel", cascade = { CascadeType.ALL }) 
    private Set<Reservation> reservations = new HashSet<Reservation>(); 
	
	@OneToMany(mappedBy = "hotel", cascade = { CascadeType.ALL }) 
    private Set<Facture> factures = new HashSet<Facture>();

	
	public Hotel(){
		
	}
	
	public Hotel(Integer id, int version, String nom_hotel, Ville ville) {
		super();
		this.id = id;
		this.version = version;
		this.nom_hotel = nom_hotel;
		this.ville = ville;
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

	public String getNom_hotel() {
		return nom_hotel;
	}

	public void setNom_hotel(String nom_hotel) {
		this.nom_hotel = nom_hotel;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public Set<Reservation> getReservations() {
		return reservations;
	}
	
	public void addReservation(Reservation reservation){
		reservations.add(reservation);
	}

	public Set<Facture> getFactures() {
		return factures;
	} 
	
	public void addFacture(Facture facture){
		factures.add(facture);
	}
}
