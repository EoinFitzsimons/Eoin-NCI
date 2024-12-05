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
 * @author AbdulRazzaq
 */
public class MessageService {

    public static List<Message> list = new ArrayList<>();
    public static List<Comment> commentList = new ArrayList<>();
    public static boolean init = true;

    public MessageService() {
        if (init) {
            Comment cmt1 = new Comment(1, "cmt1");
            Comment cmt2 = new Comment(2, "cmt2");
            Comment cmt3 = new Comment(3, "cmt3");
            commentList.add(cmt1);
            commentList.add(cmt2);
            commentList.add(cmt3);
            Message msg1 = new Message(0, "msg1", "aut1", commentList);
            Message msg2 = new Message(1, "msg2", "aut2", commentList);
            Message msg3 = new Message(2, "msg3", "aut3", commentList);
            Message msg4 = new Message(3, "msg4", "aut4", commentList);
            Message msg5 = new Message(4, "msg5", "aut5", commentList);
            Message msg6 = new Message(5, "msg6", "aut6", commentList);
            list.add(msg1);
            list.add(msg2);
            list.add(msg3);
            list.add(msg4);
            list.add(msg5);
            list.add(msg6);
            init = false;
        }
    }
public List<Message> getAllMessages() {
        return list;
    }

    public Message getMessage(int id) {
        return list.get(id - 1);
    }

    public Message createMessage(Message msg) {
        msg.setId(list.size() + 1);
        list.add(msg);
        System.out.println("new Message resource created with path: /planets/" + String.valueOf(msg.getId()));
        return msg;
    }

}
