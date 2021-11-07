package controlselection.month;

public class DayInMonth {

    public static void main(String[] args) {
        DayInMonth dayInMonth = new DayInMonth();
        System.out.println(dayInMonth.getDayNumbers(2000,"FEBRUÁR"));
        System.out.println(dayInMonth.getDayNumbers(2020,"FEBRUÁR"));
        System.out.println(dayInMonth.getDayNumbers(2021,"FEBRUÁR"));

    }

    public int getDayNumbers(int year, String month) {
        int result = 0;
        month = month.toUpperCase();
        switch (month) {
            case "JANUÁR":
                result = 31;
                break;
            case "FEBRUÁR":
                if (((year % 4 == 0) && (!(year % 100 == 0))) || (year % 400 == 0)) {
                    result = 29;
                } else {
                    result = 28;
                }
                break;
            case "MÁRCIUS":
                result = 31;
                break;
            case "ÁPRILIS":
                result = 30;
                break;
            case "MÁJUS":
                result = 31;
                break;
            case "JÚNIUS":
                result = 30;
                break;
            case "JÚLIUS":
                result = 31;
                break;
            case "AUGUSZTUS":
                result = 31;
                break;
            case "SZEPTEMBER":
                result = 30;
                break;
            case "OKTÓBER":
                result = 31;
                break;
            case "NOVEMBER":
                result = 30;
                break;
            case "DECEMBER":
                result = 31;
                break;
            default:
                result = 0;
        }
        return result;
    }


}
