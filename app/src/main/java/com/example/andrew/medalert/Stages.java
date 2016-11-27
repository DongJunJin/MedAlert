package com.example.andrew.medalert;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by andrew on 11/26/16.
 */

public class Stages extends Activity {

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stages);

        Button front = (Button) findViewById(R.id.front_button);
        Button back = (Button) findViewById(R.id.back_button);
        ImageView image = (ImageView) findViewById(R.id.image_switch);
        image.setScaleType(ImageView.ScaleType.FIT_XY);

            front.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    counter++;
                    if(counter > 8){
                        counter = 8;
                    }
                    else {
                        switcher(counter);
                    }
                }
            }));

            back.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    counter--;
                    if(counter < 0) {
                        counter = 0;
                    }
                    else {
                        switcher(counter);
                    }
                }
            }));


        }

    void switcher(int i){

        ImageView image = (ImageView) findViewById(R.id.image_switch);
        image.setScaleType(ImageView.ScaleType.FIT_XY);

        switch (i){
            case 0: image.setImageResource(R.drawable.stages_011);
                break;

            case 1: image.setImageResource(R.drawable.stages_02);
                break;

            case 2: image.setImageResource(R.drawable.stages_03);
                break;

            case 3: image.setImageResource(R.drawable.stages_04);
                break;

            case 4: image.setImageResource(R.drawable.stages_05);
                break;

            case 5: image.setImageResource(R.drawable.stages_06);
                break;

            case 6: image.setImageResource(R.drawable.stages_07);
                break;

            case 7: image.setImageResource(R.drawable.stages_08);
                break;
        }
    }
}
