package com.example.shubhamm.burgerhouse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.FirebaseDatabase;


public class Fifth_activity extends AppCompatActivity
{
    int counter=0;
    int agg=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        Button btn = (Button)findViewById(R.id.btnBackFive);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(Fifth_activity.this, MainActivity.class);

                // currentContext.startActivity(activityChangeIntent);

                Fifth_activity.this.startActivity(activityChangeIntent);
            }
        });

        final TextView t1 = (TextView)findViewById(R.id.tvNameFive);

        Button buttonInc= (Button) findViewById(R.id.btnPlusFive);
        Button buttonDec= (Button) findViewById(R.id.btnMinusFive);

        buttonInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                TextView txtCount =(TextView) findViewById(R.id.tvIncFive);
                txtCount.setText(String.valueOf(counter));

                agg=agg+170;
                TextView texAgg =(TextView)findViewById(R.id.tvDisplayFive);
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
                    agg=agg-170;
                }
                TextView txtCount =(TextView) findViewById(R.id.tvIncFive);
                txtCount.setText(String.valueOf(counter));
                TextView texAgg =(TextView)findViewById(R.id.tvDisplayFive);
                texAgg.setText(String.valueOf(agg));

            }
        });


        Button btnOrder = (Button)findViewById(R.id.btnOrderFive);
        btnOrder.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v1){

                Intent intent1=new Intent(Fifth_activity.this,Personal_info_Activity.class);
                intent1.putExtra("name",t1.getText().toString());
                TextView texAgg =(TextView)findViewById(R.id.tvDisplayTwo);
                intent1.putExtra("price",texAgg.getText().toString());
                TextView tex =(TextView)findViewById(R.id.tvIncTwo);
                intent1.putExtra("quantity",tex.getText().toString());

                Fifth_activity.this.startActivity(intent1);
            }
        });
    }
}
