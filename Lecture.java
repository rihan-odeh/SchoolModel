package schoolmodel;
import java.util.ArrayList;
/**
 *
 * @author ro1 Lecture class to be a lecture that has an id, a name, Sclass in it, a book assigned to it and a period duration
 */
public class Lecture { //each lecture has more than one Period, so to be put in an array list
    private  int id;
    private String name;
    private Sclass sC;
    private Book book;
    private ArrayList<Period> periods = new ArrayList<>() ;


    /**
     * constructor that assigns values to the attributes
     * @param id
     * @param Name
     * @param sC
     * @param book
     * @param period
     *
     */
    public Lecture(int id , String Name, Sclass sC, Book book, ArrayList<Period> period){
        this.id = id;
        this.name = Name;
        this.sC =sC;
        this.book = book;
        this.periods = period;
    }
    public Lecture(int id , String Name, Sclass sC, Book book, Period period){
        this.id = id;
        this.name = Name;
        this.sC =sC;
        this.book = book;
        addPeriod(period);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sclass getsC() {
        return sC;
    }

    public void setsC(Sclass sC) {
        this.sC = sC;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public ArrayList<Period> getPeriods() {
        return periods;
    }

    public void setPeriods(ArrayList<Period> periods) {
        this.periods = periods;
    }

    public void addPeriod(Period period){
        periods.add(period);
    }
    /**
     * setters
     *
     * @param Period of this lecture
     */
    public void setPeriod(ArrayList<Period> Period){
        this.periods= Period;
    }
    /**
     *
     * @return duration of this lecture
     */
    public ArrayList<Period> getPeriod(){
        return this.periods;
    }
    /**
     * @return String representation of the lecture
     */
    public String toString(){
        return "Lecture: " + getName() + " has an id of:  " +getId() +"\n with school class:\n "+ getsC() +" assigned with Book: \n " + getBook() + "\n with a duration of: "+ getPeriod().toString();
    }
}