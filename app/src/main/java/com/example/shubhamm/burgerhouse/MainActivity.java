package com.example.shubhamm.burgerhouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner mySpinner = (Spinner)findViewById(R.id.spinner1);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        mySpinner.setOnItemSelectedListener(new OnItemSelectedListener()
        {

            public void onClick(View v) {
                // TODO Auto-generated method stub

            }

            public void onItemSelected(AdapterView<?> arg0, View view,
                                       int position, long row_id) {

                switch (position) {
                    case 1:
                       Intent intent1 = new Intent(MainActivity.this, Second_Activity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                       Intent intent2 = new Intent(MainActivity.this, Third_Activity.class);
                        startActivity(intent2);
                       break;
                    case 3:
                       Intent intent3 = new Intent(MainActivity.this, Fourth_Activity.class);
                        startActivity(intent3);
                       break;
                    case 4:
                        Intent intent4 = new Intent(MainActivity.this, Fifth_activity.class);
                        startActivity(intent4);
                        break;


                }
                //startActivity(intent);
            }

            public void onNothingSelected(AdapterView<?> arg0) {

            }

        });
    }
};
