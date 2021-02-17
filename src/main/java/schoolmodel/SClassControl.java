package schoolmodel;

import org.json.simple.JSONValue;

import java.util.*;

/**
 * sclass control is to have methods that assign some variables.
 */
public class SClassControl {
   private SClass sClass; ///arrays and maps



    public SClassControl(SClass sClass) {
        this.sClass = sClass;
    }
public void addStudent(Student student){
        sClass.getStudents().add(student);
}
    public void assignBook(Book book){
        sClass.getBooks().add(book);
    }

    /**
     * methods to build table
     * @param id
     */
    public void assignTableId(long id){
        sClass.getTable().setId(id);
    }
    public void assignLectures(ArrayList<Lecture> lectures){
        sClass.getTable().setLectures(lectures);
    }
    public void assignSClass(SClass sClass){
        this.sClass.getTable().setSclass(sClass);
    }
    public void assignRoomNum(int roomNum){
        sClass.setRoomNumber(roomNum);
    }
    public void getManager(List<Instructor> instructors) {
        sClass.setClassManager(instructors.get(new Random().nextInt(instructors.size()))); ;
    }
   /*  public Map calculateAverage() {
        Map<Student, Double> studentsMarks = new HashMap<>();
        for (int i = 0; i < sClass.getStudents().size(); i++) {
            double sum = 0;
            for (double val : sClass.getStudents().get(i).getCoursesMarks().values()) {
                sum += val;
                studentsMarks.put(sClass.getStudents().get(i), sum / sClass.getStudents().get(i).getCoursesMarks().size());


            }
        }
        return studentsMarks;
    }*/
    public Student assignManagerAssistant() {

        Map.Entry<Student, Double> max = null;

        for (Map.Entry<Student, Double> entry: sClass.calculateAverages().entrySet()) {
            if (max == null || entry.getValue().compareTo(max.getValue()) > 0)
                max = entry;
        }
        return max.getKey();
    }
    public String toJson(){
        return JSONValue.toJSONString(this);
    }













    /*
     * constructor
     *
     * @param id
     * @param table
     * @param roomNumber
     * @param books
     * @param students
     * @param classManager
     * @param admin
     *

    public SClassControl(long id, Table table, int roomNumber, ArrayList<Book> books, ArrayList<Student> students, Instructor classManager, Admin admin) {
        this.students = students;
        sclass = new SClass(id, roomNumber, books,  classManager);
        schoolControl = new SchoolControl(admin);
    }

    /**
     * copy constructor
     *
     * @param sclass
     *
    public SClassControl(SClass sclass) {
      this.sclass = sclass;
        this.students = sclass.getStudents();
    }

    /**
     * another constructor
     *
     * @param students
     * @param sclass
     * @param schoolControl
     *
    public SClassControl(ArrayList<Student> students, SClass sclass, SchoolControl schoolControl) {
        this.students = students;
        this.sclass = sclass;
        this.schoolControl = schoolControl;
    }

    /**
     * method to add student to the list of student
     *
     * @param student
     *
    public void addStudent(Student student) {

        students.add(student);
    }

    /**
     * @return students list
     *
    public ArrayList<Student> getStudents() {
        return students;
    }

    /**
     * method to set the list of students
     *
     * @param students
     *

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    /**
     * @return sclass of this class
     *
    public SClass getSclass() {
        return sclass;
    }

    /**
     * set sclass
     *
     * @param sclass
     *

    public void setSclass(SClass sclass) {
        this.sclass = sclass;
    }


    /*public void setCoursesMarks(HashMap<Lecture, Double> map) {
        for(int i=0; i<students.size(); i++){
            coursesMarks.put(map., map.get(i));
    }}*

    /**
     * @return school control object
     *
    public SchoolControl getSchoolControl() {
        return schoolControl;
    }

    /**
     * set school class
     *
     * @param schoolControl
     *

    public void setSchoolControl(SchoolControl schoolControl) {
        this.schoolControl = schoolControl;
    }


    /**
     * methods to build the table  .... what methods?
     *
    public void buildTable(long id, ArrayList<Lecture> lectures, SClass sC) {
        Table table = new Table(id, lectures, sC);

    }


     * method to set room number for sclass
     *
     * @param roomNumber


   /* public void assignRoomNumber(int roomNumber) {
      **  sclass.setRoomNumber(roomNumber);

    }

    /**
     * method to set books for sclass
     *
     * @param books
     *

    public void assignBooks(ArrayList<Book> books) {
        sclass.setBooks(books);
    }

    /**
     * method to return manager of this sclass
     *
     * @return
     *


    public Object findRandomManagerAssistant() {

    return  (sclass.getAllHighestAverages().get(new Random().nextInt(sclass.getAllHighestAverages().size())));

    }
    /**
     * method to add students to the list
     *
     * @param book
     *
    public void addBook(Book book) {
        books.add(book);
    }*/


}

