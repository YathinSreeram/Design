package TODO_List_System;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Todo {

    String title;
    String taskDescription;
    LocalDateTime dateTime;
    int priority;
    boolean isFinished;

    public Todo(String title, String taskDescription, LocalDateTime dateTime, int priority) {
        this.title = title;
        this.taskDescription = taskDescription;
        this.dateTime = dateTime;
        this.priority = priority;
        this.isFinished = false;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "title='" + title + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", dateTime=" + dateTime +
                ", priority=" + priority +
                '}';
    }
}