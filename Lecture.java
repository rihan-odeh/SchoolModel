package ps.school.model;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.json.simple.*;
import ps.school.utils.JsonUtil;

/**
 * @author ro1 Lecture class to be a lecture that has an id, a name, SClass in it, a book assigned to it and a period duration
 */
public class Lecture implements JsonInterface { //each lecture has more than one Period, so to be put in an array list
    private static AtomicInteger id = new AtomicInteger();
    private String name;
    private SClass sC;
    private Book book;
    private List periods;//////

    public Lecture(String name, SClass sC, Book book, List periods) {
        this.id.incrementAndGet();
        this.name = name;
        this.sC = sC;
        this.book = book;
        this.periods = periods;
    }

    public Lecture(Object name, SClass sClass, Object book, Object periods) {
        this.name = (String) name;
        this.sC = sClass;
        this.book = (Book) book;
        this.periods = (List) periods;
    }


    public JSONObject toJson() {
        JsonUtil jsonUtil = new JsonUtil();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Id", id);
        jsonObject.put("Book", book);
        jsonObject.put("Periods", jsonUtil.toJsonArray(periods));
        jsonObject.put("SClass", sC.toJson());
        jsonObject.put("Name", name);
//
        return jsonObject;
    }

    public Lecture fromJson(JSONObject jsonObject) {
        JsonUtil jsonUtil = new JsonUtil();
        return new Lecture(jsonObject.get("Name"), sC.fromJson((JSONObject) jsonObject.get("SClass")), jsonObject.get("Book"), (jsonObject.get("Periods")));
    }


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

    public List getPeriods() {
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

}