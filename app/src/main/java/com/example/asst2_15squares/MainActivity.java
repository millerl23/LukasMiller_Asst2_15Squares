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
    public Button board[] = new Button[16];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        int randomNums[] = new int[16];
        String num;

        // Create board array


        board[0] = findViewById(R.id.button1_1);
        board[1] = findViewById(R.id.button1_2);
        board[2] = findViewById(R.id.button1_3);
        board[3] = findViewById(R.id.button1_4);
        board[4] = findViewById(R.id.button2_1);
        board[5] = findViewById(R.id.button2_2);
        board[6] = findViewById(R.id.button2_3);
        board[7] = findViewById(R.id.button2_4);
        board[8] = findViewById(R.id.button3_1);
        board[9] = findViewById(R.id.button3_2);
        board[10] = findViewById(R.id.button3_3);
        board[11] = findViewById(R.id.button3_4);
        board[12] = findViewById(R.id.button4_1);
        board[13] = findViewById(R.id.button4_2);
        board[14] = findViewById(R.id.button4_3);
        board[15] = findViewById(R.id.button4_4);

        generateRandomArray(randomNums);
        setRandomNums(board,randomNums);

        BoardController boardController = new BoardController(board);

        for (int i = 0; i<16; i++){
           board[i].setOnClickListener(boardController);
        }

        /*if (board[0].getText() == "1"){
            board[0].setBackgroundColor(Color.GREEN);
        }
        */

    }

    private void setRandomNums(Button[] arr, int[] randArr) {
        for (int i = 0; i < 16; i++) {
            if (randArr[i] == 16){ // Make square blank for game mechanics
                arr[i].setText("");
            }
            else if(randArr[i] == 1){
                String string1 = getString(R.string.one);
                arr[i].setText(string1);
                //arr[i].setBackgroundColor(Color.GREEN);
            }
            else {
                arr[i].setText("" + randArr[i]);
            }
        }

    }

    // Helper method to check if an array already contains a value
    private boolean arrayContains(int[] array, int x) {
        for (int i = 0; i < 16; i++) {
            if (array[i] == x) {
                return true;
            }
        }

        return false;
    }

    // Takes in and array and sets numbers in a random order
    private void generateRandomArray(int[] arr){
        Random rand = new Random();
        int[] randArr = new int[16];
        for (int i = 0; i < 16; i++) {
            int num;
            boolean newNum = false;
            do {
                num = rand.nextInt(17); // Random number 1-16
                if (arrayContains(randArr, num)) {
                    newNum = false;
                } else {
                    randArr[i] = num;
                    newNum = true;
                }
            } while (!newNum);

            arr[i] = num;

        }
    }

}



