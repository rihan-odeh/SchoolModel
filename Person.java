/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps.school.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.concurrent.atomic.AtomicInteger;

import org.json.simple.*;

import ps.school.utils.JsonUtil;


/**
 * @author ro1
 * /**
 * class person, creates a person, with attributes(id,, name, gender, date of birth)
 */

/**
 * enum is for gender
 *
 * @author ro1
 */

public class Person implements JsonInterface {
    private int id;
    private String name;
    private Date dateOfBirth;
    private Gender gender;


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
     *
     * @param FirstName
     * @param LastName
     * @param DateOfBirth
     * @param gender
     */
    public Person(int id, String FirstName, String LastName, Date DateOfBirth, Gender gender) {

        this.name = FirstName + " " + LastName;
        this.id = id;
        this.dateOfBirth = DateOfBirth;
        this.gender = gender;
    }

    public Person(int id, String name, Date dateOfBirth, Gender gender) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    /**
     * default constructor
     */
    public Person() {
        AtomicInteger idGenerated = new AtomicInteger();
        this.id = idGenerated.incrementAndGet();
        this.name = " ";
        this.dateOfBirth = new Date();
        this.gender = Gender.NotKnown;
    }

    public Person(Object id, Object name, Object dateOfBirth, Object gender) {
        this.id =  Integer.valueOf(id.toString());
        this.name = name.toString();
        try {
            this.dateOfBirth = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy").parse(dateOfBirth.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.gender= Gender.valueOf(gender.toString());

    }


    /**

     */
    public void setName(String name) {
        this.name = name;

    }

    /**
     * @param date of birth
     */
    public void setDate(Date date) {
        this.dateOfBirth = date;
    }

    /**
     * @param gender
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    /**
     * getters to return the attributes of Person class
     *
     */
    /**
     * @return id
     */
    public long getId() {
        return this.id;
    }

    /**
     * @return name as both first and last name
     */
    public String getName() {
        return name;
    }

    /**
     * @return date of birth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @return gender
     */
    public Gender getGender() {
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

    public JSONObject toJson() {
        //JsonUtil jsonUtil = new JsonUtil();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Id", id);
        jsonObject.put("Name", name);
        jsonObject.put("Date Of Birth", dateOfBirth.toString()); ///format
        jsonObject.put("Gender", gender.name()); //ordinal number in the enum
        return jsonObject;
    }

    public Person fromJson(JSONObject jsonObject) {

        return new Person(jsonObject.get("Id"), jsonObject.get("Name"), jsonObject.get("Date Of Birth"), jsonObject.get("Gender"));


    }

}

