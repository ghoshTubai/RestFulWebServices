package com.ankur.javabrains.message.service;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.ankur.javabrains.message.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages(){
		List<Message> messageList = Arrays.asList(new Message(1, "Hello Jersey", "Ankur"),
												new Message(2L,"Hello World","Ankur"));
		return messageList;
	}

}
