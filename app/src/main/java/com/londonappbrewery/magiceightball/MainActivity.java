package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask = (Button) findViewById(R.id.button);
       final ImageView img = (ImageView) findViewById(R.id.img);
        //int number = Random number;
       final int[] imgArray = {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};

        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("pressed","yes");
                Random Generator = new Random();
                int number = Generator.nextInt(5);
                img.setImageResource(imgArray[number]);

            }
        });
    }

}
