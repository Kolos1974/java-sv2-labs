package defaultconstructor.date;

public class SimpleDate {
    private int year;
    private int month;
    private int day;

    public void setDate(int year, int month, int day){
        if (isCorrect(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("One or more given parameter cannot be applied! "+year+", "+month+", "+day);
        }

    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    private boolean isCorrect(int year, int month, int day){
        boolean result = true;
        if (!(year>=1900)){
            result = false;
        }
        if (!(month>=0 && month<=12)){
            result = false;
        }
        if (!(day>0 && day<=calculateMonythLength(year, month))){
            result = false;
        }
        return result;
    }

    private boolean isLeapYear(int year){
        if (((year%4==0) && (!(year%100==0))) || (year%400==0)){
            return true;
        }
        return false;
    }

    private int calculateMonythLength(int year, int month){
        if ((month==1) || (month==3) || (month==5) || (month==7) || (month==8) || (month==10) || (month==12)){
            return 31;
        }
        if (month==2){
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        }
        return 30;
    }


}
