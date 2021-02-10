package schoolmodel;

import java.util.ArrayList;

/**
 * School class has attributes of admin object, instructor object and sclass object
 */

public class School {
    private Admin admin;
    private ArrayList<Instructor> instructors;
    private ArrayList<Sclass> sclasses;

    /**
     * constructor of school class
     * @param admin
     * @param instructors
     * @param sclasses
     */
    public School(Admin admin, ArrayList<Instructor> instructors, ArrayList<Sclass> sclasses) {
        this.admin = admin;
        this.instructors = instructors;
        this.sclasses = sclasses;
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

    /**
     *
     * @return list of sClasses
     */
    public ArrayList<Sclass> getSclasses() {
        return sclasses;
    }

    /**
     *
     * @param sclasses to assign it
     */
    public void setSclasses(ArrayList<Sclass> sclasses) {
        this.sclasses = sclasses;
    }

    /**
     *
     * @param instructor to add to the list of instructors of this class
     */
    public void addInstructor(Instructor instructor){
        instructors.add(instructor);
    }

    /**
     *
     * @param sclass to add it the list of sclasses of this class
     */
    public void addSclass(Sclass sclass){
        sclasses.add(sclass);
    }
}
