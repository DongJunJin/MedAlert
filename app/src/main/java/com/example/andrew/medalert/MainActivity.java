package com.example.andrew.medalert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button stages = (Button) findViewById(R.id.stages);
        Button pReg = (Button) findViewById(R.id.pReg);
        Button symptoms = (Button) findViewById(R.id.symptoms);
        Button messages = (Button) findViewById(R.id.messages);

        stages.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });

        pReg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), PatientRegistration.class);
                startActivity(intent);
            }
        });

        symptoms.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });

        messages.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });
    }
}
