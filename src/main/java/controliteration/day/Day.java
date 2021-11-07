package controliteration.day;

import java.util.ArrayList;
import java.util.List;

public class Day {
    List<Hour> hoursOfDay = new ArrayList<>();

    public List<Hour> getHoursOfDay() {
        return hoursOfDay;
    }

    public void addHour(Hour hour) {
        hoursOfDay.add(hour);
    }

    public void setDayPariod() {
        for (Hour h : hoursOfDay) {
            if ((h.getHourNumber() >= 6) && (h.getHourNumber() <= 22)) {
                h.setPeriod(DayPeriod.DAYTIME);
            } else {
                h.setPeriod(DayPeriod.NIGHTTIME);
            }
        }
    }

    public static void main(String[] args) {
        Day day = new Day();
        day.addHour(new Hour(9));
        day.addHour(new Hour(14));
        day.addHour(new Hour(21));
        day.addHour(new Hour(23));

        for (int i = 0; i < day.getHoursOfDay().size(); i++) {
            System.out.println(day.getHoursOfDay().get(i).getHourNumber());
            System.out.println(day.getHoursOfDay().get(i).getPeriod());
        }
        day.setDayPariod();

        System.out.println();
        for (int i = 0; i < day.getHoursOfDay().size(); i++) {
            System.out.println(day.getHoursOfDay().get(i).getHourNumber());
            System.out.println(day.getHoursOfDay().get(i).getPeriod());
        }

    }
}