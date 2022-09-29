package com.example.asst2_15squares;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;

public class BoardController
            implements View.OnClickListener{

    private Button[] square = new Button[16];
    public Board board;

 
    public BoardController(Button[] _square, Board _board){
        for (int i = 0; i < 16; i++){
            square[i] = _square[i];
        }
        board = _board;
    }


    @Override
    public void onClick(View v)
    {
        // Reset Button
        if (v.getId() == R.id.reset){
            // 1. Generate newly arrange random array
            // 2. set square[i] text to this array in a loop
            //int[] newRandArr = new int[16];

            board.generateRandomArray(board.randomNums);
            board.setRandomNums(board.buttons,board.randomNums);

           // for (int i = 0; i < 16; i++){
            //    square[i].setText("");
           // }

        }



        // 4 Corners, only check 2 values
        if (v.getId() == R.id.button1_1) { // Top Left Corner
            if (square[1].getText() == "") {
                square[1].setText(square[0].getText());
                square[0].setText("");
            } else if (square[4].getText() == "") {
                square[4].setText(square[0].getText());
                square[0].setText("");
            }
        }
        if (v.getId() == R.id.button1_4) { // Top Right Corner
            if (square[2].getText() == "") {
                square[2].setText(square[3].getText());
                square[3].setText("");
            } else if (square[7].getText() == "") {
                square[7].setText(square[3].getText());
                square[3].setText("");
            }
        }
        if (v.getId() == R.id.button4_1) { // Bottom Left Corner
            if (square[8].getText() == "") {
                square[8].setText(square[12].getText());
                square[12].setText("");
            } else if (square[13].getText() == "") {
                square[13].setText(square[12].getText());
                square[12].setText("");
            }
        }
        if (v.getId() == R.id.button4_4) { // Bottom Right Corner
            if (square[11].getText() == "") {
                square[11].setText(square[15].getText());
                square[15].setText("");
            } else if (square[14].getText() == "") {
                square[14].setText(square[15].getText());
                square[15].setText("");
            }
        }

        // Perimeter that isn't corners, check 3 values
        if (v.getId() == R.id.button1_2) { // Top Row Left -> Right
            if (square[0].getText() == "") {
                square[0].setText(square[1].getText());
                square[1].setText("");
            } else if (square[2].getText() == "") {
                square[2].setText(square[1].getText());
                square[1].setText("");
            } else if (square[5].getText() == "") {
                square[5].setText(square[1].getText());
                square[1].setText("");
            }
        }
        if (v.getId() == R.id.button1_3) {
            if (square[1].getText() == "") {
                square[1].setText(square[2].getText());
                square[2].setText("");
            } else if (square[3].getText() == "") {
                square[3].setText(square[2].getText());
                square[2].setText("");
            } else if (square[6].getText() == "") {
                square[6].setText(square[2].getText());
                square[2].setText("");
            }
        }

        if (v.getId() == R.id.button2_4) { // Right side top to bottom
            if (square[3].getText() == "") {
                square[3].setText(square[7].getText());
                square[7].setText("");
            } else if (square[6].getText() == "") {
                square[6].setText(square[7].getText());
                square[7].setText("");
            } else if (square[11].getText() == "") {
                square[11].setText(square[7].getText());
                square[7].setText("");
            }
        }
        if (v.getId() == R.id.button3_4) {
            if (square[7].getText() == "") {
                square[7].setText(square[11].getText());
                square[11].setText("");
            } else if (square[10].getText() == "") {
                square[10].setText(square[11].getText());
                square[11].setText("");
            } else if (square[15].getText() == "") {
                square[15].setText(square[11].getText());
                square[11].setText("");
            }
        }

        if (v.getId() == R.id.button2_1) { // Left side top to bottom
            if (square[0].getText() == "") {
                square[0].setText(square[4].getText());
                square[4].setText("");
            } else if (square[5].getText() == "") {
                square[5].setText(square[4].getText());
                square[4].setText("");
            } else if (square[8].getText() == "") {
                square[8].setText(square[4].getText());
                square[4].setText("");
            }
        }
        if (v.getId() == R.id.button3_1) {
            if (square[4].getText() == "") {
                square[4].setText(square[8].getText());
                square[8].setText("");
            } else if (square[12].getText() == "") {
                square[12].setText(square[8].getText());
                square[8].setText("");
            } else if (square[9].getText() == "") {
                square[9].setText(square[8].getText());
                square[8].setText("");
            }
        }

        // bottom side left to right
        if (v.getId() == R.id.button4_2) {
            if (square[12].getText() == "") {
                square[12].setText(square[13].getText());
                square[13].setText("");
            } else if (square[9].getText() == "") {
                square[9].setText(square[13].getText());
                square[13].setText("");
            } else if (square[14].getText() == "") {
                square[14].setText(square[13].getText());
                square[13].setText("");
            }
        }
        if (v.getId() == R.id.button4_3) {
            if (square[13].getText() == "") {
                square[13].setText(square[14].getText());
                square[14].setText("");
            } else if (square[10].getText() == "") {
                square[10].setText(square[14].getText());
                square[14].setText("");
            } else if (square[15].getText() == "") {
                square[15].setText(square[14].getText());
                square[14].setText("");
            }
        }

        // 4 centers
        if (v.getId() == R.id.button2_2) {
            if (square[1].getText() == "") {
                square[1].setText(square[5].getText());
                square[5].setText("");
            } else if (square[6].getText() == "") {
                square[6].setText(square[5].getText());
                square[5].setText("");
            } else if (square[4].getText() == "") {
                square[4].setText(square[5].getText());
                square[5].setText("");
            } else if (square[9].getText() == "") {
                square[9].setText(square[5].getText());
                square[5].setText("");
            }
        }
        if (v.getId() == R.id.button3_3) {
            if (square[11].getText() == "") {
                square[11].setText(square[10].getText());
                square[10].setText("");
            } else if (square[6].getText() == "") {
                square[6].setText(square[10].getText());
                square[10].setText("");
            } else if (square[14].getText() == "") {
                square[14].setText(square[10].getText());
                square[10].setText("");
            } else if (square[9].getText() == "") {
                square[9].setText(square[10].getText());
                square[10].setText("");
            }
        }
        if (v.getId() == R.id.button2_3) {
            if (square[2].getText() == "") {
                square[2].setText(square[6].getText());
                square[6].setText("");
            } else if (square[7].getText() == "") {
                square[7].setText(square[6].getText());
                square[6].setText("");
            } else if (square[5].getText() == "") {
                square[5].setText(square[6].getText());
                square[6].setText("");
            } else if (square[10].getText() == "") {
                square[10].setText(square[6].getText());
                square[6].setText("");
            }
        }
        if (v.getId() == R.id.button3_2) {
            if (square[13].getText() == "") {
                square[13].setText(square[9].getText());
                square[9].setText("");
            } else if (square[5].getText() == "") {
                square[5].setText(square[9].getText());
                square[9].setText("");
            } else if (square[8].getText() == "") {
                square[8].setText(square[9].getText());
                square[9].setText("");
            } else if (square[10].getText() == "") {
                square[10].setText(square[9].getText());
                square[9].setText("");
            }
        }

        // Check all numbered squares for correctness
        for (int i = 0; i < 16; i++){
            int x = i + 1;
            if ( square[i].getText().equals(""+x)){
                square[i].setBackgroundColor(Color.argb(200,96,168,48));
            }
            else {
                square[i].setBackgroundColor(Color.argb(100,221,150,150));
            }
        }

        // Check empty square for correctness
        if ( square[15].getText().equals("")){
            square[15].setBackgroundColor(Color.argb(200,96,168,48));
        }
        else {
            square[15].setBackgroundColor(Color.argb(100,221,150,150));
        }

    }

}

