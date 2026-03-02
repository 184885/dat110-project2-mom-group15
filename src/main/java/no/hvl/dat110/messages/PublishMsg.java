package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 

	public PublishMsg(String user, String topic, String message) {

	}

	// TODO:
	// Implement object variables - a topic and a message is required
	private String topic;
	private String message;
	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
	
	public PublishMsg(String topic, String message) {
		this.topic = topic;
		this.message = message;
	}
	
	public String getTopic(){
		return this.topic;
	}
	
	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " publishes message on topic: " + topic;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		//Get the message to 
		return this.message;
	}
}
