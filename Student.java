/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;

import java.util.ArrayList;
import java.util.Date;

/**
 * student class inherits from person class 
 * @author ro1
 */
public class Student extends Person{
    private Sclass sc;
    private ArrayList<Double> marksList;
    /**
     * constructor that invokes default constructor in superclass, and pass Sclass as parameter
     * @param sc 
     */
    public Student(Sclass sc){
       super();
      
        this.sc= sc;
        
    }
    public Student(){
        super();
    }

    public Student(long Id, String FirstName, String LastName, Date DateOfBirth, Gender gender, Sclass sc, ArrayList<Double> mark) {
        super(Id, FirstName, LastName, DateOfBirth, gender);
        this.sc = sc;
        this.marksList = mark;
    }

    public Student(long id, String name, Date dateOfBirth, Gender gender, Sclass sc, ArrayList<Double> mark) {
        super(id, name, dateOfBirth, gender);
        this.sc = sc;
        this.marksList = mark;
    }

    public Student(long Id, String FirstName, String LastName, Date DateOfBirth, Gender gender, ArrayList<Double> mark) {
        super(Id, FirstName, LastName, DateOfBirth, gender);
        this.marksList = mark;
    }

    public Student(Sclass sc, ArrayList<Double> mark) {
        this.sc = sc;
        this.marksList = mark;
    }

    public Sclass getSc() {
        return sc;
    }

    public void setSc(Sclass sc) {
        this.sc = sc;
    }

    public ArrayList<Double> getMark() {
        return marksList;
    }

    public void setMark(ArrayList<Double> mark) {
        this.marksList = mark;
    }
    public void addMark(double mark){
        marksList.add(mark);
    }

    /**
     * constructor with student object
     * @param student 
     */
    public Student(Student student){
        super(student.getId(), student.getName(), student.getDateOfBirth(), student.getGender());
    }
    /**
     *  copy constructor
     * @param Id
     * @param FirstName
     * @param LastName
     * @param DateOfBirth
     * @param gender
     * @param SC 
     */
    public Student(long Id, String FirstName,String LastName, Date DateOfBirth,  Gender gender, Sclass SC ) {
    super(Id, FirstName, LastName, DateOfBirth, gender);
    this.sc = SC;
    }
    public Student(long Id, String name, Date DateOfBirth,  Gender gender, Sclass SC ) {
        super(Id, name, DateOfBirth, gender);
        this.sc = SC;
    }
    /**
     * copy constructor
     * @param Id
     * @param FirstName
     * @param LastName
     * @param DateOfBirth
     * @param gender 
     */
    public Student(long Id, String FirstName,String LastName, Date DateOfBirth,  Gender gender ) {
        super(Id, FirstName, LastName, DateOfBirth, gender);
    }
    /**
     * assigns value to Sclass
     * @param sc 
     */
    public void setSClass(Sclass sc){
        this.sc = sc;
    }


    public double getAverage(){
        double sum= 0;
        for(int i=0 ;i< marksList.size(); i++){
            sum+= marksList.get(i);
        }
        return sum/ marksList.size();
    }
    public Student getStudent(double average){
        Student newStudent;
        if(getAverage()== average){
          return  newStudent= new Student(this.getId(), this.getName(), this.getDateOfBirth(),this.getGender(), this.getSc());
        }return new Student();
    }

}
