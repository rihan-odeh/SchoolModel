package schoolmodel;

import java.util.*;

/**
 * sclass control is to have methods that assign some variables.
 */
public class SclassControl {
    private ArrayList<Student> students ;
    private Sclass sclass;
    private SchoolControl schoolControl;
   // private HashMap<Lecture, Double> coursesMarks = new HashMap<>();  //this hashmap stores every lecture with its grade



    /**
     * constructor
     * @param id
     * @param table
     * @param roomNumber
     * @param books
     * @param students
     * @param classManager
     * @param admin
     */

    public SclassControl(long id, Table table, int roomNumber, ArrayList<Book> books, ArrayList<Student> students, Instructor classManager, Admin admin) {
        this.students = students;
        sclass = new Sclass(id, table, roomNumber, books, students, classManager);
        schoolControl = new SchoolControl(admin);
    }

    /**
     * copy constructor
     * @param sclass
     */
    public SclassControl(Sclass sclass) {
        this.sclass = sclass;
        this.students = sclass.getStudents();
    }

    /**
     *another constructor
     * @param students
     * @param sclass
     * @param schoolControl
     */
    public SclassControl(ArrayList<Student> students, Sclass sclass, SchoolControl schoolControl) {
        this.students = students;
        this.sclass = sclass;
        this.schoolControl = schoolControl;
    }

    /**
     * method to add student to the list of student
     * @param student
     */
    public void addStudent(Student student) { //initialize here

        students.add(student);
    }

    /**
     *
     * @return students list
     */
    public ArrayList<Student> getStudents() {
        return students;
    }

    /**
     * method to set the list of students
     * @param students
     */

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    /**
     *
     * @return sclass of this class
     */
    public Sclass getSclass() {
        return sclass;
    }

    /**
     * set sclass
     * @param sclass
     */

    public void setSclass(Sclass sclass) {
        this.sclass = sclass;
    }


    /*public void setCoursesMarks(HashMap<Lecture, Double> map) {
        for(int i=0; i<students.size(); i++){
            coursesMarks.put(map., map.get(i));
    }}*/

    /**
     *
     * @return school control object
     */
    public SchoolControl getSchoolControl() {
        return schoolControl;
    }

    /**
     * set school class
     * @param schoolControl
     */

    public void setSchoolControl(SchoolControl schoolControl) {
        this.schoolControl = schoolControl;
    }


    /**
     * methods to build the table  .... what methods?
     */
    public void buildTable(long id, ArrayList<Lecture> lectures, Sclass sC) {
        Table table = new Table(id, lectures, sC);

    }

    /**
     * method to set room number for sclass
     * @param roomNumber
     */

    public void assignRoomNumber(int roomNumber) {
        sclass.setRoomNumber(roomNumber);

    }

    /**
     * method to set books for sclass
     * @param books
     */

    public void assignBooks(ArrayList<Book> books) {
        sclass.setBooks(books);
    }


    /**
     * method to assign manager randomly
     */
   /* public Instructor assignManager() {

        int rand = new Random().nextInt(schoolControl.getInstructors().size());



        return (schoolControl.getInstructors().get(rand));



    }*/

    /**
     *  method to return manager of this sclass
     * @return
     */

    public Instructor getManager() {
        return schoolControl.getInstructors().get(new Random().nextInt(getSchoolControl().getInstructors().size()));
    }

    /**
     *  method to assign manager assistant for this sclass
     * @return
     */

   public Student assignManagerAssistant() {
       double max=sclass.getHighestAve();
        for (int i = 0; i < students.size(); i++) {
           if (students.get(i).getAverage() == max) {
             return  students.get(i);
            }
        }
        return null;
    }





}

