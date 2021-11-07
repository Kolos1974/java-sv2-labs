package controlselection.week;


public class DayOfWeeks {
    public static void main(String[] args) {
        DayOfWeeks dayOfWeeks = new DayOfWeeks();
        System.out.println(dayOfWeeks.getDayOfType("szerda"));
        System.out.println(dayOfWeeks.getDayOfType("szombat"));
        System.out.println(dayOfWeeks.getDayOfType("monday"));
    }

    public String getDayOfType(String day){
        day = day.toUpperCase();
        String result = "";
        switch (day){
            case "HÉTFŐ":
                result = "hét eleje";
                break;
            case "KEDD":
            case"SZERDA":
            case "CSÜTÖRTÖK":
                result = "hét közepe";
                break;
            case "PÉNTEK":
                result = "majdnem hétvége";
                break;
            case "SZOMBAT":
            case "VASÁRNAP":
                result = "hét vége!";
                break;
            default:
                result="ismeretlen nap";
        }
        return result;
    }

}
