/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;

import java.util.ArrayList;

/**
 *
 * @author ro1 Table class, is a school sceduale with lectures and sClasses
 */
class Table {
   private long id;
   private ArrayList<Lecture>lectures ;
  private Sclass sclass;
  /**
   * constructor assigns values to the attributes
   * @param id
   * @param lectures
   * @param sC 
   */
   public Table (long id, ArrayList<Lecture> lectures, Sclass sC){
       this.id = id; 
       this.lectures = lectures;
       this.sclass = sC;
   }

    public void setLectures(ArrayList<Lecture> lectures) {
        this.lectures = lectures;
    }

    public Sclass getSclass() {
        return sclass;
    }


    public void setSclass(Sclass sclass) {
        this.sclass = sclass;
    }
    /**
    * getters
    */
   /**
    * 
    * @return id if the table 
    */
   public long getId(){
       return id; 
   }
   /**
    * 
    * @return lecture in this table
    */
    public ArrayList<Lecture> getLectures(){
        return lectures; 
    }
    /**
     * 
     * @return Sclass in this table
     */
    public Sclass getSchoolClass(){
        return sclass; 
    }
    /**
     * Setters
     */
    /**
     * 
     * @param Id to be id of the table
     */
    public void setId(long Id){
        this.id = Id; 
    }
    /**
     * 
     * @param lecture to assign it to this table class
     */
    public void setLecture(ArrayList<Lecture> lecture){
        this.lectures = lecture;
    }
    public void addLecture(Lecture lecture){
        lectures.add(lecture);
    }
    /**
     * 
     * @param Sc to be the Sclass of this table
     */
    public void setSClass(Sclass Sc){
        this.sclass = Sc;
    }
    /**
     * 
     * @return a string representation of the whole table with its attributes
     */

}
