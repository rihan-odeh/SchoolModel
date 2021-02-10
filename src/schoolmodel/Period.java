

        package schoolmodel;
        import java.time.LocalTime;
/**
 *
 * @author ro1 Period class is to be the time and day of each lecture
 */
        public class Period {
        private Day day;
        private Time time;
        /**
         * constructor
         * @param day
         * @param time
         */
        public Period(Day day, Time time){
        this.day = day;
        this.time= time;
        }
        public void setDay(Day day) {
        this.day = day;
        }
        public void setTime(Time time) {
        this.time = time;
        }
        public Period (){
        }
/**
 *
 * @return Day of this period
 */
        public Day getDay() {
        return day;
        }
/**
 *
 * @return time of this period in the format HH:MM
 */
        public Time getTime() {
        return time;
        }
            public String toString(){
        return this.day +" from: "+ this.time.startTimeOfEachClass(this.time)+ " to " + this.time.endTimeOfEachClass(time);
        }
/**
 * enum for days
 */
enum Day{
    Saturday ,
    Sunday ,
    Monday ,
    Tuesday ,
    Wednesday ,


}
/**
 * enum for order of each period\ school class
 */
enum Time{

    first ,
    Second ,
    Third ,
    Break,
    Forth ,
    Fifth,
    Sixth;

    /**
     * method to find when each period\ class ends
     * @param time
     * @return
     */
    public LocalTime endTimeOfEachClass(Time time){
        return  (LocalTime.of(8,45).plusMinutes((time.ordinal())*45));
    }
    /**
     * method to find when each Time starts
     * @param time
     * @return
     */
    public LocalTime startTimeOfEachClass(Time time){

        return  (LocalTime.of(8,0).plusMinutes((time.ordinal())*45));
    }

}


}