package projects.activity;

import java.util.List;

public class Activities {
    private List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity){
        activities.add(activity);
    }


    public List<Report> distancesByTypes(){

    }

    public int numberOfTrackActivities(){

    }

    public int numberOfWithoutTrackActivities(){

    }


}
