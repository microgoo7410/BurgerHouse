package com.example.shubhamm.burgerhouse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Third_Activity extends AppCompatActivity
{
    int counter=0;
    int agg=0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Button btn = (Button)findViewById(R.id.btnBackThree);
        btn.setOnClickListener(new View.OnClickListener()
        {
        public void onClick(View v)
        {

        Intent activityChangeIntent = new Intent(Third_Activity.this, MainActivity.class);
        Third_Activity.this.startActivity(activityChangeIntent);
        }
    });

        final TextView t1 = (TextView)findViewById(R.id.tvNameThree);

        Button buttonInc= (Button) findViewById(R.id.btnPlusThree);
        Button buttonDec= (Button) findViewById(R.id.btnMinusThree);

        buttonInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                TextView txtCount =(TextView) findViewById(R.id.tvIncThree);
                txtCount.setText(String.valueOf(counter));

                agg=agg+190;
                TextView texAgg =(TextView)findViewById(R.id.tvDisplayThree);
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
                    agg=agg-190;
                }
                TextView txtCount =(TextView) findViewById(R.id.tvIncThree);
                txtCount.setText(String.valueOf(counter));
                TextView texAgg =(TextView)findViewById(R.id.tvDisplayThree);
                texAgg.setText(String.valueOf(agg));

            }
        });

        Button btnOrder = (Button)findViewById(R.id.btnOrderThree);
        btnOrder.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v1){

                Intent intent1=new Intent(Third_Activity.this,Personal_info_Activity.class);
                intent1.putExtra("name",t1.getText().toString());
                TextView texAgg =(TextView)findViewById(R.id.tvDisplayThree);
                intent1.putExtra("price",texAgg.getText().toString());
                TextView tex =(TextView)findViewById(R.id.tvIncThree);
                intent1.putExtra("quantity",tex.getText().toString());

                Third_Activity.this.startActivity(intent1);
            }
        });

    }
}
