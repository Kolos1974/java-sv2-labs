package exceptionclass.course;

public class SimpleTime {
    private int hour;
    private int minute;

    public SimpleTime(int hour, int minute) {
        validateHour(hour);
        validateMinute(minute);
        this.hour = hour;
        this.minute = minute;
    }

    public SimpleTime(String time){
        if (isNull(time)){
            throw new InvalidTimeException("Time is null");
        }
        validateStringFormat(time);
        int hour = Integer.parseInt(time.substring(0,2));
        int minute = Integer.parseInt(time.substring(3,5));
        validateHour(hour);
        validateMinute(minute);

        this.hour = hour;
        this.minute = minute;
    }

    public void validateHour(int hour){
        if ((hour<0) || (hour>23)) {
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
    }

    public void validateMinute(int minute){
        if((minute<0) || (minute>59)) {
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
    }

    public boolean isNull(String text){
        if (text==null){
            return true;
        }
        else {
            return false;
        }
    }

    public void validateStringFormat(String text){
        if ((!(text.length()==5)) || (!(text.substring(2,3).equals(":")))){
            throw new InvalidTimeException("Time is not hh:mm");
        }
        try {
            int hour = Integer.parseInt(text.substring(0,2));
            int minute = Integer.parseInt(text.substring(3,5));

        } catch (NumberFormatException nfe){
            throw new InvalidTimeException("Time is not hh:mm");
        }

    }


    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString() {
        String h = "00"+hour;
        String m = "00"+minute;
        return  h.substring(h.length()-2, h.length())+":"+m.substring(m.length()-2, m.length());
    }

    public static void main(String[] args) {
        SimpleTime simpleTime = new SimpleTime(1,8);
        System.out.println(simpleTime);
        //SimpleTime simpleTime1 = new SimpleTime(33,22);

    }

}
