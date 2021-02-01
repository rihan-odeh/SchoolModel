/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;

import java.time.Duration;
/**
 *
 * @author ro1 Lecture class to be a lecture that has an id, a name, sClass in it, a book assigned to it and a period duration
 */
public class Lecture {
 private  int id; 
  private String name;
  private sClass sC; 
   private Book book;
    private Duration periods;
    /**
     * constructor that assigns values to the attributes
     * @param id
     * @param Name
     * @param sC
     * @param book
     * @param Period 
     */
    public Lecture(int id , String Name, sClass sC, Book book, Duration Period){
        this.id = id; 
        this.name = Name; 
        this.sC =sC; 
        this.book = book; 
        this.periods = Period;
    }
   /**
    * setters
     * @param id to be the id of the lecture
    */
    public void setId(int id){
        this.id = id; 
    }
    /**
     * 
     * @param Name of the lecture
     */
    public void setName(String Name){
        this.name= Name;
    }
    /**
     * 
     * @param Sc to be sClass in this lecture
     */
    public void setsClass(sClass Sc){
        this.sC= Sc;
    }
    /**
     * 
     * @param book in this lecture
     */
    public void setBook(Book book){
        this.book= book; 
    }
    /**
     * 
     * @param Period of this lecture
     */
    public void setPeriod(Duration Period){
        this.periods= Period;
    }
    /**
     * getters
     */
    /**
     * 
     * @return id of the lecture
     */
    public int getId(){
        return id;
    }
    /**
     * 
     * @return name of the lecture
     */
    public String getName(){
        return this.name;
    }
    /**
     * 
     * @return school class in this lecture
     */
    public sClass getsClass(){
        return this.sC;
    }
    /**
     * 
     * @return book of this lecture
     */
    public Book getBook(){
        return this.book;
}
    /**
     * 
     * @return duration of this lecture
     */
    public Duration getPeriod(){
        return this.periods;
    }
    /**
     * 
     * @return String representation of the lecture
     */
    public String toString(){
        return "Lecture: " + getName() + " has an id of:  " +getId() +"\n with school class:\n "+ sC +" assigned with Book: \n " + book + "\n with a duration of: "+ periods.toMinutes()+" minutes."; 
    }
}