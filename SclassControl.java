package ps.school.control;

import ps.school.model.*;
import java.util.*;

/**
 * sclass control is to have methods that assign some variables.
 */
public class SClassControl {
    private SClass sClass; ///arrays and maps


    public SClassControl(SClass sClass) {
        this.sClass = sClass;
    }

    public void addStudent(Student student) {
        sClass.getStudents().add(student);
    }

    public void assignBook(Book book) {
        sClass.getBooks().add(book);
    }

    /**
     * methods to build table
     *
     * @param id
     */
    public void assignTableId(long id) {
        sClass.getTable().setId(id);
    }

    public void assignLectures(ArrayList<Lecture> lectures) {
        sClass.getTable().setLectures(lectures);
    }

    public void assignSClass(SClass sClass) {
        this.sClass.getTable().setSclass(sClass);
    }

    public void assignRoomNum(int roomNum) {
        sClass.setRoomNumber(roomNum);
    }

    public Instructor getManager(List<Instructor> instructors) {
        return sClass.setClassManager(instructors.get(new Random().nextInt(instructors.size())));
    }
//////////////////////////////
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

//    public Student assignManagerAssistant() {
//
//        Map.Entry<Student, Double> max = null;
//
//        for (Map.Entry<Student, Double> entry : sClass.calculateAverages().entrySet()) {
//            if (max == null || entry.getValue().compareTo(max.getValue()) > 0)
//                max = entry;
//        }
//        return max.getKey();
//    }



}

