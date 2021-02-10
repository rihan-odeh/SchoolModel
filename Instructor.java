/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;
import java.util.Date; 

/**
 *instructor class extends person class 
 * @author ro1
 * 
 */

public class Instructor extends Person{
  private  Lecture lecture;
  /**
   * constructor with lecture object as a parameter
   * @param lecture 
   */
    public Instructor(Lecture lecture){
        super();
        this.lecture = lecture;
    }
    /**
     * constructor with variables
     * @param id
     * @param firstName
     * @param lastName
     * @param dateOfBirth
     * @param gender 
     */
    public Instructor (long id, String firstName, String lastName, Date dateOfBirth,Gender gender){
        super(id, firstName, lastName, dateOfBirth, gender);
    }
    /**
     * copy constructor
     * @param instructor 
     */
    public Instructor(Instructor instructor){
        super(instructor.getId(), instructor.getName(), instructor.getDateOfBirth(), instructor.getGender());
    }

    /**
     * setter
     * @param lecture object to set it ti the lecture attribute
     */
    public void setLecture(Lecture lecture){
        this.lecture = lecture;
    }
    /**
     * 
     * @return lecture object 
     */
    public Lecture getLecture(){
        return lecture;
    }
    public Sclass getSClass(){
        return lecture.getsC();
    }
}
