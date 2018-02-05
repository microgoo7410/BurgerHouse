package com.example.shubhamm.burgerhouse;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.shubhamm.burgerhouse.R.id.text;
import static com.example.shubhamm.burgerhouse.R.id.tvIncTwo;


public class Second_Activity extends AppCompatActivity {


    int counter = 0;
    int agg=0;
    //Code for Back
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Button btn = (Button)findViewById(R.id.btnBackTwo);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent activityChangeIntent = new Intent(Second_Activity.this, MainActivity.class);
                Second_Activity.this.startActivity(activityChangeIntent);
            }
        });


        final TextView t1 = (TextView)findViewById(R.id.tvNameTwo);
        //Code for Increment and Decrement

        Button buttonInc= (Button) findViewById(R.id.btnPlusTwo);
        Button buttonDec= (Button) findViewById(R.id.btnMinusTwo);

        buttonInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ++counter;

                TextView txtCount =(TextView) findViewById(R.id.tvIncTwo);
                txtCount.setText(String.valueOf(counter));

                agg=agg+50;
                TextView texAgg =(TextView)findViewById(R.id.tvDisplayTwo);
                texAgg.setText(String.valueOf(agg));
            }

        });

        buttonDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counter == 0)
                {

                }
                else {
                    counter--;
                    agg=agg-50;
                }

                TextView txtCount =(TextView) findViewById(R.id.tvIncTwo);
                txtCount.setText(String.valueOf(counter));
                TextView texAgg =(TextView)findViewById(R.id.tvDisplayTwo);
                texAgg.setText(String.valueOf(agg));

            }
        });


        //Order Button
        Button btnOrder = (Button)findViewById(R.id.btnOrderTwo);
        btnOrder.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v1){

                Intent intent1=new Intent(Second_Activity.this,Personal_info_Activity.class);
                intent1.putExtra("name",t1.getText().toString());
                TextView texAgg =(TextView)findViewById(R.id.tvDisplayTwo);
                intent1.putExtra("price",texAgg.getText().toString());
                TextView tex =(TextView)findViewById(R.id.tvIncTwo);
                intent1.putExtra("quantity",tex.getText().toString());

                Second_Activity.this.startActivity(intent1);
            }
        });




    }



}
