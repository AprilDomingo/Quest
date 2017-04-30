package cie199.ateneo.edu.quest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

import static android.R.layout.simple_list_item_1;

public class AddTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);


        Button btnAdd = (Button) findViewById(R.id.btn_add);
        btnAdd.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText edtTask = (EditText) findViewById(R.id.edt_task);
                        EditText edtDate = (EditText) findViewById(R.id.edt_date);
                        EditText edtTime = (EditText) findViewById(R.id.edt_time);
                        EditText edtLocation = (EditText) findViewById(R.id.edt_location);

                        Intent launchIntent = new Intent(AddTask.this, Itinerary.class);

                        launchIntent.putExtra("TASK", edtTask.getText().toString());
                        launchIntent.putExtra("DATE", edtDate.getText().toString());
                        launchIntent.putExtra("TIME", edtTime.getText().toString());
                        launchIntent.putExtra("LOCATION", edtLocation.getText().toString());

                        startActivity(launchIntent);

                        finish();
                        return;
                    }
                }
        );
    }
}
