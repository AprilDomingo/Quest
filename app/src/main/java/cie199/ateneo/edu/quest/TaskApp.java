package cie199.ateneo.edu.quest;

import android.app.Application;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by USER on 4/17/2017.
 */

public class TaskApp extends Application {
    private ArrayList<Task> mTaskList = new ArrayList<Task>();

    public void initializeTaskList() {
        String taskList[] = {"Dinner w/ Friends"};
        String dateList[] = {"4/20/2017"};
        String timeList[] = {"5:00 PM"};
        String locationList[] = {"Kebabs"};

        Task newTask = new Task(taskList[0], dateList[0], timeList[0], locationList[0]);
        mTaskList.add(newTask);

        return;
    }

    public ArrayList<Task> getFriendList(){
        return mTaskList;
    }

}
