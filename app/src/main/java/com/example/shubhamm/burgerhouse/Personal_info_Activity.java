package com.example.shubhamm.burgerhouse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Attributes;

public class Personal_info_Activity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitvity_sixth);

        Button btn =(Button)findViewById(R.id.btnBackSix);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityChangeIntent = new Intent(Personal_info_Activity.this,MainActivity.class);
                Personal_info_Activity.this.startActivity(activityChangeIntent);
                finish();
            }
        });

        final String s= getIntent().getStringExtra("name");
        final String s1= getIntent().getStringExtra("price");
        final String s2= getIntent().getStringExtra("quantity");


        final EditText etNsme =(EditText)findViewById(R.id.etNameSix);
        final EditText etMob= (EditText)findViewById(R.id.etMobSix);
        Button btnConfirm =(Button)findViewById(R.id.btnConfirmSix);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
           // String MobilePattern = "[0-9]{10}";
            public void onClick(View view) {
                String Name=etNsme.getText().toString();
                String Mob=etMob.getText().toString();

               // String MobilePattern = "[0-9]{10}";
                if (Name.length()>25)
                {
                    etNsme.requestFocus();
                    etNsme.setError("Name can not be more than 25 Character");
                }
                else if(Name.length()==0)
                {
                    etNsme.requestFocus();
                    etNsme.setError("Field Cannot Be Empty");
                }
                else if(!Name.matches("[a-zA-Z]+"))
                {
                    etNsme.requestFocus();
                    etNsme.setError("Enter Only Alphabetical Character");
                }
                else if(Mob.length() != 10)
                {
                    etMob.requestFocus();
                    etMob.setError("Enter a Valid Mobile Number");
                }
                else if(Mob.matches("[a-zA-Z]+"))
                {
                    etMob.requestFocus();
                    etMob.setError("Character are not allowed in this Filed Only Numbers");
                }
                else
                {
                    Toast.makeText(Personal_info_Activity.this,s +"= "+ s1 + "Rs\nName:"+Name +"\nMobile Number: "+Mob+"\n\n"+"Your order has been placed.",Toast.LENGTH_LONG).show();
                }
            }
        });








    }


    }