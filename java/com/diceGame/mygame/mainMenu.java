package com.diceGame.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class mainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        TextView singleDice = (TextView) findViewById(R.id.singleDice);
        TextView doubleDice = (TextView) findViewById(R.id.doubleDice);
        TextView mainMenuTextView = (TextView) findViewById(R.id.menuTextBar);




        Toast.makeText(mainMenu.this, "Choose Any Option", Toast.LENGTH_SHORT).show();
        singleDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mainMenu.this, "Single Dice", Toast.LENGTH_SHORT).show();
                Intent singleIntent = new Intent(mainMenu.this, singleD.class);
                startActivity(singleIntent);
            }
        });
        doubleDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mainMenu.this, "Double Dice", Toast.LENGTH_SHORT).show();
                Intent doubleIntent = new Intent(mainMenu.this, diceGameActivity.class);
                startActivity(doubleIntent);
            }
        });
    }
}