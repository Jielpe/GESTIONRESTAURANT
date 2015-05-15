package metier;

import java.util.Date;

public interface IMessage {

	public abstract Date getDateMessage();

	public abstract void setDateMessage(Date dateMessage);

	public abstract String getTxtMessage();

	public abstract void setTxtMessage(String txtMessage);

	public abstract String toString();
	
	public void setAll(Date datemessage, String txtMessage);

}