package ps.school.Console;

import ps.school.control.SClassControl;
import ps.school.control.SchoolControl;
import ps.school.model.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Runner {




    public static void main(String[] args) {
        Date date = new Date(96, 10, 9);
        SchoolControl schoolControl;
        Admin admin = new Admin("rii", "RihanOdeh", date, Gender.Female);
        schoolControl= new SchoolControl(admin);
        Map<Integer,Method > schoolControlMap = new HashMap<>();
        try {
            schoolControlMap.put(1,SchoolControl.class.getMethod("addClass", SClass.class) );
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            schoolControlMap.put(2, SchoolControl.class.getMethod("addInstructor", Instructor.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            schoolControlMap.put(3, SchoolControl.class.getMethod("saveSchool"));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            schoolControlMap.put(4, SchoolControl.class.getMethod("setAdmin", Admin.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            schoolControlMap.put(5, SchoolControl.class.getMethod("getSchool"));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            schoolControlMap.put(6, SchoolControl.class.getMethod("importSchool"));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        Map <Integer, Method> sclassControlMap= new HashMap<>();
        try {
            sclassControlMap.put(1,SClassControl.class.getMethod("addStudent", Student.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            sclassControlMap.put(2,SClassControl.class.getMethod("assignBook", Book.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            sclassControlMap.put(3,SClassControl.class.getMethod("assignSClass", SClass.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            sclassControlMap.put(4,SClassControl.class.getMethod("assignLectures", ArrayList.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            sclassControlMap.put(5,SClassControl.class.getMethod("assignRoomNum", int.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            sclassControlMap.put(6,SClassControl.class.getMethod("assignTableId", long.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            sclassControlMap.put(7,SClassControl.class.getMethod("getManager", List.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


        System.out.println("Do you want School view or Class view, for school you can type school,School and for the class you can enter  class,Class");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (input.equals("School") || input.equals("school")) {
            System.out.println("What function do you want?\n " +
                    " add a student enter 1,\n" +
                    "  add instructor enter 2,\n" +
                    "  save school enter 3,\n" +
                    "  set an admin enter 4,\n" +
                    "  get the school enter 5, \n" +
                    "  import school enter 6");
            Scanner scanner1 = new Scanner(System.in);
            int function = scanner1.nextInt();
           // if(function <= schoolControlMap.size()){
              //  schoolControlMap.get(function);
            Method m = schoolControlMap.get(function);

            try {
                System.out.println("method = " + m.invoke(schoolControl));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

            //  }
          //  else System.out.println("Wrong input.");




        } else if (input.equals("Class") || input.equals("class")) {
            Method[] methods = SClassControl.class.getDeclaredMethods();
            for (int i = 0; i < methods.length; i++) {
                System.out.println(methods[i]);

            }

        } else System.out.println("Incorrect input");

    }
}
//    Method[] methods = SchoolControl.class.getDeclaredMethods();
//            for(int i=0; i<methods.length; i++){
//        System.out.println(methods[i]);
//        }
