package collectionsqueue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ToDoList {
    private List<ToDo> todos = new ArrayList<>();

    public void addTodo(ToDo t){
        todos.add(t);
    }

    public List<ToDo> getTodos() {
        return todos;
    }

    public Deque<ToDo> getTodosInUrgencyOrder(){
        Deque<ToDo> result = new LinkedList<>();
        for (ToDo todo : todos){
            if (todo.isUrgent()){
                result.addFirst(todo);
            } else {
                result.addLast(todo);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.addTodo(new ToDo("Tanulás",true));
        toDoList.addTodo(new ToDo("Bevásárlás",false));
        toDoList.addTodo(new ToDo("Munkavégzés",true));
        toDoList.addTodo(new ToDo("Takarítás",false));
        toDoList.addTodo(new ToDo("Alvás",true));
        toDoList.addTodo(new ToDo("Sétálás",false));
        toDoList.addTodo(new ToDo("Sörözés",false));
        toDoList.addTodo(new ToDo("Mosás",false));

        for (ToDo t : toDoList.getTodos()){
            System.out.println(t.getDescription()+" "+t.isUrgent());
        }

        System.out.println(toDoList.getTodosInUrgencyOrder());

        Deque<ToDo> dlist = toDoList.getTodosInUrgencyOrder();
        System.out.println(dlist);
        dlist.pop();
        System.out.println(dlist);

    }


}
