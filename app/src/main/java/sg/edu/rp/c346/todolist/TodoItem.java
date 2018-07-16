package sg.edu.rp.c346.todolist;

import java.util.Calendar;

/**
 * Created by 16038911 on 16/7/2018.
 */

public class TodoItem {
    private String todo;
    private Calendar date;

    public TodoItem(String todo, Calendar date) {
        this.todo = todo;
        this.date = date;
    }

    // Get and Set methods
    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getDateString(){
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR);
        return str;
    }
}
