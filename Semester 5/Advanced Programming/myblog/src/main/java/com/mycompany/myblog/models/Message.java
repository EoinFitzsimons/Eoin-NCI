/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myblog.models;

import java.util.Date;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Message {
    private int id;
    private String message;
    private String author;
    private Date created;
    private List<Comment> commentList = new ArrayList<>();

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }
    
    public Message()
    {}

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }

    public Date getCreated() {
        return created;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
    
    public Message(int id, String message, String author, Date created) {
        this.id = id;
        this.message = message;
        this.author = author;
        this.created = created;
    }
    
        public Message(int id, String message, String author, List<Comment> commentList) {
        this.id = id;
        this.message = message;
        this.author = author;
        this.commentList = commentList;
    }

    public String printMessage() {
        return "Message: " + message + " Author:" + author;
    }

    
}
