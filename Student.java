/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps.school.model;


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
        super(id.incrementAndGet(), FirstName, LastName, DateOfBirth, gender);

        this.sc = sc;
        this.coursesMarks = coursesMarks;
    }

    public Student(String name, Date dateOfBirth, Gender gender) {
        super(id.incrementAndGet(), name, dateOfBirth, gender);

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

    @Override
    public JSONObject toJson() {
        return super.toJson();
    }

    public Person fromJson(JSONObject jsonObject) {
        return super.fromJson(jsonObject);
    }


}
