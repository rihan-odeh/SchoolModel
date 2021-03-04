package ps.school.utils;

import org.json.simple.*;
import ps.school.model.JsonInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonUtil {


    public JSONArray toJsonArray(List<JsonInterface> list) {
        JSONArray jsonArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            jsonArray.add((list.get(i)).toJson());
        }
        return jsonArray;
    }



//    public JSONObject toJsonObject(Object object) {
//        JSONObject jsonObject = new JSONObject();
//
//        jsonObject.put(object.toString(), object.toString());
//        return jsonObject;
//    }

    /**
     * @return
     */
    public JSONObject toJsonMap() {
        return toJsonMap();
    }
    public JSONObject toJson(Collection object){
        JSONObject jsonObject = new JSONObject();
        for (int i=0; i< object.size(); i++){
            jsonObject.put(object.toString(), object);
        }
        return jsonObject;
    }

    /**
     * @param map
     * @return
     */
    public JSONObject toJsonMap(Map map) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(map.keySet(),toJson(map.values()));



        return jsonObject;
    }
    public Map fromJsonMap(JSONObject jsonObject){
        return new HashMap(jsonObject);

    }
    public JsonInterface fromJson(JSONObject jsonObject){

        return (JsonInterface) (jsonObject);
    }
    /*  public JSONListAdapter mapToJson(){

        JSONListAdapter jsonObject = new JSONListAdapter (periods);
        return jsonObject;
    }*/
}
