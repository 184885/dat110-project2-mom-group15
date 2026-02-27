package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	// message sent from client to subscribe on a topic 

    public SubscribeMsg(String user, String topic) {

    }

	// TODO:
	// Implement object variables - a topic is required
    private String topic;
	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
		
    public SubscribeMsg(String topic) {
    	this.topic = topic;
    }
    
    public String getTopic() {
    	return this.topic;
    }
    
    public void setTopic(String topic) {
    	this.topic = topic;
    }

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " subscribes to topic: " + topic;
	}
    
    
}
