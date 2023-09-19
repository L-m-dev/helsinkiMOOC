package Message;

import java.util.ArrayList;

public class MessagingService {
	ArrayList<Message> messageList;
	
	public MessagingService() {
		messageList = new ArrayList<>();
	}
	
	public void add(Message message) {
		if(message.getContent().length() <= 280) {
			messageList.add(message);
		}
		
	}
	
	public ArrayList<Message> getMessages(){
		
	return this.messageList;	
	}
	
	@Override
	public String toString() {
		String built = "";
		if(this.messageList.size()>1) {
			for(int i=0; i<messageList.size(); i++) {
				built += " "+messageList.get(i).getContent();
			}
		}
		return built;
	}
}
