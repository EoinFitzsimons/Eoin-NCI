/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myblog.resources;

import com.mycompany.myblog.models.Comment;
import com.mycompany.myblog.services.CommentService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

/**
 *
 * @author eoin0
 */
@Path("/comments")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class CommentResource {

    private CommentService CommentService = new CommentService();

    @GET
    public List<Comment> getComments(@PathParam("messageID") int m_id) {
        System.out.println("getAllCommentsForMessage..." + m_id);
        return CommentService.getAllCommentsByMessage(m_id);
    }
	
    @GET
    @Path("/{commentID}")
    public Comment getComment(@PathParam("commentID") int c_id, @PathParam("messageID") int m_id) {
        System.out.println("getCommentByID..." + c_id);
        return CommentService.getCommentByID(m_id, c_id);
    }
}