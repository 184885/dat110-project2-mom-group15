package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 

	private String topic;
	private String message;

	public PublishMsg(String user, String topic, String message) {
		super(MessageType.PUBLISH, user);
		this.topic = topic;
		this.message = message;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String newTopic) {
		this.topic = newTopic;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String newMessage) {
		this.message = newMessage;
	}

	@Override
	public String toString() {
		return "Message [type=" + getType() + ", user=" + getUser() + ", topic=" + getTopic() + ", message=" + getMessage() + "]";
	}

	// TODO:
	// Implement object variables - a topic and a message is required

	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
	
	
}
