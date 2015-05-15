package metier;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


@Entity
@Table(name="messages")
public class Message implements IMessage {
	
	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "VERSION", nullable = false)
	@Version
	private int version;
	
	@Column(name = "DATEMESSAGE", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dateMessage;
	
	@Column(name = "TXTMESSAGE", length = 30, nullable = false)
	private String txtMessage;
	
	public Message() {
		super();
	}

	public Message(Date dateMessage, String txtMessage) {
		super();
		this.dateMessage = dateMessage;
		this.txtMessage = txtMessage;
	}
	
	public void setAll(Date dateMessage, String txtMessage){
		this.dateMessage = dateMessage;
		this.txtMessage = txtMessage;
	}

	/* (non-Javadoc)
	 * @see data.IMessage#getDateMessage()
	 */
	@Override
	public Date getDateMessage() {
		return dateMessage;
	}

	/* (non-Javadoc)
	 * @see data.IMessage#setDateMessage(java.util.Date)
	 */
	@Override
	public void setDateMessage(Date dateMessage) {
		this.dateMessage = dateMessage;
	}

	/* (non-Javadoc)
	 * @see data.IMessage#getTxtMessage()
	 */
	@Override
	public String getTxtMessage() {
		return txtMessage;
	}

	/* (non-Javadoc)
	 * @see data.IMessage#setTxtMessage(java.lang.String)
	 */
	@Override
	public void setTxtMessage(String txtMessage) {
		this.txtMessage = txtMessage;
	}
	
	/* (non-Javadoc)
	 * @see data.IMessage#toString()
	 */
	@Override
	public String toString(){
		return String.format("[%s,%s]", new SimpleDateFormat("dd/MM/yyyy").format(getDateMessage()), getTxtMessage());		
	}
	
}
