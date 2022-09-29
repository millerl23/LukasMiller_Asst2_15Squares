package com.example.asst2_15squares;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private boolean gameIncomplete = true;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Board board = new Board();

        board.buttons[0] = findViewById(R.id.button1_1);
        board.buttons[1] = findViewById(R.id.button1_2);
        board.buttons[2] = findViewById(R.id.button1_3);
        board.buttons[3] = findViewById(R.id.button1_4);
        board.buttons[4] = findViewById(R.id.button2_1);
        board.buttons[5] = findViewById(R.id.button2_2);
        board.buttons[6] = findViewById(R.id.button2_3);
        board.buttons[7] = findViewById(R.id.button2_4);
        board.buttons[8] = findViewById(R.id.button3_1);
        board.buttons[9] = findViewById(R.id.button3_2);
        board.buttons[10] = findViewById(R.id.button3_3);
        board.buttons[11] = findViewById(R.id.button3_4);
        board.buttons[12] = findViewById(R.id.button4_1);
        board.buttons[13] = findViewById(R.id.button4_2);
        board.buttons[14] = findViewById(R.id.button4_3);
        board.buttons[15] = findViewById(R.id.button4_4);

        board.generateRandomArray(board.randomNums);
        board.setRandomNums(board.buttons,board.randomNums);

        BoardController boardController = new BoardController(board.buttons);

        for (int i = 0; i<16; i++){
           board.buttons[i].setOnClickListener(boardController);
        }


    }



}



