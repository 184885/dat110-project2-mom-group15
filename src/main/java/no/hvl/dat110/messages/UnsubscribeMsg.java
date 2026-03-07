package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	// message sent from client to unsubscribe on a topic 

	// TODO:
	// Implement object variables - a topic is required
    private String topic;
//    private String user;
	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
	
    public UnsubscribeMsg(String user, String topic) {
    	super(MessageType.UNSUBSCRIBE,user);
    	this.topic = topic;
    }
    
    public String getTopic() {
    	return this.topic;
    }
    
    public void setTopic(String topic) {
    	this.topic = topic;
    }
    
//    public String getUser() {
//    	return this.user;
//    }
//    
//    public void setUser(String user) {
//    	this.user = user;
//    }

	@Override
	public String toString() {
		return super.toString() + " user [ " + getUser() + " ] unsubscribes from topic: [ " + topic + " ]";
	}
    
    
}
