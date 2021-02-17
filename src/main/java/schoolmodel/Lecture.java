package schoolmodel;

//import org.json.simple.JSONObject;
import jdk.nashorn.internal.runtime.JSONListAdapter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ro1 Lecture class to be a lecture that has an id, a name, SClass in it, a book assigned to it and a period duration
 */
public class Lecture { //each lecture has more than one Period, so to be put in an array list
    private static AtomicInteger id = new AtomicInteger();
    private String name;
    private SClass sC;
    private Book book;
    private ArrayList<Period> periods ;//////
    //JSONObject obj=new JSONObject();

    public Lecture( String name, SClass sC, Book book, ArrayList<Period> periods) {
        this.id.incrementAndGet();
        this.name = name;
        this.sC = sC;
        this.book = book;
        this.periods = periods;
    }
public String getObj(){

        return JSONValue.toJSONString(periods);
}
    public String toJson(){
        return JSONValue.toJSONString(this);
    }
  /*  public JSONListAdapter mapToJson(){

        JSONListAdapter jsonObject = new JSONListAdapter (periods);
        return jsonObject;
    }*/
    public int getId() {
        return id.get();
    }

    public void setId() {
        this.id.incrementAndGet();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SClass getsC() {
        return sC;
    }

    public void setsC(SClass sC) {
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

    @Override
    public String toString() {
        return "Lecture{" +
                "name='" + name + '\'' +
                ", sC=" + sC +
                ", book=" + book +
                ", periods=" + periods +
                '}';
    }
    /*
     * constructor that assigns values to the attributes
     *
     * @param id
     * @param Name
     * @param sC
     * @param book
     * @param period
     *
    public Lecture(int id, String Name, SClass sC, Book book, ArrayList<Period> period) {
        this.id = id;
        this.name = Name;
        this.sC = sC;
        this.book = book;
        this.periods = period;
    }

    public Lecture(int id, String Name, SClass sC, Book book, Period period) {
        this.id = id;
        this.name = Name;
        this.sC = sC;
        this.book = book;
        addPeriod(period);
    }

    public Lecture(int id, String name, Book book, ArrayList<Period> periods) {
        this.id = id;
        this.name = name;
        this.book = book;
        this.periods = periods;
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

    public SClass getsC() {
        return sC;
    }

    public void setsC(SClass sC) {
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

    public void addPeriod(Period period) {
        periods.add(period);
    }

    /**
     * setters
     *
     * @param Period of this lecture
     *
    public void setPeriod(ArrayList<Period> Period) {
        this.periods = Period;
    }

    /**
     * @return duration of this lecture
     *
    public ArrayList<Period> getPeriod() {
        return this.periods;
    }

    /**
     * @return String representation of the lecture
     *
    public String toString() {
        return "Lecture: " + getName() + " has an id of:  " + getId() + "\n with school class:\n " + getsC() + " assigned with Book: \n " + getBook() + "\n with a duration of: " + getPeriod().toString();
    }*/
}