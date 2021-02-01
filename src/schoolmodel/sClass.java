/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;

/**
 *
 * @author ro1 sclass class is to be a design of school class, and has some attributes
 */
class sClass {

    private long id;
    private Table table;
    private int roomNumber;
    private Book books;
    private Person students, classManager;

    /**
     * constructor that assigns values to the attributes
     * @param id
     * @param table
     * @param roomNumber
     * @param books
     * @param students
     * @param classManager 
     */
    
    public sClass(long id, Table table, int roomNumber, Book books, Person students, Person classManager) {
        this.id = id;
        this.table = table;
        this.roomNumber = roomNumber;
        this.books = books;
        this.students = students;
        this.classManager = classManager;
    }
    /**
     * copy constructor
     * @param id
     * @param roomNumber
     * @param books
     * @param students
     * @param classManager 
     */
public sClass(long id, int roomNumber, Book books, Person students, Person classManager){
    this.id = id;
        this.roomNumber = roomNumber;
        this.books = books;
        this.students = students;
        this.classManager = classManager;
}
  /**
   * setter
   * @param id to be id
   */
    public void setId(long id) {
        this.id = id;

    }
/**
 * 
 * @param table to be the table of this class
 */
    public void setTable(Table table) {
        this.table = table;
    }
/**
 * 
 * @param roomnumber in this sClass
 */
    public void setroomNumber(int roomnumber) {
        this.roomNumber = roomNumber;

    }
/**
 * 
 * @param books to be books in the SClass
 */
    public void setBooks(Book books) {
        this.books = books;

    }
/**
 * 
 * @param Student to be student in this class
 */
    public void setStudents(Student Student) {
        this.students = students;

    }
/**
 * 
 * @param ClassManager to be the instructor of this sClass
 */
    public void setClassManager(Instructor ClassManager) {
        this.classManager = classManager;

    }
    /**
     *  getters
     * 
     */
/**
 * 
 * @return id of the sClass
 */
    public long getId(){
        return id; 
    }
    /**
     * 
     * @return table in this sClass
     */
    public Table getTable(){
        return this.table;
    }
    /**
     * 
     * @return room number 
     */
    public int getRoomNumber(){
        return this.roomNumber;
    }
    /**
     * 
     * @return book assigned to this sClass
     */
public Book getBook(){
    return books; 
}
/**
 *  
 * @return student in this class
 */
public Person getStudent(){
    return students;
}
/**
 * 
 * @return instructor of this class
 */
public Person getClassManager(){
    return classManager; 
}
/**
 * 
 * @return string representation of sClass
 */
public String toString(){
    return "This class "+ getId() +" \n is in : " +getRoomNumber()+ "\n Students in this class are:\n "+getStudent()+"\n class Manager is: \n"+ getClassManager();
}
}
