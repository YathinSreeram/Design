package TODO_List_System;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    List<Todo> todos;

    public TodoList() {
        this.todos = new ArrayList<>();
    }

    public List<Todo> getTodoList() {
        return todos;
    }
}
