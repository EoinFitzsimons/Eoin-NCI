/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworldwebservice;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;

/**
 *
 * @author eoin0
 */
@Path("library")
public class Library {

    ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
        Book book1 = new Book("isbn1", "title1", "author1", "year1");
        books.add(book1);
        Book book2 = new Book("isbn2", "title2", "author2", "year2");
        books.add(book2);
        Book book3 = new Book("isbn3", "title3", "author3", "year3");
        books.add(book3);
        Book book4 = new Book("isbn4", "title4", "author4", "year4");
        books.add(book4);
    }

    @GET
    @Path("/books/{isbn}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getBook_ISBN(@PathParam("isbn") String isbn) {
        int i;
        for (i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if (b.getISBN().equals(isbn)) {
                return "Title:" + b.getTitle() + " Author:" + b.getAuthor() + " Year:" + b.getYear();
            }
        }
        return "not found";
    }

    @GET
    @Path("/books/{title}/{year}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getBook_Title_Year(@PathParam("title") String title, @PathParam("year") String year) {
        int i;
        for (i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if (b.getTitle().equals(title) && b.getYear().equals(year)) {
                return "ISBN:" + b.getISBN() + " Author:" + b.getAuthor() + " Year:" + b.getYear();
            }
        }
        return "not found";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getBook_Query(@QueryParam("isbn") String isbn, @QueryParam("title") String title, @QueryParam("year") String year) {
        if (isbn != null) {
            int i;
            for (i = 0; i < books.size(); i++) {
                Book b = books.get(i);
                if (b.getISBN().equals(isbn)) {
                    return "Title:" + b.getTitle() + " Author:" + b.getAuthor() + " Year:" + b.getYear();
                }
            }
            return "not found";
        } else {
            int i;
            for (i = 0; i < books.size(); i++) {
                Book b = books.get(i);
                if (b.getTitle().equals(title) && b.getYear().equals(year)) {
                    return "ISBN:" + b.getISBN() + " Author:" + b.getAuthor() + " Year:" + b.getYear();
                }
            }
            return "not found";
        }
    }
}
