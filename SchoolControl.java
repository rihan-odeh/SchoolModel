package ps.school.control;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import ps.school.model.*;
import ps.school.utils.JsonUtil;


/**
 * this class sets admin for school, adds a class to the map of classes creates new levels if two or more classes have the same level
 */

public class SchoolControl {
    private School school;

    public School getSchool() {
        return school;
    }

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


    public void saveSchool()  {
        JsonUtil jsonUtil = new JsonUtil();
        try(FileWriter file = new FileWriter("school.json")) {
           file.write(school.toJson().toJSONString());


            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public School importSchool() {   //should i make getname(), or setName()....
        JSONParser jsonParser = new JSONParser();
        Object object = new JSONObject();
     //   JSONObject json = new JSONObject();

       try(FileReader file = new FileReader("school.json")) {
           object = jsonParser.parse(file);
           //file.close();
        } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       } catch (ParseException e) {
           e.printStackTrace();
       }




        return school.fromJson((JSONObject) object) ;   }

}
/*
   JSONParser jsonParser = new JSONParser();
        try (FileReader file = new FileReader("school.json")){
            JSONObject jsonObject= (JSONObject) jsonParser.parse(file);
            JSONObject jason= (JSONObject)jsonObject;
            school1 = school.fromJson(jason);
        } catch (ParseException e) {
            e.printStackTrace();
        }
 */



