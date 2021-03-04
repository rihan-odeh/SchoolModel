package ps.school.model;

import org.json.simple.*;

public interface JsonInterface<T> {
    JSONObject toJson();

    T fromJson(JSONObject jsonObject);
}
