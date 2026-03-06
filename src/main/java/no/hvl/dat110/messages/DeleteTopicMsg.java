package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

	// message sent from client to create topic on the broker

	// TODO:
	// Implement object variables - a topic is required
    private String user;
	private String topic;
	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text

    public DeleteTopicMsg(String user, String topic) {
    	this.user = user;
    	this.topic = topic;
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
		return super.toString() + " deleted topic: [ " + topic + " ]";
	}
    
    
}
