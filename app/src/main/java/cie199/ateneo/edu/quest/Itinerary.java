package cie199.ateneo.edu.quest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Itinerary extends AppCompatActivity {
    private ArrayList<TaskDetails> mItineraryList = new ArrayList<TaskDetails>();
    private ArrayAdapter<TaskDetails> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary);

        adapter = new ArrayAdapter<TaskDetails>(this, android.R.layout.simple_list_item_1, mItineraryList);

        ListView lstItinerary = (ListView) findViewById(R.id.lst_itinerary);

        Intent receivedIntent = getIntent();
        String task = receivedIntent.getStringExtra("TASK");
        String date = receivedIntent.getStringExtra("DATE");
        String time = receivedIntent.getStringExtra("TIME");
        String location = receivedIntent.getStringExtra("LOCATION");

        postTask(task, date, time, location);

        lstItinerary.setAdapter(adapter);

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

            return getTask() + ", " + getDate() + ", " + getTime() + ", " + getLocation();
        }
    }

    private void postTask(String taskStr, String dateStr, String timeStr, String locationStr) {

        mItineraryList.add(new TaskDetails(taskStr, dateStr, timeStr, locationStr));
        adapter.notifyDataSetChanged();

        return;
    }
}
