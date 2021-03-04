package ps.school.model;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.simple.*;
import ps.school.utils.JsonUtil;

/**
 * School class has attributes of admin object, instructor object and sclass object
 */

public class School implements JsonInterface {

    private Admin admin=new Admin();
    private List instructors = new ArrayList<Instructor>();//////
    private Map classes = new HashMap<>();


//    /**
//     * constructor of school class
//     *
//     * @param admin
//     * @param instructors
//     */
//    public School(Admin admin, ArrayList<Instructor> instructors) {
//        this.admin = admin;
//        this.instructors = instructors;
//       // classes = new HashMap<>();
//
//
//    }

    public School(Admin admin, Map<Level, ArrayList<SClass>> classes) {
        this.admin = admin;
        this.classes = classes;
    }

    public School(Admin admin) {
        this.admin = admin;
        //classes = new HashMap<>();
    }

//    public School() {
//
//    }

    public School(Object admin, Object instructors, Object classes) {

      //  this.admin.fromJson((JSONObject) admin);
       this.admin.setName(((JSONObject) admin).get("Name").toString());
       this.admin.setGender(Gender.valueOf((((JSONObject) admin).get("Gender")).toString()));
        try {
            this.admin.setDate(new SimpleDateFormat(("E MMM dd HH:mm:ss Z yyyy")).parse(((JSONObject) admin).get("Date Of Birth").toString()));
        } catch (ParseException e) {
            e.printStackTrace();
        }


        this.instructors= (ArrayList) instructors;

        this.classes = (Map) classes;



    }

    public JSONObject toJson() {
        JsonUtil jsonUtil = new JsonUtil();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Admin", getAdmin().toJson());
        jsonObject.put("instructors", jsonUtil.toJsonArray(instructors));

        jsonObject.put("classes", jsonUtil.toJsonMap(classes));

        return jsonObject;
    }

    public School fromJson(JSONObject jsonObject) {
       // System.out.println("classes of jsonobject"+ jsonObject.get("classes"));
        return new School(jsonObject.get("Admin"), jsonObject.get("instructors"), jsonObject.get("classes"));
    }


    /**
     * @return admin
     */
    public Admin getAdmin() {
        return admin;
    }

    /**
     * @param admin to set
     */
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    /**
     * @return instructor list
     */
    public List<Instructor> getInstructors() {
        return instructors;
    }

    /**
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

    @Override
    public String toString() {
        return "School{" +
                "admin=" + admin +
                ", instructors=" + instructors +
                ", classes=" + classes +
                '}';
    }
}
