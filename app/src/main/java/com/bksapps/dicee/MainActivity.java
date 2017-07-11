package com.bksapps.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button rollButton;
    ImageView image_leftDice,image_rightDice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollButton=(Button)findViewById(R.id.rollButton);
        image_leftDice=(ImageView)findViewById(R.id.image_leftDice);
        image_rightDice=(ImageView)findViewById(R.id.image_rightDice);
        final int[]diceArray=  {
        R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand=new Random();
                int number=rand.nextInt(6);
                Log.i("Dicee","The random number is: "+ number);
                image_leftDice.animate().rotationXBy(720f).rotationYBy(720f).setDuration(500).start();
                image_rightDice.animate().rotationXBy(720f).rotationYBy(720f).setDuration(500).start();
                image_leftDice.setImageResource(diceArray[number]);
                int secondNumber=rand.nextInt(6);
                image_rightDice.setImageResource(diceArray[secondNumber]);


            }
        });
    }
}
