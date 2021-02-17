/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * @author ro1 sclass class is to be a design of school class, and has some attributes
 */
class SClass {

    private static AtomicInteger id = new AtomicInteger();
    private Table table;
    private int roomNumber;
    private ArrayList<Book> books;///gson
    private Instructor classManager;
    private ArrayList<Student> students = new ArrayList<>(); ///// gson
    private Map<Student, Double> studentsMarks = new HashMap<>();/////json
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

    public SClass(Table table, int roomNumber, ArrayList<Book> books, Instructor classManager, ArrayList<Student> students, Level level) {
        this.id.incrementAndGet();
        this.table = table;
        this.roomNumber = roomNumber;
        this.books = books;
        this.classManager = classManager;
        this.students = students;
        this.level = level;
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

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public Instructor getClassManager() {
        return classManager;
    }

    public void setClassManager(Instructor classManager) {
        this.classManager = classManager;
    }

    public ArrayList<Student> getStudents() {
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

    /*public List CalculateAverages(){ //method that give students list to sclass control to calculate averages
    return students;

    }*/
    public String toJson() {
        return JSONValue.toJSONString(this);
    }


    public Map<Student, Double> calculateAverages() { ///// in sclass
        // public void setStudentsAverages() { //add student with his\her ave
        studentsMarks = new HashMap<>();
        for (int i = 0; i < students.size(); i++) {
            double sum = 0;
            for (double val : students.get(i).getCoursesMarks().values()) {
                sum += val;
                studentsMarks.put(students.get(i), sum / students.get(i).getCoursesMarks().size());
            }
        }
        return studentsMarks;
    }

    @Override
    public String toString() {
        return "SClass{" +
                "id= " + id.get() +
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

    public JSONObject mapToJson() {
        JSONObject jsonObject = new JSONObject(studentsMarks);
        return jsonObject;
    }

}


/*
    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    private char section;
    private SClassControl sclassControl = new SClassControl(this);

    private HashMap<Student, Double> averageOfStudents = new HashMap<>(); // average for every Student


    public SClass(long id, Table table, int roomNumber, ArrayList<Book> books, Instructor classManager, ArrayList<Student> students, Level level) {
        this.id = id;
        this.table = table;
        this.roomNumber = roomNumber;
        this.books = books;
        this.classManager = classManager;
        this.students = students;
        this.level = level;


    }


    public SClass(long id, int roomNumber, ArrayList<Book> books, Instructor classManager, ArrayList<Student> students, Level level) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.books = books;
        this.classManager = classManager;
        this.students = students;
        this.level = level;

    }

    /**
     * constructor that assigns values to the attributes
     *
     * @param id
     * @param table
     * @param roomNumber
     * @param books
     * @param students
     * @param classManager


    public SClass(long id, Table table, int roomNumber, ArrayList<Book> books, ArrayList<Student> students, Instructor classManager) {
        this.id = id;
        this.table = table;
        this.roomNumber = roomNumber;
        this.books = books;
        this.students = students;
        this.classManager = classManager;
    }

    /**
     * copy constructor
     *
     * @param id
     * @param roomNumber
     * @param books
     * @param students
     * @param classManager
     *
    public SClass(long id, int roomNumber, ArrayList<Book> books, ArrayList<Student> students, Instructor classManager) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.books = books;
        this.students = students;
        this.classManager = classManager;
    }

    public SClass(SClass sclass) {
        this.id = sclass.getId();
        this.table = sclass.getTable();
        this.roomNumber = sclass.getRoomNumber();
        this.books = sclass.getBook();
        //this.students= sclass.getStudent();
        this.classManager = sclass.getClassManager();
    }

    public SClass(long id, int roomNumber, ArrayList<Book> books, Instructor classManager) {
        this.id = id;

        this.roomNumber = roomNumber;
        this.books = books;
        this.classManager = classManager;
    }
/*
    /**
     * setter
     *
     * @param id to be id
     */
 /*   public void setId(long id) {
        this.id = id;

    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Student> getStudents() {
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

    /**
     * @param table to be the table of this class
     */
   /* public void setTable(Table table) {
        this.table = table;
    }

    /**
     * @param roomnumber in this SClass

    public void setRoomNumber(int roomnumber) {
        this.roomNumber = roomNumber;

    }

    /**
     * @param books to be books in the SClass

    public void setBooks(ArrayList<Book> books) {
        this.books = new ArrayList<>(books);

    }



    /*
     * @param Student to be student in this class

    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     *

    public void setClassManager(Instructor manager) {
        this.classManager =manager;

    }

     *  getters
     *

     * @return id of the SClass

    public long getId() {
        return id;
    }

    /**
     * @return table in this SClass

    public Table getTable() {
        return this.table;
    }

    /**
     * @return room number

    public int getRoomNumber() {
        return this.roomNumber;
    }

    /**
     * @return book assigned to this SClass

    public ArrayList<Book> getBook() {
        return books;
    }
/**
 *
 * @return student in this class
 */


    /**
     * @return instructor of this class

    public Instructor getClassManager() {
        return classManager;
    }


    public double getStudentAverage(Student student) {

        return averageOfStudents.get(student);
    }

    public void setStudentsAverages() { //add student with his\her ave
        averageOfStudents = new HashMap<>();
        for (Student student : students) {
            averageOfStudents.put(student, student.getAverage());
        }


    }

    public HashMap<Student, Double> getStudentsAverages() {
        return averageOfStudents;
    }

    public SClass(Instructor classManager) {
        this.classManager = classManager;
    }



    //this method finds all students with same highest average and assign one of them to be manager assistant randomly.
    public List getAllHighestAverages() {
        setStudentsAverages();
        Double max = averageOfStudents.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getValue();

        return averageOfStudents.entrySet().stream().filter(entry -> entry.getValue() == max).map(Map.Entry::getKey).collect(Collectors.toList());
    }

    public String toString() {
        return this.averageOfStudents + " " + this.id;
    }*/


