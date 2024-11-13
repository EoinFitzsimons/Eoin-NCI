package com.mycompany.helloworldwebservice;

import java.util.ArrayList;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/library")
public class Library {
    private ArrayList<Book> list;

    public Library() {
        list = new ArrayList<>(); // Initialize the list to avoid NullPointerException
        Book obj1 = new Book("1", "The First Book", "Eoin Fitzsimons", "2020");
        list.add(obj1);
        Book obj2 = new Book("2", "The Second Book", "Eoin Fitzsimons", "2021");
        list.add(obj2);
        Book obj3 = new Book("3", "The Third Book", "Eoin Fitzsimons", "2022");
        list.add(obj3);
        Book obj4 = new Book("4", "The Fourth Book", "Eoin Fitzsimons", "2023");
        list.add(obj4);
        Book obj5 = new Book("5", "The Fifth Book", "Eoin Fitzsimons", "2024");
        list.add(obj5);
    }

    @GET
    @Path("/books")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Book> getBooks() {
        return list;
    }

    @GET
    @Path("/book/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Book getBookById(@PathParam("id") String id) {
        for (Book book : list) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null; // Return null if not found (handle this appropriately in production code)
    }

    @GET
    @Path("/txt")
    @Produces(MediaType.TEXT_PLAIN)
    public String getBooksAsPlainText() {
        StringBuilder sb = new StringBuilder();
        for (Book book : list) {
            sb.append(book.toString()).append("\n");
        }
        return sb.toString();
    }

    @GET
    @Path("/xml")
    @Produces(MediaType.TEXT_XML)
    public String getBooksAsXML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\"?>");
        sb.append("<books>");
        for (Book book : list) {
            sb.append("<book>");
            sb.append("<id>").append(book.getId()).append("</id>");
            sb.append("<title>").append(book.getTitle()).append("</title>");
            sb.append("<author>").append(book.getAuthor()).append("</author>");
            sb.append("<isbn>").append(book.getIsbn()).append("</isbn>");
            sb.append("</book>");
        }
        sb.append("</books>");
        return sb.toString();
    }

    @GET
    @Path("/html")
    @Produces(MediaType.TEXT_HTML)
    public String getBooksAsHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body><h1>Library Books</h1><ul>");
        for (Book book : list) {
            sb.append("<li>").append(book.toString()).append("</li>");
        }
        sb.append("</ul></body></html>");
        return sb.toString();
    }
}
