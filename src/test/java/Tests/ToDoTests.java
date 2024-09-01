package Tests;
import TODO_List_System.Todo;
import TODO_List_System.TodoList;
import TODO_List_System.TodoManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToDoTests {

    TodoList todoList;

    Todo todo1;
    Todo todo2;
    Todo todo3;

    TodoManager todoManager;

    @BeforeEach
    public void setUp()
    {
        todo1 = new Todo(
                "Finish Java Assignment",
                "Complete the Java assignment on classes and objects",
                LocalDateTime.of(2024, 9, 5, 14, 30),
                1
        );

        todo2 = new Todo(
                "Grocery Shopping",
                "Buy groceries: milk, bread, eggs, and fruits",
                LocalDateTime.of(2024, 9, 2, 10, 0),
                3
        );

        todo3 = new Todo(
                "Doctor's Appointment",
                "Routine check-up with Dr. Smith at the downtown clinic",
                LocalDateTime.of(2024, 9, 3, 16, 0),
                2
        );

        todoList = new TodoList();
        todoManager = new TodoManager(todoList);
    }

    @Test
    public void addToDoTest()
    {
        todoList.getTodoList().add(todo1);
        assertEquals(todoList, todoManager.addToDoToList(todo1));
    }

    @Test
    public void markAsCompleteTest()
    {
        todo1.setFinished(true);
        assertEquals(todo1, todoManager.markAsComplete(todo1));
    }

    @Test
    public void sortBasedOnPriorityTest()
    {
        todoList.getTodoList().add(todo1);
        todoList.getTodoList().add(todo3);
        todoList.getTodoList().add(todo2);
        assertEquals(todoList, todoManager.sortBasedOnPriority());
    }

    @Test
    public void displayUnfinishedToDoTest()
    {
        TodoList temp = new TodoList();
        for (Todo t : todoList.getTodoList())
        {
            if(t.isFinished() == false)
            {
                temp.getTodoList().add(t);
            }
        }
        assertEquals(temp.getTodoList(), todoManager.getUnfinishedToDos());

    }

}
