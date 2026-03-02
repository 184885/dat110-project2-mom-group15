package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	// message sent from client to subscribe on a topic 

	// TODO:
	// Implement object variables - a topic is required
    private String topic;
    private String user;
	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
		
    public SubscribeMsg(String topic, String user) {
    	this.topic = topic;
    	this.user = user;
    }
    
    public String getTopic() {
    	return this.topic;
    }
    
    public void setTopic(String topic) {
    	this.topic = topic;
    }
    
    public String getUser() {
    	return this.user;
    }
    
    public void setUser(String user) {
    	this.user = user;
    }

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " user " + user + " subscribes to topic: " + topic;
	}
    
    
}
