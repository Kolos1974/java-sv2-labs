package objectclass;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {
    private List<Object> objects = new ArrayList<>();
    private int cursor;

    public SimpleBag() {
        beforeFirst();
    }

    public void putItem(Object item){
        objects.add(item);
    }

    public boolean isEmpty(){
        return objects.size()==0;
    }

    public int size(){
        return objects.size();
    }

    public void beforeFirst(){
        cursor = -1;

    }

    public boolean hasNext(){
        return (!(isEmpty())) && (objects.size()-1>cursor);
    }

    public Object next(){
        cursor++;
        return objects.get(cursor);
    }

    public boolean contains(Object item){
        for (Object element : objects){
            if (element==item){
                return true;
            }
        }
        return false;
    }

    public int getCursor(){
        return cursor;
    }

}
