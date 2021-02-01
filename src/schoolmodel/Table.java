/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;

/**
 *
 * @author ro1 Table class, is a school sceduale with lectures and sClasses
 */
class Table {
   private long id;
   private Lecture lectures;
  private  sClass sclass;
  /**
   * constructor assigns values to the attributes
   * @param id
   * @param lecture
   * @param sC 
   */
   public Table (long id, Lecture lecture, sClass sC){
       this.id = id; 
       this.lectures = lecture; 
       this.sclass = sC;
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
    public Lecture getLectures(){
        return lectures; 
    }
    /**
     * 
     * @return sClass in this table
     */
    public sClass getSchoolClass(){
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
    public void setLecture(Lecture lecture){
        this.lectures = lecture;
    }
    /**
     * 
     * @param Sc to be the sClass of this table
     */
    public void setSClass(sClass Sc){
        this.sclass = Sc;
    }
    /**
     * 
     * @return a string representation of the whole table with its attributes
     */
    public String tostring(){
        return "The table with "+ getId() +"has a "+ lectures.getName() +" and its students are: \n " + sclass.getStudent();
    }
}
