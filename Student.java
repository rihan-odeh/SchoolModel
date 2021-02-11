/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;


import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * student class inherits from person class
 *
 * @author ro1
 */
public class Student extends Person {
    private Sclass sc;
    private HashMap<Lecture, Double> coursesMarks = new HashMap<>();  //this hashmap stores every lecture with its grade



    /**
     * constructor that invokes default constructor in superclass, and pass Sclass as parameter
     *
     * @param sc
     */
    public Student(Sclass sc) {
        super();

        this.sc = sc;

    }


    /**
     * copy constructor
     *
     * @param Id
     * @param FirstName
     * @param LastName
     * @param DateOfBirth
     * @param gender
     * @param SC
     */
    public Student(long Id, String FirstName, String LastName, Date DateOfBirth, Gender gender, Sclass SC) {
        super(Id, FirstName, LastName, DateOfBirth, gender);
        this.sc = SC;
    }

    public Student(long Id, String name, Date DateOfBirth, Gender gender, Sclass SC) {
        super(Id, name, DateOfBirth, gender);
        this.sc = SC;
    }

    /**
     * copy constructor
     *
     * @param Id
     * @param name
     * @param DateOfBirth
     * @param gender
     */
    public Student(long Id, String name, Date DateOfBirth, Gender gender) {
        super(Id, name, DateOfBirth, gender);
    }

    /**
     * default constructor
     */
    public Student() {
        super();
    }

    /**
     * constructor with student object
     *
     * @param student
     */
    public Student(Student student) {
        super(student.getId(), student.getName(), student.getDateOfBirth(), student.getGender());
    }

    public Student(long id, String name, Date dateOfBirth, Gender gender, Sclass sc, HashMap<Lecture, Double> marks) {
        super(id, name, dateOfBirth, gender);
        this.sc = sc;
        this.coursesMarks = marks;
    }

    public Student(long Id, String FirstName, String LastName, Date DateOfBirth, Gender gender, double mark , Lecture lecture) {
        super(Id, FirstName, LastName, DateOfBirth, gender);
        this.coursesMarks.put(lecture, mark);
    }

    public Student(Sclass sc, HashMap<Lecture, Double> marks) {
        this.sc = sc;
        this.coursesMarks = marks;
    }


    public Sclass getSc() {
        return sc;
    }

    public void setSc(Sclass sc) {
        this.sc = sc;
    }

    public HashMap<Lecture, Double> getMark() {
        return coursesMarks;
    }

    public void setMark(HashMap<Lecture, Double> marks) {
        this.coursesMarks = marks;
    }

    public void addMark(Lecture lecture, double mark) {
        coursesMarks.put(lecture, mark);
    }

    /**
     * assigns value to Sclass
     *
     * @param sc
     */
    public void setSClass(Sclass sc) {
        this.sc = sc;
    }


    public double getAverage() { //send these marks to sclass

        double sum = 0;
        for (Map.Entry<Lecture, Double> entry : coursesMarks.entrySet()) {
            sum += entry.getValue();
        }
        return (sum / coursesMarks.size());
    }

    public void setCoursesMarks(Lecture lecture, double mark) {
        coursesMarks.put(lecture, mark);
    }

    public double getCourseMark(Lecture lecture) {
        return coursesMarks.get(lecture);
    }

    public HashMap<Lecture, Double> getCoursesMarks() {
        return coursesMarks;
    }
}
