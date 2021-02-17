/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * @author ro1
 * /**
 * Admin class inherits from Person, the admin is one person so the no- argument constructor
 * gives default information
 */
public class Admin extends Person {
    private static AtomicInteger id = new AtomicInteger();
    /**
     * default constructor that invokes default constructor in superclass
     */
    public Admin() {
        super();

    }

    /**
     * constructor that assigns values to the attributes
     *

     * @param firstName
     * @param lastName
     * @param dateOfBirth
     * @param gender
     */
    public Admin( String firstName, String lastName, Date dateOfBirth, Gender gender) {
        super( id.incrementAndGet(),firstName, lastName, dateOfBirth, gender);

    }

    /**
     * copy constructor
     *
     * @param admin
     */
    public Admin(Admin admin) {
        super(id.decrementAndGet(), admin.getName(), admin.getDateOfBirth(), admin.getGender());

    }
}
