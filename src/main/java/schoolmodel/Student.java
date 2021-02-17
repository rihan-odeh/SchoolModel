/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;


import org.json.simple.JSONObject;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * student class inherits from person class
 *
 * @author ro1
 */
public class Student extends Person {
    private SClass sc; ///arrays and maps
    private Map<Lecture, Double> coursesMarks = new HashMap<>();  //this hashmap stores every lecture with its grade /// json
    private static AtomicInteger id = new AtomicInteger();
    public Student(String FirstName, String LastName, Date DateOfBirth, Gender gender, SClass sc, Map<Lecture, Double> coursesMarks) {
        super(id.incrementAndGet() ,FirstName, LastName, DateOfBirth, gender);

        this.sc = sc;
        this.coursesMarks = coursesMarks;
    }

    public Student( String name, Date dateOfBirth, Gender gender) {
        super( id.incrementAndGet() , name, dateOfBirth, gender);

    }

    public SClass getSc() {
        return sc;
    }

    public void setSc(SClass sc) {
        this.sc = sc;
    }

    public Map<Lecture, Double> getCoursesMarks() {
        return coursesMarks;
    }

    public void setCoursesMarks(Map<Lecture, Double> coursesMarks) {
        this.coursesMarks = coursesMarks;
    }


    public void setCoursesMarks(Lecture lecture, double mark) {
        coursesMarks.put(lecture, mark);
    }

    public double getCourseMark(Lecture lecture) {
        return coursesMarks.get(lecture);
    }
    public JSONObject mapToJson(){
        JSONObject jsonObject = new JSONObject (coursesMarks);
        return jsonObject;
    }

}
/*
    public double getAverage() { //send these marks to sclass in control

        double sum = 0;
        for (double val : coursesMarks.values()) {
            sum += val;
        }
        return (sum / coursesMarks.size());
    }*/
/*

    /**
     * constructor that invokes default constructor in superclass, and pass SClass as parameter
     *
     * @param sc
     *
public Student(SClass sc) {
    super();

    this.sc = sc;

}

    /*
     * copy constructor
     *
     * @param Id
     * @param FirstName
     * @param LastName
     * @param DateOfBirth
     * @param gender
     * @param SC
     *
    public Student(long Id, String FirstName, String LastName, Date DateOfBirth, Gender gender, SClass SC) {
        super(Id, FirstName, LastName, DateOfBirth, gender);
        this.sc = SC;
    }

    public Student(long Id, String name, Date DateOfBirth, Gender gender, SClass SC) {
        super(Id, name, DateOfBirth, gender);
        this.sc = SC;
    }

    /*
     * copy constructor
     *
     * @param Id
     * @param name
     * @param DateOfBirth
     * @param gender
     *
    public Student(long Id, String name, Date DateOfBirth, Gender gender) {
        super(Id, name, DateOfBirth, gender);
    }

    /*
     * default constructor
     *
    public Student() {
        super();
    }

    /*
     * constructor with student object
     *
     * @param student

    public Student(Student student) {
        super(student.getId(), student.getName(), student.getDateOfBirth(), student.getGender());
    }

    public Student(long id, String name, Date dateOfBirth, Gender gender, SClass sc, HashMap<Lecture, Double> marks) {
        super(id, name, dateOfBirth, gender);
        this.sc = sc;
        this.coursesMarks = marks;
    }

    public Student(long Id, String FirstName, String LastName, Date DateOfBirth, Gender gender, double mark, Lecture lecture) {
        super(Id, FirstName, LastName, DateOfBirth, gender);
        this.coursesMarks.put(lecture, mark);
    }

    public Student(SClass sc, HashMap<Lecture, Double> marks) {
        this.sc = sc;
        this.coursesMarks = marks;
    }


    public SClass getSc() {
        return sc;
    }

    public void setSc(SClass sc) {
        this.sc = sc;
    }

    public Map<Lecture, Double> getMark() {
        return coursesMarks;
    }

    public void setMark(Map<Lecture, Double> marks) {
        this.coursesMarks = marks;
    }

    public void addMark(Lecture lecture, double mark) {
        coursesMarks.put(lecture, mark);
    }

    /*
     * assigns value to SClass
     *
     * @param sc
     *
    public void setSClass(SClass sc) {
        this.sc = sc;
    }



    public Map<Lecture, Double> getCoursesMarks() {
        return coursesMarks;
    }
 */