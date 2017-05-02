package cie199.ateneo.edu.quest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.layout.simple_list_item_1;

public class AddTask extends AppCompatActivity {
    private ArrayList<TaskDetails> mItineraryList = new ArrayList<TaskDetails>();
    private ArrayAdapter<TaskDetails> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        adapter = new ArrayAdapter<TaskDetails>(this, android.R.layout.simple_list_item_1, mItineraryList);
        ListView lstItinerary = (ListView) findViewById(R.id.lst_itinerary);
        lstItinerary.setAdapter(adapter);

        Button btnAdd = (Button) findViewById(R.id.btn_add);
        btnAdd.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText edtTask = (EditText) findViewById(R.id.edt_task);
                        String taskStr = edtTask.getText().toString();
                        EditText edtDate = (EditText) findViewById(R.id.edt_date);
                        String dateStr = edtDate.getText().toString();
                        EditText edtTime = (EditText) findViewById(R.id.edt_time);
                        String timeStr = edtTime.getText().toString();
                        EditText edtLocation = (EditText) findViewById(R.id.edt_location);
                        String locationStr = edtLocation.getText().toString();

                        postTask(taskStr, dateStr, timeStr, locationStr);

                        return;
                    }
                }
        );

        adapter.notifyDataSetChanged();
    }
    private class TaskDetails {
        private String mTask = "";
        private String mDate = "";
        private String mTime = "";
        private String mLocation = "";

        public TaskDetails(String task, String date, String time, String location) {
            mTask = task;
            mDate = date;
            mTime = time;
            mLocation = location;
            return;
        }

        public String getTask() {

            return mTask;
        }

        public String getDate() {

            return mDate;
        }

        public String getTime() {

            return mTime;
        }


        public String getLocation() {

            return mLocation;
        }

        public String toString() {

            return getTask() + "\n" + getDate() + "\n" + getTime() + "\n" + getLocation();
        }
    }

    private void postTask(String taskStr, String dateStr, String timeStr, String locationStr) {

        mItineraryList.add(new TaskDetails(taskStr, dateStr, timeStr, locationStr));
        adapter.notifyDataSetChanged();

        return;
    }

}
