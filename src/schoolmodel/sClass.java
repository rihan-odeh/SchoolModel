/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ro1 sclass class is to be a design of school class, and has some attributes
 */
class Sclass {

    private long id;
    private Table table;
    private int roomNumber;
    private ArrayList<Book> books;
    private Instructor classManager;
    private ArrayList<Student> students = new ArrayList<>();
    private Level level;
    private char section = 'a';
    private Student managerAssistant;
    private SclassControl sclassControl = new SclassControl(this);
    private SchoolControl schoolControl;
    private HashMap<Student, Double> avarageOfStudents = new HashMap<>(); // average for every Student


    public Sclass(long id, Table table, int roomNumber, ArrayList<Book> books, Instructor classManager, ArrayList<Student> students, Level level, char section) {
        this.id = id;
        this.table = table;
        this.roomNumber = roomNumber;
        this.books = books;
        this.classManager = classManager;
        this.students = students;
        this.level = level;
        this.section = section;


    }


    public Sclass(long id, int roomNumber, ArrayList<Book> books, Instructor classManager, ArrayList<Student> students, Level level, char section) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.books = books;
        this.classManager = classManager;
        this.students = students;
        this.level = level;
        this.section = section;
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
     */

    public Sclass(long id, Table table, int roomNumber, ArrayList<Book> books, ArrayList<Student> students, Instructor classManager) {
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
     */
    public Sclass(long id, int roomNumber, ArrayList<Book> books, ArrayList<Student> students, Instructor classManager) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.books = books;
        this.students = students;
        this.classManager = classManager;
    }

    public Sclass(Sclass sclass) {
        this.id = sclass.getId();
        this.table = sclass.getTable();
        this.roomNumber = sclass.getRoomNumber();
        this.books = sclass.getBook();
        //this.students= sclass.getStudent();
        this.classManager = sclass.getClassManager();
    }

    public Sclass(long id, int roomNumber, ArrayList<Book> books, Instructor classManager) {
        this.id = id;

        this.roomNumber = roomNumber;
        this.books = books;
        this.classManager = classManager;
    }

    /**
     * setter
     *
     * @param id to be id
     */
    public void setId(long id) {
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

    public char getSection( ) {
        return schoolControl.getSection(this);
    }

    public void setSection(char section) {
        this.section = section;
    }

    public Student getManagerAssistance() {
        return managerAssistant;
    }



    /**
     * @param table to be the table of this class
     */
    public void setTable(Table table) {
        this.table = table;
    }

    /**
     * @param roomnumber in this Sclass
     */
    public void setRoomNumber(int roomnumber) {
        this.roomNumber = roomNumber;

    }

    /**
     * @param books to be books in the SClass
     */
    public void setBooks(ArrayList<Book> books) {
        this.books = new ArrayList<>(books);

    }

    /**
     * method to add students to the list
     *
     * @param book
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /*
     * @param Student to be student in this class
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     *
     */
    public void setClassManager() {
        this.classManager = sclassControl.getManager();

    }
    /**
     *  getters
     *
     */
    /**
     * @return id of the Sclass
     */
    public long getId() {
        return id;
    }

    /**
     * @return table in this Sclass
     */
    public Table getTable() {
        return this.table;
    }

    /**
     * @return room number
     */
    public int getRoomNumber() {
        return this.roomNumber;
    }

    /**
     * @return book assigned to this Sclass
     */
    public ArrayList<Book> getBook() {
        return books;
    }
/**
 *
 * @return student in this class
 */


    /**
     * @return instructor of this class
     */
    public Instructor getClassManager() {
        return classManager;
    }


    public double getStudentAverage(Student student) {

        return avarageOfStudents.get(student);
    }

    public void setStudentsAverages() { //add student with his\her ave
        avarageOfStudents = new HashMap<>();
        for (int i = 0; i<students.size(); i++) {
            avarageOfStudents.put(students.get(i),students.get(i).getAverage());
        }


    }

    public HashMap<Student, Double> getStudentsAverages() {
        return avarageOfStudents;
    }

    public Double getHighestAve() {

        Map.Entry<Student, Double> max =null;
       setStudentsAverages();
        for (Map.Entry<Student, Double> entry : avarageOfStudents.entrySet()) {
            if (max==null ||entry.getValue().compareTo(max.getValue()) > 0)
                max = entry;
        }

        return max.getValue();
    }
    public String  toString(){
        return this.avarageOfStudents+ " " + this.id;
    }
}

