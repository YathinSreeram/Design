package TODO_List_System;

import java.util.Comparator;
import java.util.List;

public class TodoManager {

    public TodoList todoList;

    public TodoManager(TodoList todoList)
    {
        this.todoList = todoList;
    }

    public TodoList addToDoToList(Todo todo)
    {
        todoList.todos.add(todo);
        return todoList;
    }

    public void markAsCompleteAndDelete(Todo todo)
    {
        todoList.todos.remove(todo);
    }

    public Todo markAsComplete(Todo todo)
    {
        todo.isFinished = true;
        return todo;
    }

    public TodoList sortBasedOnPriority()
    {
        todoList.todos.sort(Comparator.comparing(Todo::getPriority));
        return todoList;
    }

    public List<Todo> getUnfinishedToDos()
    {
        return todoList.todos.stream().filter(t->t.isFinished() == false).toList();
    }

    public void displayFinishedToDos()
    {
        for (Todo t : todoList.todos)
        {
            if(t.isFinished)
                System.out.println(t.toString());
        }
    }
}

