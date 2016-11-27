package com.example.andrew.medalert;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by andrew on 11/26/16.
 */

public class PatientRegistration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patient_registration);

        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.SEND_SMS)
                != PackageManager.PERMISSION_GRANTED) {

            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.SEND_SMS)) {

                // Show an explanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.

            } else {

                // No explanation needed, we can request the permission.

                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.SEND_SMS},
                        1);

                // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
                // app-defined int constant. The callback method gets the
                // result of the request.
            }
        }

        final EditText nameText = (EditText) findViewById(R.id.namefield);
        final EditText poNumb = (EditText) findViewById(R.id.poNum);

        Button sendAlert = (Button) findViewById(R.id.send_alert);

        sendAlert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                String name = nameText.getText().toString();
                String poNum = poNumb.getText().toString();

                if(name.matches("") || poNum.matches("")){
                    Toast.makeText(PatientRegistration.this, "Fields are Empty!", Toast.LENGTH_SHORT).show();
                    return;
                }
                else{

                    String finale = name + ", +1" + poNum;
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage("+16472819071", null, finale, null, null);
                    Toast.makeText(PatientRegistration.this, "Message Sent!", Toast.LENGTH_LONG).show();
                    finish();
                }
            }
        });

    }
}
