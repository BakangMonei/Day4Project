package com.diceGame.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class singleD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_d);

        ImageView iv_dice = (ImageView) findViewById(R.id.single_dice);
        Button b_roll = (Button) findViewById(R.id.b_roll);
        TextView tv_rollNumber = (TextView) findViewById(R.id.tv_rollNumber);

        b_roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                // The random number between 1 and 6
                int theRoll = r.nextInt(6) + 1;
                tv_rollNumber.setText("You rolled " + theRoll);

                switch (theRoll) {
                    case 1: {
                        iv_dice.setImageResource(R.drawable.dice1);
                        break;
                    }
                    case 2: {
                        iv_dice.setImageResource(R.drawable.dice2);
                        break;
                    }

                    case 3: {
                        iv_dice.setImageResource(R.drawable.dice3);
                        break;
                    }
                    case 4: {
                        iv_dice.setImageResource(R.drawable.dice4);
                        break;
                    }
                    case 5: {
                        iv_dice.setImageResource(R.drawable.dice5);
                        break;
                    }
                    case 6: {
                        iv_dice.setImageResource(R.drawable.dice6);
                        break;
                    }
                }
            }
        });
    }
}