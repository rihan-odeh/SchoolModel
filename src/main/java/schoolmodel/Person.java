/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
/**
 *
 * @author ro1
 * /**
 *  class person, creates a person, with attributes(id,, name, gender, date of birth)
 */
/**
 * enum is for gender
 * @author ro1
 */

public class Person {
    private static AtomicInteger idGenerated = new AtomicInteger();
   private int id;
   private  String name;
   private Date dateOfBirth;
   private Gender gender;
 //   JSONObject obj=new JSONObject();

    /**
     * 
     * @param Id to be the id of this person
     * @param FirstName to be the first name of this person
     * @param LastName to be the surname of this person
     * @param DateOfBirth to be the date of birth of this person
     * @param gender the gender of this person
     */
    /**
     * constructor that assign the values of the attributes

     * @param FirstName
     * @param LastName
     * @param DateOfBirth
     * @param gender 
     */
   public Person( int id,String FirstName,String LastName, Date DateOfBirth,  Gender gender ) {

     this.name= FirstName + " " + LastName;
     this.id = id;
     this.dateOfBirth =DateOfBirth;
     this.gender= gender;
   }

    public Person( int id ,String name, Date dateOfBirth, Gender gender) {
       this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    /**
    * default constructor
    */
   public Person(){

       this.id = idGenerated.incrementAndGet();
    this.name= " ";
    this.dateOfBirth = new Date();
    this.gender= Gender.NotKnown;
   }
   
   /**
    * setters for the attributes of the person class
    */
   /**
    * 
    *
    */
   public void setId(){
       idGenerated.incrementAndGet();
       
   }
   /**
    * 
    * @param first name
    * @param last name
    */
   public void setName(String first, String last){
       this.name = first +" " + last;
      
   }
   /**
    * 
    * @param date of birth
    */
   public void setDate(Date date){
       this.dateOfBirth = date;
   }
   /**
    * 
    * @param gender 
    */
   public void setGender(Gender gender){
       this.gender = gender; 
   }
   /**
    * getters to return the attributes of Person class
    * 
    */
   /**
    * 
    * @return id
    */
   public  long getId(){
       return this.id;
   }

   /**
    *  
    * @return name as both first and last name
    */
   public String getName(){
       return name;
   }
   /**
    * 
    * @return date of birth
    */
   public Date getDateOfBirth(){
       return dateOfBirth;
   }
   /**
    * 
    * @return gender
    */
    public Gender getGender(){
        return gender; 
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                '}';
    }
    public String toJson(){

      //return   obj.toJSONString();
      return JSONValue.toJSONString(this);
    }

}
enum Gender{
    Female,
    Male,
    NotKnown
}