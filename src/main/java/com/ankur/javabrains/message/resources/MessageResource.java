package com.ankur.javabrains.message.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ankur.javabrains.message.model.Message;
import com.ankur.javabrains.message.service.MessageService;

@Path(value = "messages")
public class MessageResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessage(){
		MessageService service = new MessageService();
		return service.getAllMessages();
	}

}
