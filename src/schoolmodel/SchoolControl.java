package schoolmodel;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * this class sets admin for school, adds a class to the map of classes creates new levels if two or more classes have the same level
 */

public class SchoolControl
{
    private Admin admin;
    private ArrayList<Sclass> schoolClasses = new ArrayList<>();
    private ArrayList<Instructor> instructors = new ArrayList<>();
    private HashMap<Level, ArrayList<Sclass>> sclasses = new HashMap<>(); ///each integer is a level of classes[1-12], in each there is an arrayList to be different classes of different sections with the same level

    /**
     * constructor
     * @param admin
     * @param sclasses
     */
    public SchoolControl(Admin admin,  HashMap<Level, ArrayList<Sclass>> sclasses) {

       this.admin = new Admin(admin);

        this.sclasses = sclasses;

    }

    /**
     * copy constructor
     * @param admin
     * @param schoolClasses
     * @param instructors
     */
    public SchoolControl(Admin admin, ArrayList<Sclass> schoolClasses, ArrayList<Instructor> instructors) {
        this.admin = admin;
        this.schoolClasses = schoolClasses;
        this.instructors = instructors;
    }

    /**
     * another copy constructor
     * @param admin
     */
    public SchoolControl(Admin admin) {

        setAdmin(admin);

    }

    /**
     * method to get sclasses map
     * @return
     */
    public HashMap<Level, ArrayList<Sclass>> getSclasses() {
        return sclasses;
    }

    /**
     * method to get sclasses map
     * @param sclasses
     */
    public void setSclasses(HashMap<Level, ArrayList<Sclass>>sclasses) {
        this.sclasses = sclasses;
    }

    /**
     * method to get admin
     * @return
     */
    public Admin getAdmin() {
        return admin;
    }

    /**
     *  method to set the Admin
     * @param admin
     */

    public void setAdmin(Admin admin) {
     this.admin= new Admin(admin);
    }

    /**
     * method to return section of the sclass
     * @param sclass
     * @return
     */

    public char getSection(Sclass sclass) {
        return sclass.getSection();
    }

    /**
     * method to add sclass to the array list of sclasses and if the array list contains already another sclass the section must increment then return it
     * @param level
     * @param sclass
     */

    public char addClass(Level level ,Sclass sclass){ //getKey
        for(int i =0; i< 12;i++){ //this for loop fills the map each level with an arrayList (1-12)
            schoolClasses = new ArrayList<>();

        }

        schoolClasses.add(sclass);
        sclasses.put(level, schoolClasses);


        return (char)(getSection(sclass)+ schoolClasses.size()-1);

    }

    /**
     * method to return the level
     * @param sclass
     * @return
     */
    public int getLevel(Sclass sclass){
        return sclass.getLevel();
    }

    /**
     * method to set level
     * @param sclass
     */
    public void setLevel(Sclass sclass){
      sclass.getLevel();
    }

    /**
     * method to set the array list of classes
     * @param schoolClasses
     */
    public void setSchoolClasses(ArrayList<Sclass> schoolClasses) {
        this.schoolClasses = schoolClasses;
    }

    /**
     * method to set the arraylist of instructors
     * @param instructors
     */
    public void setInstructors(ArrayList<Instructor> instructors) {
        this.instructors = instructors;
    }

    /**
     * method to add instructor to the array list of the instructor
     * @param instructor
     */
    public void addInstructor(Instructor instructor){
        instructors.add(instructor);


    }

    /**
     * method to return the array list of the instructors
     * @return
     */

    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    /**
     * method to return the array list of sclasses
     * @return
     */

    public ArrayList<Sclass> getSchoolClasses() {
        return schoolClasses;
    }

}

/**
 *  enum of levels of classes from 1 to 12
 */
enum Level{
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