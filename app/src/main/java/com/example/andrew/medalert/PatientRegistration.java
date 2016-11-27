package com.example.andrew.medalert;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by andrew on 11/26/16.
 */

public class PatientRegistration extends AppCompatActivity {

    String name;
    String poNum;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patient_registration);

        final EditText nameText = (EditText) findViewById(R.id.namefield);
        final EditText poNumb = (EditText) findViewById(R.id.poNum);

        Button sendAlert = (Button) findViewById(R.id.send_alert);

        sendAlert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(nameText == null || poNumb == null){
                    Toast.makeText(PatientRegistration.this, "Fields are Empty!", Toast.LENGTH_SHORT).show();
                }
                else{
                    name = nameText.getText().toString();
                    poNum = poNumb.getText().toString();
                    Toast.makeText(PatientRegistration.this, "Entry Added!", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

    }
}
