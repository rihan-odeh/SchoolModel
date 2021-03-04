/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps.school.model;


import java.util.concurrent.atomic.AtomicInteger;

import org.json.simple.*;

/**
 * Book class is design for a book, with name, author, number of pages, and year of release
 *
 * @author ro1
 */
public class Book implements JsonInterface {
    private static AtomicInteger id = new AtomicInteger();
    private String name;
    private String authorName;
    private int numberOfPages;
    private int releaseYear;

    public Book(String name, String authorName, int numberOfPages, int releaseYear) {
        this.id.incrementAndGet();
        this.name = name;
        this.authorName = authorName;
        this.numberOfPages = numberOfPages;
        this.releaseYear = releaseYear;
    }

    public Book(Object name, Object authorName, Object number_of_pages, Object release_year) {
        this.name = (String) name;
        this.authorName = (String) authorName;
        this.numberOfPages = (int) number_of_pages;
        this.releaseYear = (int) release_year;
    }

    public long getId() {
        return id.get();
    }

    public void setId() {
        this.id.incrementAndGet();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", releaseYear=" + releaseYear +
                '}';
    }

    public JSONObject toJson() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Id", id);
        jsonObject.put("name", name);
        jsonObject.put("Author's name", authorName);
        jsonObject.put("Number Of pages", numberOfPages);
        jsonObject.put("Release Year", releaseYear);
        return jsonObject;
    }

    public Book fromJson(JSONObject jsonObject) {
        return new Book(jsonObject.get("name"), jsonObject.get("Author's name"), jsonObject.get("Number Of pages"), jsonObject.get("Release Year"));
    }

    /* public String toJson(){
         return JSONValue.toJSONString(this);
     }*/
//    public JSONObject toJson() {
//
//        jason.put("Id", getId());
//        jason.put("Author's name", getAuthorName());
//        jason.put("Name", getName());
//        jason.put("Number Of Pages", getNumberOfPages());
//        jason.put("Release year", getReleaseYear());
//
//        return jason;
//    }
//
//    public Book fromJson() {
//
//        return (Book) org.json.JSONObject.stringToValue(jason.toJSONString());
//
//    }
    /*
    * constructor that assigns values to the attributes
    * @param id
    * @param name
    * @param AuthorName
    * @param numberOfPages
    * @param releaseYear 
    *
    public Book( long id, String name, String AuthorName, int numberOfPages, int releaseYear ){
        this.id= id;
        this.name =name;
        this.authorName =AuthorName; 
        this.numberOfPages = numberOfPages; 
        this.releaseYear = releaseYear;
    }
    /**
     * setters
     *
    /**
     * 
     * @param id and assigns it to id
     *
    public void setId(long id){
        this.id= id; 
    }
    /**
     * 
     * @param Name to be the name of the book
     *
    public void setName(String Name){
        this.name =Name; 
        
    }
    /**
     * 
     * @param authorName assigns name to the author's name
     *
    public void setAuthorName(String authorName){
        this.authorName= authorName;
    }
    /**
     * 
     * @param numberOfPages to be the number of pages of this book
     *
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
    /**
     * 
     * @param releaseYear to be the year this book was published
     *
    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }
    /**
     * getters
     *
    /**
     * 
     * @return id of this book
     *
    public long getId(){
        return this.id; 
    }
    /**
     * 
     * @return name of this book
     *
    public String getName(){
        return this.name;
    }
    /**
     * 
     * @return author's name
     *
    public String getAuthorName(){
        return this.authorName;
    }
    /**
     * 
     * @return number of pages in this book
     *
    public int getNumberOfPages(){
        return this.numberOfPages;
    }
    /**
     * 
     * @return the year that the book was published in
     *
    public int getYearOfRelease(){
        return this.releaseYear;
    }
    /**
     * 
     * @return String representation of book
     *
    public String toString (){
        return this.name +" was published by "+ this.authorName +" , has pages of: " +this.numberOfPages + "and was publishd in: "+  this.releaseYear;
    }*/
}
