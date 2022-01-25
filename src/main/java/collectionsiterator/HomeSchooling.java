package collectionsiterator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeSchooling {
    private List<OnlineLesson> lessons = new ArrayList<>();

    public List<OnlineLesson> getLessons() {
        return lessons;
    }

    public void addNewLesson(OnlineLesson lesson){
        //lessons.add(lesson);
        int pos = 0;
        for (int i = 0; i<lessons.size(); i++){
            if (lessons.get(i).getStartTime().isAfter(lesson.getStartTime())){
                pos = i;
            }
        }
        lessons.add(pos, lesson);
    }

    public List<OnlineLesson> getLessonsByTitle(String title){
        List<OnlineLesson> result = new ArrayList<>();
        Iterator<OnlineLesson> i = lessons.iterator();
        while (i.hasNext()){
            OnlineLesson element = i.next();
            if (element.getLessonTitle().equals(title)){
                result.add(element);
            }
        }
        return result;
    }

    public void removeLesson(LocalDateTime startTime){
        Iterator<OnlineLesson> i = lessons.iterator();
        while (i.hasNext()){
            OnlineLesson element = i.next();
            if (element.getStartTime().equals(startTime)){
                i.remove();
            }
        }
    }


}
