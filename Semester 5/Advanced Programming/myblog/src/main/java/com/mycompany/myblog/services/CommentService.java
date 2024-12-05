/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myblog.services;

import com.mycompany.myblog.models.Comment;
import com.mycompany.myblog.models.Message;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eoin0
 */
public class CommentService 
{
    public static List<Message> mlist = new ArrayList<>();
    public static List<Comment> clist = new ArrayList<>();

    public List<Comment> getAllComments() {
        return clist;
    }
    public List<Comment> getAllCommentsByMessage(int MessageID) {
        return mlist.get(MessageID-1).getCommentList();
    }
    
public Comment getCommentByID(int MessageID, int CommentID) {
        return mlist.get(MessageID-1).getCommentList().get(CommentID-1);
    }
}   

    