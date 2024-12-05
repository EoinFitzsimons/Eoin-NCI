/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myblog.resources;

import com.mycompany.myblog.models.Message;
import com.mycompany.myblog.services.MessageService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

/**
 *
 * @author AbdulRazzaq
 */
@Path("/messages")
public class MessageResource {
    MessageService messageService = new MessageService();
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getMessagesXML(){
      return  messageService.getAllMessages();
    }
    
    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessagesJSON(){
      return  messageService.getAllMessages();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Message getMessageXML(@PathParam("messageId") int id){
      return  messageService.getMessage(id);
    }
    
    @GET
    @Path("/json/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message getMessageJSON(@PathParam("messageId") int id){
      return  messageService.getMessage(id);
    }
    
    @Path("/{messageID}/comments")
    public CommentResource getCommentsResource() {
	System.out.println("Getting comments subresoruces...");
	return new CommentResource();
    }

    
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public Message postNewMessageJSON(Message msg) 
  {
    return messageService.createMessage(msg);
    
  }
  
  

  @POST
  @Consumes(MediaType.APPLICATION_XML)
  @Produces(MediaType.APPLICATION_XML)
  public Message postNewMessageXML(Message msg) 
  {
    return messageService.createMessage(msg);
    
  }
}
