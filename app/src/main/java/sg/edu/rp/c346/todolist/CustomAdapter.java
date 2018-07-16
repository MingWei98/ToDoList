package sg.edu.rp.c346.todolist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16038911 on 16/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{

    // Create variable for Context, Resource and Objects
    Context parent_context;
    int layout_id;
    ArrayList<TodoItem> todoList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<TodoItem> objects) {
        super(context, resource, objects);

        // Initialize the variables
        parent_context = context;
        layout_id = resource; // todo_item.xml
        todoList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvTodo = rowView.findViewById(R.id.textViewTodo);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);

        // Get the position of the row using .get(position)
        TodoItem currentItem = todoList.get(position);

        // Use the get___() method defined in TodoItem Class
        String name = currentItem.getTodo();
        String date = currentItem.getDateString();

        // Set the name and date to textView using setText()
        tvTodo.setText(name);
        tvDate.setText(date);

        return rowView;
    }
}
