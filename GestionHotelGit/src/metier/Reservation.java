package metier;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

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
	@Temporal(TemporalType.DATE)
	private Date date_deb_reservation;
	
	@Column ( name = "NBNUITS_RESERVATION", nullable = false )
	private byte nbnuits_reservation;
	
	@ManyToOne( fetch = FetchType.LAZY, cascade={CascadeType.PERSIST} )
	@JoinColumn(name = "client_id", nullable = false)
    private Client client;

	@ManyToOne( fetch = FetchType.LAZY, cascade={CascadeType.PERSIST})
	@JoinColumn(name = "hotel_id", nullable = false)
	private Hotel hotel;
	
	public Reservation () {}

	public Reservation(Date date_deb_reservation, byte nbnuits_reservation,
			Client client, Hotel hotel) {
		super();
		this.date_deb_reservation = date_deb_reservation;
		this.nbnuits_reservation = nbnuits_reservation;
		this.client = client;
		this.hotel = hotel;
	}
	
	public String toString ()
	{
		return String.format("[%s,%d]",new SimpleDateFormat("dd/MM/yyyy")
		.format(getDate_deb_reservation()), getNbnuits_reservation());
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

	public Date getDate_deb_reservation() {
		return date_deb_reservation;
	}

	public void setDate_deb_reservation(Date date_deb_reservation) {
		this.date_deb_reservation = date_deb_reservation;
	}

	public byte getNbnuits_reservation() {
		return nbnuits_reservation;
	}

	public void setNbnuits_reservation(byte nbnuits_reservation) {
		this.nbnuits_reservation = nbnuits_reservation;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	
}
