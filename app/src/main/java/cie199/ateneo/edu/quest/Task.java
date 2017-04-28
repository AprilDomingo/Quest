package cie199.ateneo.edu.quest;

/**
 * Created by USER on 4/17/2017.
 */

public class Task {
    private String mTask = "";
    private String mDate = "";
    private String mTime = "";
    private String mLocation = "";

    public Task(String task, String date, String time, String location) {
        mTask = task;
        mDate = date;
        mTime = time;
        mLocation = location;
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
}
