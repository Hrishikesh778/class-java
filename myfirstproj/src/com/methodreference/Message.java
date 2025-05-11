package com.methodreference;

public class Message {

	Message(String msg) {
		System.out.print(msg);
	}

	public static void main(String[] args) {
		Messageable hello = Message::new;
		hello.getMessage("Hello");
	}
}
