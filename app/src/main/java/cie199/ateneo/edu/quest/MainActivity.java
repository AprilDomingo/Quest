package cie199.ateneo.edu.quest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

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

        Button btnMaps = (Button) findViewById(R.id.btn_maps);
        btnMaps.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent launchIntent = new Intent(MainActivity.this, MapsActivity.class);
                        startActivity(launchIntent);

                        return;
                    }
                }
        );

        Button btnBluetooth = (Button) findViewById(R.id.btn_bluetooth);
        btnBluetooth.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent launchIntent = new Intent(MainActivity.this, BluetoothActivity.class);
                        startActivity(launchIntent);

                        return;
                    }
                }
        );
    }


}
