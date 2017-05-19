package medrex.commons.vo.messages;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "MessagesRecord")
public class MessagesRecord implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4189520759438017374L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "senderId")
	private int senderId;
	@Column(name = "receiverId")
	private int receiverId;
	@Column(name = "subject")
	private String subject;
	@Column(name = "message")
	@Type(type = "text")
	private String message;
	@Column(name = "type")
	private String type;
	@Column(name = "timeRecord")
	private Date timeRecord;
	@Column(name = "isNew")
	private boolean isNew;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getSenderId() {
		return senderId;
	}

	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}

	public int getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(int receiverId) {
		this.receiverId = receiverId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getTimeRecord() {
		return timeRecord;
	}

	public void setTimeRecord(Date timeRecord) {
		this.timeRecord = timeRecord;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

}
