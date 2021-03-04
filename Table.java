/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps.school.model;

import org.json.simple.*;
import ps.school.utils.JsonUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ro1 Table class, is a school sceduale with lectures and sClasses
 */
public class Table implements JsonInterface<Table> {
    private static AtomicInteger id = new AtomicInteger();
    private List lectures;   ////
    private SClass sclass;  /// arrays and maps

    public Table(ArrayList<Lecture> lectures, SClass sclass) {
        this.id.incrementAndGet();
        this.lectures = lectures;
        this.sclass = sclass;
    }

    public Table(Object id, Object lectures, Object sClass) {
        this.id = (AtomicInteger) id;
        this.lectures = (ArrayList) lectures;
        this.sclass = (SClass) sClass;

    }

    public long getId() {
        return id.get();
    }

    public void setId(long id) {
        this.id.incrementAndGet();
    }

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(ArrayList<Lecture> lectures) {
        this.lectures = lectures;
    }

    public SClass getSclass() {
        return sclass;
    }

    public void setSclass(SClass sclass) {
        this.sclass = sclass;
    }

    @Override
    public String toString() {
        return "Table{" + "id= " + id +
                " lectures=" + lectures +
                ", sclass=" + sclass +
                '}';
    }

    public JSONObject toJson() {
        JsonUtil jsonUtil = new JsonUtil();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Id", id);
        jsonObject.put("lectures", jsonUtil.toJsonArray(lectures));
        jsonObject.put("sClass", sclass.toJson());

        return jsonObject;
    }

    public Table fromJson(JSONObject jsonObject) {

        return new Table(jsonObject.get("Id"), jsonObject.get("lectures"), jsonObject.get("sClass"));

    }

}
