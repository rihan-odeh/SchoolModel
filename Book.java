/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;

/**
 * Book class is design for a book, with name, author, number of pages, and year of release
 * @author ro1
 */
class Book { 
   private long id;
   private String name;
    private String authorName;
   private int numberOfPages;
   private int releaseYear;
   /**
    * constructor that assigns values to the attributes
    * @param id
    * @param name
    * @param AuthorName
    * @param numberOfPages
    * @param releaseYear 
    */
    public Book( long id, String name, String AuthorName, int numberOfPages, int releaseYear ){
        this.id= id;
        this.name =name;
        this.authorName =AuthorName; 
        this.numberOfPages = numberOfPages; 
        this.releaseYear = releaseYear;
    }
    /**
     * setters
     */
    /**
     * 
     * @param id and assigns it to id
     */
    public void setId(long id){
        this.id= id; 
    }
    /**
     * 
     * @param Name to be the name of the book
     */
    public void setName(String Name){
        this.name =Name; 
        
    }
    /**
     * 
     * @param AuthorName assigns name to the author's name
     */
    public void setAuthorName(String AuthorName){
        this.authorName= AuthorName;
    }
    /**
     * 
     * @param numberOfPages to be the number of pages of this book
     */
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
    /**
     * 
     * @param ReleaseYear to be the year this book was published
     */
    public void setReleaseYear(int ReleaseYear){
        this.releaseYear = ReleaseYear;
    }
    /**
     * getters
     */
    /**
     * 
     * @return id of this book
     */
    public long getId(){
        return this.id; 
    }
    /**
     * 
     * @return name of this book
     */
    public String getName(){
        return this.name;
    }
    /**
     * 
     * @return author's name
     */
    public String getAuthorName(){
        return this.authorName;
    }
    /**
     * 
     * @return number of pages in this book
     */
    public int getNumberOfPages(){
        return this.numberOfPages;
    }
    /**
     * 
     * @return the year that the book was published in
     */
    public int getYearOfRelease(){
        return this.releaseYear;
    }
    /**
     * 
     * @return String representation of book
     */
    public String toString (){
        return this.name +" was published by "+ this.authorName +" , has pages of: " +this.numberOfPages + "and was publishd in: "+  this.releaseYear;
    }
}
