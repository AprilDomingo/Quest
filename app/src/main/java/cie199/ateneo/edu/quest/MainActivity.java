package cie199.ateneo.edu.quest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAddTask = (Button) findViewById(R.id.btn_add_task);
        btnAddTask.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent launchIntent = new Intent(MainActivity.this, AddTask.class);
                        startActivity(launchIntent);

                        return;
                    }
                }
        );

        Button btnItinerary = (Button) findViewById(R.id.btn_itinerary);
        btnItinerary.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent launchIntent = new Intent(MainActivity.this, Itinerary.class);
                        startActivity(launchIntent);

                        return;
                    }
                }
        );

        Button btnMaps = (Button) findViewById(R.id.btn_maps);
        btnMaps.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent launchIntent = new Intent(MainActivity.this, Maps.class);
                        startActivity(launchIntent);

                        return;
                    }
                }
        );
    }


}
