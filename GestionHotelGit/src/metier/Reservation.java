package metier;

import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Version;

import entities.PartiPolitique;

@Entity
@Table(name="Reservation")
public class Reservation {
	
	@Id
	@Column(name = "RESERVATION_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "VERSION", nullable = false)
	@Version
	private int version;
	
	@Column( name = "DATE_DEB_RESERVATION", nullable = false )
	private SimpleDateFormat sdf;
	
	@Column ( name = "NBNUITS_RESERVATION", nullable = false )
	private byte nbnuits_reservation;
	
	@ManyToOne( fetch = FetchType.LAZY, cascade={CascadeType.PERSIST} )
	@JoinColumn(name = "client_id", nullable = false)
    private Client client;

}
