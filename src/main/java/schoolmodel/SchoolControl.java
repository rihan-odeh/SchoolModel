package schoolmodel;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.util.ArrayList;
import java.util.Map;


/**
 * this class sets admin for school, adds a class to the map of classes creates new levels if two or more classes have the same level
 */

public class SchoolControl {
    private School school;

    /**
     * constructor
     *
     * @param admin
     * @param sClasses
     */
    public SchoolControl(Admin admin, Map<Level, ArrayList<SClass>> sClasses) {
        school = new School(admin);


        school.setClasses(sClasses);

    }

    /**
     * another copy constructor
     *
     * @param admin
     */
    public SchoolControl(Admin admin) {
        school = new School(admin);
        school.setAdmin(admin);


    }

    public JSONObject mapToJson() {
        JSONObject jsonObject = new JSONObject(school.getClasses());
        return jsonObject;
    }

    /**
     * method to add sclass to the array list of sclasses and if the array list contains already another sclass the section must increment then return it
     *
     * @param sclass
     */

    public void addClass(SClass sclass) { //getKey if level has sth in it it addds new sclass to the array list
        //getKey if level has sth in it it addds new sclass to the array list
        //if not it creates new arraylist
        char section = 'a';


        if (!school.getClasses().containsKey(sclass.getLevel())) {
            ArrayList<SClass> sClass = new ArrayList<>();
            sClass.add(sclass);
            school.getClasses().put(sclass.getLevel(), sClass);


        } else {
            school.getClasses().get(sclass.getLevel()).add(sclass);

        }
        section += (school.getClasses().get(sclass.getLevel()).size()) - 1;
        sclass.setSection(section);


    }

    public void setAdmin(Admin admin) {
        school.setAdmin(admin);
    }

    public void addInstructor(Instructor instructor) {
        school.getInstructors().add(instructor);
    }

    public String toJson() {
        return JSONValue.toJSONString(this);
    }
}




    /*
     * method to get sclasses map
     *
     * @return
     *
    public Map<Level, ArrayList<SClass>> getSclasses() {
        return school.getClasses();
    }

    /**
     * method to get sclasses map
     *
     * @param sclasses
     *
    public void setSclasses(Map<Level, ArrayList<SClass>> sclasses) {
        school.setClasses(sclasses);
    }

    /**
     * method to get admin
     *
     * @return
     *
    public Admin getAdmin() {
        return school.getAdmin();
    }

    /**
     * method to set the Admin
     *
     * @param admin
     *

    public void setAdmin(Admin admin) {
        school.setAdmin(admin);}




    /**
     * method to return the level
     *
     * @param sclass
     * @return
     *
    public Level getLevel(SClass sclass) {
        return sclass.getLevel();
    }


    /**
     * method to set the arraylist of instructors
     *
     * @param instructors
     *
    public void setInstructors(ArrayList<Instructor> instructors) {
       school.setInstructors(instructors);
    }

    /**
     * method to add instructor to the array list of the instructor
     *
     * @param instructor
     *
    public void addInstructor(Instructor instructor) {
        school.addInstructor(instructor);


    }

    /**
     * method to return the array list of the instructors
     *
     * @return
     *

    public ArrayList<Instructor> getInstructors() {
        return school.getInstructors();
    }


}

/**
 * enum of levels of classes from 1 to 12
 */
enum Level {
    level1,
    level2,
    level3,
    level4,
    level5,
    level6,
    level7,
    level8,
    level9,
    level10,
    level11,
    level12


}