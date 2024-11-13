/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package com.mycompany.helloworldwebservice;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorldResource {

    @GET
    @Path("/txt")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello, World from Web Service!";
    }
    
    // This method is called if XML is request
   @GET
   @Path("/xml")
   @Produces(MediaType.TEXT_XML)
   public String sayXMLHello() {
	return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + 		        "</hello>";
   }
   
      // This method is called if HTML is request
   @GET
   @Path("/html")
   @Produces(MediaType.TEXT_HTML)
   public String sayHtmlHello() {
	return "<html> " + "<title>" + "Hello Jersey" + "</title>"
	+ "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
   }
   
   @Path("/{name}")
   @GET
   @Produces(MediaType.TEXT_PLAIN)
   public String sayPlainTextHello (@PathParam("name") String name) 
   {
     return "Hello " + name;
   }



}
