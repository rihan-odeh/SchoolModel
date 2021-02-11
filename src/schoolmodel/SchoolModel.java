/*i
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;


/**
 *
 * @author ro1 driving class to check all methods of each class
 */

public class SchoolModel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Date date = new Date(96,10,9);
         Admin admin = new Admin();
         ArrayList<Double> marks = new ArrayList<>();
         marks.add(100.0);
         marks.add(98.0);

        ArrayList<Student> students = new ArrayList<>();
        HashMap<Lecture, Double> marks3 = new HashMap<>();


        Book book = new Book(12321, "AAAA" , "dkmls", 154, 2001 );
        Book book1 = new Book(587, "Agggg" , "dkmls", 154, 2001 );
        ArrayList<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book1);
        Instructor instructor = new Instructor(3, "Ir", "a", date, Gender.NotKnown);
        Period period1 = new Period(Period.Day.Monday, Period.Time.Fifth);
        Period period2 = new Period(Period.Day.Saturday, Period.Time.Forth);
        ArrayList<Period> periods = new ArrayList<>();
        periods.add(period1);
        periods.add(period2);
        //Sclass sclass1 = new Sclass(1254,1254, books,instructor );
        Sclass sclass = new Sclass(1254,254, books,instructor );
        Student student1 = new Student(123,"rihanodeh", date, Gender.Female);
        student1.setSc(sclass);







        Lecture lecture = new Lecture(1254, "Math", book, periods);
        lecture.setsC(sclass);

        Lecture lecture1 = new Lecture(5421, "Science", book, periods);
        lecture1.setsC(sclass);
        Lecture lecture3 = new Lecture(1254, "CS",sclass, book, periods);


        marks3.put(lecture3, 1.0);
        marks3.put(lecture1, 6.0);
        marks3.put(lecture, 4.0);
        student1.setMark(marks3);
        student1.getAverage();
        sclass.addStudents(student1);

        Student student2= new Student(789, "r","o", date, Gender.Male, sclass);
        sclass.addStudents(student2);
        HashMap<Lecture, Double> marks4 = new HashMap<>();
        marks4.put(lecture, 80.0);
        marks4.put(lecture1, 60.0);
        marks4.put(lecture3, 70.0);
        student2.setMark(marks4);
        students.add(student2);





       ;

        student1.setMark(marks3);

        System.out.println(student1.getAverage());
        System.out.println(student1.getCoursesMarks()); //lecture representation



       students.add(student1);



        student2.setCoursesMarks(lecture3, 80.0);
       student2.setCoursesMarks(lecture1,60.0);

        ArrayList<Sclass> sclasses = new ArrayList<>();
        sclasses.add(sclass);


        ArrayList<Lecture> lectures = new ArrayList<>();
        lectures.add(lecture1);
        lectures.add(lecture);
        Table table = new Table(5478, lectures, sclass);



        //schoolControl.addClass(Level.level4,sclass);
        Sclass sclass4 = new Sclass(1254,1254, books, students,instructor );
        Sclass sclass3 = new Sclass(1254,1254, books, students,instructor );
        //sclasses.add(sclass4);
       // sclasses.add(sclass3);
        SchoolControl schoolControl = new SchoolControl(admin, Level.level5,sclasses );
        schoolControl.setAdmin(admin);
        schoolControl.addInstructor(instructor);
        System.out.println(schoolControl.getAdmin());
        System.out.println(schoolControl.getInstructors());

        SclassControl sclassControl = new SclassControl(1452, table, 254, books, students, instructor, admin);
        Instructor instructor1 = new Instructor(1, "Instructor", "a", date, Gender.NotKnown);
        Instructor instructor2 = new Instructor(2, "Instructor", "b", date, Gender.NotKnown);
        Instructor instructor3 = new Instructor(5, "Instructor", "a", date, Gender.NotKnown);
        Instructor instructor4 = new Instructor(4, "Instructor", "b", date, Gender.NotKnown);
        ArrayList<Instructor> instructors = new ArrayList<>();
        instructors.add(instructor1);
        instructors.add(instructor2);
        instructors.add(instructor3);
        instructors.add(instructor4);
        sclassControl.assignBooks(books);
        System.out.println(student1.getCourseMark(lecture1));



        //System.out.println("section = " + schoolControl.addClass(Level.level4, sclass));
        System.out.println(schoolControl.addClass(Level.level5, sclass4));
       System.out.println(schoolControl.addClass(Level.level5, sclass3));
       // System.out.println(sclass3.getSection());
        SchoolControl schoolControl1= new SchoolControl(admin,  instructors);
        schoolControl.addInstructor(instructor);
        schoolControl.addInstructor(instructor2);
        schoolControl.addInstructor(instructor1);
        schoolControl.addInstructor(instructor3);
       schoolControl.addInstructor(instructor4);
       System.out.println(schoolControl.getInstructors().size());
        sclassControl.setSchoolControl(schoolControl1);
       System.out.println(sclassControl.getManager());
       System.out.println(sclass.getHighestAve());
      System.out.println(sclassControl.assignManagerAssistant());





































    }

}
