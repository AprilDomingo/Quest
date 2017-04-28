package cie199.ateneo.edu.quest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Itinerary extends AppCompatActivity {
    private ArrayList<TaskStatus> mMessageList = new ArrayList<TaskStatus>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary);
    }

    private class TaskStatus {
        private String mTask = "";
        private String mLocation = "";

        public TaskStatus(String task, String location) {
            mTask = task;
            mLocation = location;
            return;
        }

        public String getUsername() {

            return mTask;
        }

        public String getStatusMessage() {

            return mLocation;
        }
    }
}
