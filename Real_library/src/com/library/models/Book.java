package com.library.models;

public class Book {
    private String title;
    private String author;
    private Category category;
    private boolean issued;

    public Book(String title, String author, Category category) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.issued = false;
    }

    public String getTitle() { return title; }
    public boolean isIssued() { return issued; }
    public void setIssued(boolean status) { this.issued = status; }

    @Override
    public String toString() {
        return title + " — " + author + (issued ? " (Issued)" : "");
    }
}
