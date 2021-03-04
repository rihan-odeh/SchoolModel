/*i
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps.school.runner;

import ps.school.control.SClassControl;
import ps.school.control.SchoolControl;
import ps.school.model.*;
import org.json.simple.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;
import java.lang.reflect.Method;


/**
 * @author ro1 driving class to check all methods of each class
 */

public class SchoolModel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date date = new Date(96, 10, 9);

        Admin admin = new Admin("rii", "RihanOdeh", date, Gender.Female);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Id", 123);
        jsonObject.put("Name", "Rihan");
        jsonObject.put("Date Of Birth", date);
        jsonObject.put("Gender", Gender.Female);
        Person person = new Person();
      //  System.out.println(person.fromJson(jsonObject));


        ArrayList<Student> students = new ArrayList<>();
        Map<Lecture, Double> marks3 = new HashMap<>();


        Book book = new Book("AAAA", "dkmls", 154, 2001);
        // System.out.println(book.getId());
        Book book1 = new Book("Agggg", "dkmls", 154, 2001);
        // System.out.println(" book"+book1.getId());
        ArrayList<Book> books = new ArrayList<>();

        books.add(book);
        books.add(book1);
        Instructor instructor = new Instructor("Ir", "a", date, Gender.NotKnown);
        Period period1 = new Period(Period.Day.Monday, Period.Time.Fifth);
        Period period2 = new Period(Period.Day.Saturday, Period.Time.Forth);
        ArrayList<Period> periods = new ArrayList<>();
        periods.add(period1);
        periods.add(period2);

        SClass sclass = new SClass(254, books, instructor);
        //  System.out.println(sclass.getId());
        Student student1 = new Student("rihanodeh", date, Gender.Female);
        //  System.out.println("s1" + student1.getId());
        student1.setSc(sclass);
        //System.out.println("sc1"+ sclass.getId());


        Lecture lecture = new Lecture("Math", sclass, book, periods);
        lecture.setsC(sclass);
        // System.out.println(lecture.getId());

        Lecture lecture1 = new Lecture("Science", sclass, book, periods);
        // System.out.println(lecture1.getId());
        lecture1.setsC(sclass);
        Lecture lecture3 = new Lecture("CS", sclass, book, periods);
        // System.out.println(lecture3.getId());


        marks3.put(lecture3, 100.0);
        marks3.put(lecture1, 99.0);
        marks3.put(lecture, 98.0);

        //student1.getAverage();
        // sclass.addStudents(student1);
        student1.setCoursesMarks(marks3);
        students.add(student1);


        Student student2 = new Student("ro", date, Gender.Male);
        //   System.out.println("s2"+student2.getId());

        Map<Lecture, Double> marks4 = new HashMap<>();
        marks4.put(lecture, 80.0);
        marks4.put(lecture1, 89.0);
        marks4.put(lecture3, 88.0);
        student2.setSc(sclass);

        student2.setCoursesMarks(marks4);
        students.add(student2);
        //System.out.println("lecture" +lecture3.getId());
        Map<Lecture, Double> marks5 = new HashMap<>();
        marks4.put(lecture, 70.0);
        marks4.put(lecture1, 49.0);
        marks4.put(lecture3, 50.0);
        student2.setSc(sclass);
        // System.out.println(student2.getAverage());
        Student student3 = new Student("reeeoddd", date, Gender.Male);
        //  System.out.println("s3"+student3.getId());
        student3.setCoursesMarks(marks4);
        students.add(student3);

        //System.out.println(student1.getAverage());


        ArrayList<SClass> SClasses = new ArrayList<>();
        SClasses.add(sclass);


        ArrayList<Lecture> lectures = new ArrayList<>();
        lectures.add(lecture1);
        lectures.add(lecture);
        Table table = new Table(lectures, sclass);


        SClass SClass4 = new SClass(table, 21, books, instructor, students, Level.level4);
        //  System.out.println("sc2"+SClass4.getId());

        ArrayList<SClass> sClasses = new ArrayList<>();
        SClass SClass3 = new SClass(table, 1254, books, instructor, students, Level.level4);
        //  System.out.println("sc3"+ SClass3.getId());
         sClasses.add(SClass3);
        //   sClasses.add(SClass5);
        SClass SClass5 = new SClass(table, 1254, books, instructor, students, Level.level5);
        //  System.out.println("sc4" +SClass5.getId());
        sClasses.add(SClass5);
        SchoolControl schoolControl = new SchoolControl(admin);
        // schoolControl.setAdmin(admin);
        schoolControl.addInstructor(instructor);
        // schoolControl.addClass(sclass);
        SClass SClass9 = new SClass(table, 1254, books, instructor, students, Level.level1);
         sClasses.add(SClass9);

        SClassControl sclassControl = new SClassControl(sclass);
        Instructor instructor1 = new Instructor("Instructor", "a", date, Gender.NotKnown);
        Instructor instructor2 = new Instructor("Instructor", "b", date, Gender.NotKnown);
        Instructor instructor3 = new Instructor("Instructor", "c", date, Gender.Female);
        Instructor instructor4 = new Instructor("Instructor", "d", date, Gender.Male);
        // SClass sClass = new SClass(instructor1);

        ArrayList<Instructor> instructors = new ArrayList<>();
        instructors.add(instructor1);
        instructors.add(instructor2);
        instructors.add(instructor3);
        instructors.add(instructor4);
        // sclassControl.assignBooks(books);
        Map<Level, ArrayList<SClass>> sClassMap = new HashMap<>();
        //sClassMap.put(Level.level1, sclass);
        sClassMap.put(Level.level5, SClasses);
      //  System.out.println( "sclass map" +sClassMap.values());
        School school = new School(admin, sClassMap);
        school.setInstructors(instructors);
        //SchoolControl schoolControl1 = new SchoolControl(admin);
        schoolControl.addInstructor(instructor);
        schoolControl.addInstructor(instructor2);
        schoolControl.addInstructor(instructor1);
        schoolControl.addInstructor(instructor3);
        schoolControl.addInstructor(instructor4);
        // schoolControl.addClass(SClass3);
        //schoolControl.addClass(SClass5);
        //System.out.println(SClass3.getSection());

        sclassControl.addStudent(student1);
        sclassControl.addStudent(student2);
        sclassControl.addStudent(student3);

     //   System.out.println(sclass.getClassManager());
        //System.out.println(sclassControl.assignManagerAssistant());
        //System.out.println(student2);
        //System.out.println(instructor1);
        //System.out.println(student3);
        // System.out.println(student2.getId());


        //  System.out.println(student1.getAverage());

       /*school.addClass(SClass3);
        school.addClass(SClass4);
        school.addClass(SClass5);
        school.addClass(SClass9);*/
        //System.out.println(school.getInstructors());
        //System.out.println(school.getAdmin());
        //System.out.println(lecture.toJson());
        // JSONObject json = new JSONObject((Map) SClass3);
        //System.out.println(school.getAdmin());
        //System.out.println(school.getClasses());
        // System.out.println(schoolControl.toJson());
        //System.out.println(student1.fromJson());
        //   System.out.println(student1.toJson());
        // System.out.println(lecture.fromJson());
        schoolControl.saveSchool();
        //System.out.println("********schoolJson" + schoolControl.getSchool().toJson().toJSONString());
        //System.out.println("*****************************school control to json"+ schoolControl.getSchool().toJson());
      //  System.out.println("school control.school"+school.toJson().toJSONString());
      //  System.out.println("**************");
       // System.out.println("import school"+schoolControl.importSchool().toString());;
       // System.out.println(person.fromJson(jsonObject));
       // System.out.println(schoolControl.getSchool());
        schoolControl.addInstructor(instructor2);
        schoolControl.addClass(SClass3);
        //schoolControl.addClass(SClass4);
      //  schoolControl.addClass(SClass5);
       // System.out.println(SClass5.getSection());
       // System.out.println(SClass3.getSection());
      //  System.out.println(SClass4.getSection());
        sclassControl.addStudent(student1);
        sclassControl.assignBook(book);
      //   System.out.println(schoolControl.getSchool());
      //  System.out.println(schoolControl.getSchool().toJson());


      //  System.out.println(schoolControl.importSchool());




}


}
