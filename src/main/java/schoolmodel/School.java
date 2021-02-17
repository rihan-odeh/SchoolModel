package schoolmodel;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * School class has attributes of admin object, instructor object and sclass object
 */

public class School {

    private Admin admin;
    private ArrayList<Instructor> instructors= new ArrayList<>();//////
    private Map<Level, ArrayList<SClass>> classes;



    /**
     * constructor of school class
     * @param admin
     * @param instructors

     */
    public School(Admin admin, ArrayList<Instructor> instructors) {
        this.admin = admin;
        this.instructors = instructors;
        classes = new HashMap<>();


    }

    public School(Admin admin, Map<Level, ArrayList<SClass>> classes) {
        this.admin = admin;
        this.classes = classes;
    }

    public School(Admin admin) {
        this.admin = admin;
        classes = new HashMap<>();
    }
    public JSONObject mapToJson(){
        JSONObject jsonObject = new JSONObject (classes);
        return jsonObject;
    }
    /**
     *
     * @return admin
     */
    public Admin getAdmin() {
        return admin;
    }

    /**
     *
     * @param admin to set
     */
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    /**
     *
     * @return instructor list
     */
    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    /**
     *
     * @param instructors to assign it to school class
     */
    public void setInstructors(ArrayList<Instructor> instructors) {
        this.instructors = instructors;
    }



    public Map<Level, ArrayList<SClass>> getClasses() {
        return classes;
    }

    public void setClasses(Map<Level, ArrayList<SClass>> classes) {
        this.classes = classes;
    }
    public String toJson(){
        return JSONValue.toJSONString(this);
    }

/*

    /**
     *
     * @param instructor to add to the list of instructors of this class
     *
public void addInstructor(Instructor instructor){
    instructors.add(instructor);
}
 */


}
