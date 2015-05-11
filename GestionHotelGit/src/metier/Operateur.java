package metier;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

public class Operateur {
	
	@Id
	@Column(name = "OPERATEUR_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "VERSION", nullable = false)
	@Version
	private int version;

	@Column(name = "NOM_OPERATEUR", length = 30, nullable = false, unique = true)
	private String nom_operateur;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade = { CascadeType.PERSIST })
    @JoinColumn(name = "operateur_id", nullable = false) 
    private Operateur chef;

	
	public Operateur(){
		
	}
	
	public Operateur(Integer id, int version, String nom_operateur,
			Operateur chef) {
		super();
		this.id = id;
		this.version = version;
		this.nom_operateur = nom_operateur;
		this.chef = chef;
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

	public String getNom_operateur() {
		return nom_operateur;
	}

	public void setNom_operateur(String nom_operateur) {
		this.nom_operateur = nom_operateur;
	}

	public Operateur getChef() {
		return chef;
	}

	public void setChef(Operateur chef) {
		this.chef = chef;
	}

	
}
