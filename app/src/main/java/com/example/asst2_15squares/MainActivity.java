package com.example.asst2_15squares;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Random;
/*
    15 Squares Game implementation by Lukas Miller
    Completed on 9/29/2022
    Rearrange squares to try to turn them all green by reorganizing
    numbers in order 1-15 left -> right, top -> bottom, with the
    empty square in the bottom right corner.
    Tap on a square neighboring the empty square to swap positions.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Board
        Board board = new Board();
        // Locate reset button
        Button reset = findViewById(R.id.reset);

        // Link button object in layout to board
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

        // Generate random array and set text of boar buttons to it
        board.generateRandomArray(board.randomNums);
        board.setRandomNums(board.buttons,board.randomNums);

        // Create board controller and onClickListeners for buttons
        BoardController boardController = new BoardController(board.buttons, board);
        for (int i = 0; i<16; i++){
           board.buttons[i].setOnClickListener(boardController);
        }

        reset.setOnClickListener(boardController);

        // Check for any correct squares upon board creation
        for (int i = 0; i < 16; i++){ // Check numbered squares
            int x = i + 1;
            if ( board.buttons[i].getText().equals(""+x)){
                board.buttons[i].setBackgroundColor(Color.argb(200,96,168,48));
            }
        }
        // Check empty squares
        if ( board.buttons[15].getText().equals("")){
            board.buttons[15].setBackgroundColor(Color.argb(200,96,168,48));
        }
        else {
            board.buttons[15].setBackgroundColor(Color.argb(100,221,150,150));
        }


    }



}



