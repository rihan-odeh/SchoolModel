/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;

import org.json.simple.JSONValue;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author ro1 Table class, is a school sceduale with lectures and sClasses
 */
class Table {
    private static AtomicInteger id = new AtomicInteger();
   private ArrayList<Lecture>lectures ;   ////
  private SClass sclass;  /// arrays and maps

    public Table( ArrayList<Lecture> lectures, SClass sclass) {
        this.id.incrementAndGet();
        this.lectures = lectures;
        this.sclass = sclass;
    }

    public long getId() {
        return id.get();
    }

    public void setId(long id) {
        this.id.incrementAndGet();
    }

    public ArrayList<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(ArrayList<Lecture> lectures) {
        this.lectures = lectures;
    }

    public SClass getSclass() {
        return sclass;
    }

    public void setSclass(SClass sclass) {
        this.sclass = sclass;
    }

    @Override
    public String toString() {
        return "Table{" + "id= "+ id +
                " lectures=" + lectures +
                ", sclass=" + sclass +
                '}';
    }
    public String toJson(){
        return JSONValue.toJSONString(this);
    }

    /*
   * constructor assigns values to the attributes
   * @param id
   * @param lectures
   * @param sC 
   *
   public Table (long id, ArrayList<Lecture> lectures, SClass sC){
       this.id = id; 
       this.lectures = lectures;
       this.sclass = sC;
   }

    public void setLectures(ArrayList<Lecture> lectures) {
        this.lectures = lectures;
    }

    public SClass getSclass() {
        return sclass;
    }


    public void setSclass(SClass sclass) {
        this.sclass = sclass;
    }
    /
    * getters
    *
   /*
    * 
    * @return id if the table 
    *
   public long getId(){
       return id; 
   }
   /**
    * 
    * @return lecture in this table
    *
    public ArrayList<Lecture> getLectures(){
        return lectures; 
    }
    /*
     * 
     * @return SClass in this table
     *
    public SClass getSchoolClass(){
        return sclass; 
    }
    /*
     * Setters
     */
    /*
     * 
     * @param Id to be id of the table
     *
    public void setId(long Id){
        this.id = Id; 
    }
    /*
     * 
     * @param lecture to assign it to this table class
     *
    public void setLecture(ArrayList<Lecture> lecture){
        this.lectures = lecture;
    }
    public void addLecture(Lecture lecture){
        lectures.add(lecture);
    }
    /*
     * 
     * @param Sc to be the SClass of this table
     *
    public void setSClass(SClass Sc){
        this.sclass = Sc;
    }
    /**
     * 
     * @return a string representation of the whole table with its attributes
     */

}
