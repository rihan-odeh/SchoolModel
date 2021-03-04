

package ps.school.model;

import org.json.simple.*;


/**
 * @author ro1 Period class is to be the time and day of each lecture
 */
public class Period implements JsonInterface {
    private Day day;
    private Time time;


    /**
     * constructor
     *
     * @param day
     * @param time
     */
    public Period(Day day, Time time) {
        this.day = day;
        this.time = time;
    }

    public Period(Object day, Object time) {
        this.day = (Day) day;
        this.time = (Time) time;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public void setTime(Time time) {
        this.time = time;
    }


    /**
     * @return Day of this period
     */
    public Day getDay() {
        return day;
    }

    /**
     * @return time of this period in the format HH:MM
     */
    public Time getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Period{" +
                "day=" + day +
                ", time=" + time +
                '}';
    }

    public JSONObject toJson() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("day", day);
        jsonObject.put("time", time);

//
//
        return jsonObject;
    }

    public Period fromJson(JSONObject jsonObject) {

        return new Period(jsonObject.get("day"), jsonObject.get("time"));

    }

    /**
     * enum for days
     */
    public enum Day {
        Saturday,
        Sunday,
        Monday,
        Tuesday,
        Wednesday,


    }

    /**
     * enum for order of each period\ school class
     */
    public enum Time {

        first,
        Second,
        Third,
        Break,
        Forth,
        Fifth,
        Sixth;


    }


}