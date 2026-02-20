package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	// message sent from client to subscribe on a topic 

	private String topic;

    public SubscribeMsg(String user, String topic) {
		super(MessageType.SUBSCRIBE, user);
		this.topic = topic;
    }

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String newTopic) {
		this.topic = newTopic;
	}

	@Override
	public String toString() {
		return "Message [type=" + getType() + ", user=" + getUser() + ", topic=" + getTopic() + "]";
	}

	// TODO:
	// Implement object variables - a topic is required

	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
		
}
