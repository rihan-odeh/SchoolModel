/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps.school.model;


import org.json.simple.*;
import ps.school.utils.JsonUtil;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * @author ro1 sclass class is to be a design of school class, and has some attributes
 */
public class SClass implements JsonInterface {

    private static AtomicInteger id = new AtomicInteger();
    private Table table;
    private int roomNumber;
    private List books;///gson
    private Instructor classManager;
    private List students = new ArrayList<Student>();
    private Map studentsMarks = new HashMap<>();
    private char section;
    private Level level;

    /**
     * constructor
     *
     * @param roomNumber
     * @param books
     * @param classManager
     */
    public SClass(int roomNumber, ArrayList<Book> books, Instructor classManager) {
        this.id.incrementAndGet();
        this.roomNumber = roomNumber;
        this.books = books;
        this.classManager = classManager;
    }

    public SClass(Table table, int roomNumber, List<Book> books, Instructor classManager, ArrayList<Student> students, Level level) {
        this.id.incrementAndGet();
        this.table = table;
        this.roomNumber = roomNumber;
        this.books = books;
        this.classManager = classManager;
        this.students = students;
        this.level = level;
    }

    public SClass(Object Table , Object room_number, Object books, Object classManager,  Object students, Object level) {
        this.table = (Table) Table;

        this.roomNumber = Integer.valueOf(room_number.toString());;
        this.books = (ArrayList) books;
        this.classManager = (Instructor) classManager;
        this.level = Level.valueOf(level.toString());
        this.students = (ArrayList) students;

    }

    public long getId() {
        return id.get();
    }

    public void setId(long id) {
        this.id.incrementAndGet();
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public Instructor getClassManager() {
        return classManager;
    }

    public Instructor setClassManager(Instructor classManager) {
        this.classManager = classManager;
        return classManager;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Map<Student, Double> getStudentsMarks() {
        // toCalculateAverages();
        return studentsMarks;
    }

    public void setStudentsMarks(Map<Student, Double> studentsMarks) {
        this.studentsMarks = studentsMarks;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }


    public JSONObject toJson() {
        JsonUtil jsonUtil = new JsonUtil();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Id", id);
        jsonObject.put("Section", section);
        jsonObject.put("level", level.name());
        jsonObject.put("Table", table.toJson());
        jsonObject.put("room number", roomNumber);
        jsonObject.put("books", jsonUtil.toJsonArray(books));  ///should i make a json array list
        jsonObject.put("class manager", classManager.toJson());
        jsonObject.put("Students", jsonUtil.toJsonArray(students));     /////
        jsonObject.put("student marks", jsonUtil.toJsonMap(studentsMarks)); ///map
        return jsonObject;
    }

    public SClass fromJson(JSONObject jsonObject) { //Table table, int roomNumber, List<Book> books, Instructor classManager, ArrayList<Student> students, Level level
        return new SClass(jsonObject.get("Table"),jsonObject.get("room number"), (jsonObject.get("books")), jsonObject.get("class manager"),jsonObject.get("Students"), jsonObject.get("level"));


    }
/////////////////////////////////////////////
//    public Map<Student, Double> calculateAverages() { ///// in sclass
//        // public void setStudentsAverages() { //add student with his\her ave
//        studentsMarks = new HashMap<>();
//        for (int i = 0; i < students.size(); i++) {
//            double sum = 0;
//            for (double val : students.get(i).getCoursesMarks().values()) {
//                sum += val;
//                studentsMarks.put(students.get(i), sum / students.get(i).getCoursesMarks().size());
//            }
//        }
//        return studentsMarks;
//    }

    @Override
    public String toString() {
        return "SClass{" +
                "id= " + id +
                " table=" + table +
                ", roomNumber=" + roomNumber +
                ", books=" + books +
                ", classManager=" + classManager +
                ", students=" + students +
                ", studentsMarks=" + studentsMarks +
                ", section=" + section +
                ", level=" + level +
                '}';
    }
}

