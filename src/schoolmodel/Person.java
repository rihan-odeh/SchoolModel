/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;

import java.util.Date;

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
 enum Gender{  
        Female,
        Male, 
        NotKnown
    }
public class Person {
    private long Id;
   private  String firstName;
   private  String lastName;
   private  String Name;
   private Date DateOfBirth; 
    Gender gender; 
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
     * @param Id
     * @param FirstName
     * @param LastName
     * @param DateOfBirth
     * @param gender 
     */
   public Person(long Id, String FirstName,String LastName, Date DateOfBirth,  Gender gender ) {
     this.Id = Id;
     this.Name= FirstName + " " + LastName; 
     
     this.DateOfBirth =DateOfBirth; 
     this.gender= gender;
   }
   /**
    * default constructor
    */
   public Person(){
    this.Id= 00000; 
    this.Name= " ";
    this.DateOfBirth = new Date(); 
    this.gender= Gender.NotKnown;
   }
   
   /**
    * setters for the attributes of the person class
    */
   /**
    * 
    * @param Id
    */
   public void setId(long Id){
       this.Id = Id; 
       
   }
   /**
    * 
    * @param first name
    * @param last name
    */
   public void setName(String first, String last){
       this.Name = first +" " + last; 
      
   }
   /**
    * 
    * @param date of birth
    */
   public void setDate(Date date){
       this.DateOfBirth = date; 
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
   public long getId(){
       return this.Id;  
   }
   /**
    * 
    * @return first name 
    */
   public String getFirstName(){
       return this.firstName; 
   }
   /**
    * 
    * @return last name
    */
   public String getLastName(){
       return this.lastName; 
   }
   /**
    *  
    * @return name as both first and last name
    */
   public String getName(){
       return Name; 
   }
   /**
    * 
    * @return date of birth
    */
   public Date getDateOfBirth(){
       return DateOfBirth; 
   }
   /**
    * 
    * @return gender
    */
    public Gender getGender(){
        return gender; 
    }
    /**
     * 
     * @return string representation for the person with all the attributes
     */
    public String toString(){
        return getName() + " ( is " + getGender() + " has an Id of: " + getId() + " and was born on: " + getDateOfBirth() +")"; 
    }
    
}
