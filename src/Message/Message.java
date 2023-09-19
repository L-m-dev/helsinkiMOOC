package Message;

import java.util.Objects;

public class Message {
	private String sender;
	private String content;
	
	
	public Message(String s, String c) {
		this.sender=s;
		this.content=c;
	}
	
	
	
	
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public int hashCode() {
		return Objects.hash(content, sender);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Message other = (Message) obj;
		return Objects.equals(content, other.content) && Objects.equals(sender, other.sender);
	}
	
	
	
}
