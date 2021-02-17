/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * instructor class extends person class
 *
 * @author ro1
 */

public class Instructor extends Person {
    private ArrayList<Lecture> lectures;

    private static AtomicInteger id = new AtomicInteger();
    public Instructor( String FirstName, String LastName, Date DateOfBirth, Gender gender, ArrayList<Lecture> lectures) {
        super( id.incrementAndGet(),FirstName, LastName, DateOfBirth, gender);

        this.lectures = lectures;
    }

    public Instructor( String FirstName, String LastName, Date DateOfBirth, Gender gender) {
        super(id.incrementAndGet(),FirstName, LastName, DateOfBirth, gender);

    }

    public ArrayList<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(ArrayList<Lecture> lectures) {
        this.lectures = lectures;
    }
}
/*
     * constructor with lecture object as a parameter
     *
     * @param lecture
     *
    public Instructor(Lecture lecture) {
        super();
        this.lecture = lecture;
    }

    /**
     * constructor with variables
     *
     * @param id
     * @param firstName
     * @param lastName
     * @param dateOfBirth
     * @param gender
     *
    public Instructor(long id, String firstName, String lastName, Date dateOfBirth, Gender gender) {
        super(id, firstName, lastName, dateOfBirth, gender);
    }

    /**
     * copy constructor
     *
     * @param instructor
     *
    public Instructor(Instructor instructor) {
        super(instructor.getId(), instructor.getName(), instructor.getDateOfBirth(), instructor.getGender());
    }

    /**
     * setter
     *
     * @param lecture object to set it ti the lecture attribute
     *
    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    /**
     * @return lecture object
     *
    public Lecture getLecture() {
        return lecture;
    }

    public SClass getSClass() {
        return lecture.getsC();
    }*/

