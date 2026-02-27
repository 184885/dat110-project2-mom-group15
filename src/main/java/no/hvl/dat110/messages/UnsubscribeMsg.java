package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	// message sent from client to unsubscribe on a topic 

    public UnsubscribeMsg(String user, String topic) {

    }

	// TODO:
	// Implement object variables - a topic is required
    private String topic;
	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
	
    public UnsubscribeMsg(String topic) {
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
		return super.toString() + " unsubscribes from topic: " + topic;
	}
    
    
}
