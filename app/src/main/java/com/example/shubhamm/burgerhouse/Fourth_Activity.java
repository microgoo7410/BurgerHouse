package com.example.shubhamm.burgerhouse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Fourth_Activity extends AppCompatActivity
{

    int counter = 0;
    int agg=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        Button btn = (Button)findViewById(R.id.btnBackFour);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(Fourth_Activity.this, MainActivity.class);

                // currentContext.startActivity(activityChangeIntent);

                Fourth_Activity.this.startActivity(activityChangeIntent);
            }
        });


        final TextView t1 = (TextView)findViewById(R.id.tvNameFour);


        Button buttonInc= (Button) findViewById(R.id.btnPlusFour);
        Button buttonDec= (Button) findViewById(R.id.btnMinusFour);

        buttonInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                TextView txtCount =(TextView) findViewById(R.id.tvIncFour);
                txtCount.setText(String.valueOf(counter));

                agg=agg+150;
                TextView texAgg =(TextView)findViewById(R.id.tvDispFour);
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
                    agg=agg-150;
                }
                TextView txtCount =(TextView) findViewById(R.id.tvIncFour);
                txtCount.setText(String.valueOf(counter));
                TextView texAgg =(TextView)findViewById(R.id.tvDispFour);
                texAgg.setText(String.valueOf(agg));

            }
        });


        Button btnOrder = (Button)findViewById(R.id.btnOrderFour);
        btnOrder.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v1){

                Intent intent1=new Intent(Fourth_Activity.this,Personal_info_Activity.class);
                intent1.putExtra("name",t1.getText().toString());
                TextView texAgg =(TextView)findViewById(R.id.tvDispFour);
                intent1.putExtra("price",texAgg.getText().toString());
                TextView tex =(TextView)findViewById(R.id.tvIncFour);
                intent1.putExtra("quantity",tex.getText().toString());

                Fourth_Activity.this.startActivity(intent1);
            }
        });
    }
}
