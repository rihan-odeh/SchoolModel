/*i
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;

import java.util.ArrayList;
import java.util.Date;


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
        ArrayList<Double> marks1 = new ArrayList<>();
        marks1.add(66.0);
        marks1.add(92.0);

        Student student1 = new Student(123,"rihan","odeh", date, Gender.Female, marks1);
        Student student2= new Student(789, "r","o", date, Gender.Male, marks);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
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
        Sclass sclass = new Sclass(1254,254, books,instructor ,students, 10, 'a');

        ArrayList<Sclass> sclasses = new ArrayList<>();
        sclasses.add(sclass);


        Lecture lecture = new Lecture(1254, "Math",sclass, book, periods);
        Lecture lecture1 = new Lecture(5421, "Science", sclass, book, periods);
        ArrayList<Lecture> lectures = new ArrayList<>();
        lectures.add(lecture1);
        lectures.add(lecture);
        Table table = new Table(5478, lectures, sclass);
        Sclass sclass1 = new Sclass(1254,1254, books,students,instructor );
        sclasses.add(sclass1);
        SchoolControl schoolControl = new SchoolControl(admin);
        schoolControl.addClass(Level.level4,sclass);

        schoolControl.setAdmin(admin);
        schoolControl.addInstructor(instructor);
        System.out.println(schoolControl.getAdmin());
        System.out.println(schoolControl.getInstructors());
        System.out.println(schoolControl.getSclasses());
        SclassControl sclassControl = new SclassControl(1452, table, 254, books, students, instructor, admin);

        sclassControl.assignBooks(books);
        System.out.println(schoolControl.getLevel(sclass));
        System.out.println("section = " + schoolControl.addClass(Level.level4, sclass1));
        Sclass sclass3 = new Sclass(1254,1254, books,students,instructor );
        System.out.println(schoolControl.addClass(Level.level4,sclass3));

        SclassControl sclassControl1 = new SclassControl(sclass1);
        schoolControl.addClass(Level.level1, sclass1);
        Instructor instructor1 = new Instructor(1, "Instructor", "a", date, Gender.NotKnown);
        Instructor instructor2 = new Instructor(2, "Instructor", "b", date, Gender.NotKnown);
        Instructor instructor3 = new Instructor(5, "Instructor", "a", date, Gender.NotKnown);
        Instructor instructor4 = new Instructor(4, "Instructor", "b", date, Gender.NotKnown);
        ArrayList<Instructor> instructors = new ArrayList<>();
        instructors.add(instructor1);
        instructors.add(instructor2);
        instructors.add(instructor3);
        instructors.add(instructor4);
        SchoolControl schoolControl1= new SchoolControl(admin, sclasses, instructors);
        schoolControl.addInstructor(instructor);
        schoolControl.addInstructor(instructor2);
        schoolControl.addInstructor(instructor1);
        schoolControl.addInstructor(instructor3);
        schoolControl.addInstructor(instructor4);
        System.out.println(schoolControl.getInstructors().size());
        sclassControl.setSchoolControl(schoolControl1);
        System.out.println(sclassControl.getManager());
        System.out.println(sclassControl.assignManagerAssistant());
        System.out.println(sclass.getMarks());
        
































      
       


      
    }
    
}
