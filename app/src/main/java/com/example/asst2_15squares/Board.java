package com.example.asst2_15squares;

import android.widget.Button;

import java.util.Random;

public class Board {

    public Button[] buttons;
    public int[] randomNums;

    public Board(){
        buttons = new Button[16];
        randomNums = new int[16];
    }

    // set
    public void setRandomNums(Button[] arr, int[] randArr) {
        for (int i = 0; i < 16; i++) {
            if (randArr[i] == 16){ // Make square blank for game mechanics
                arr[i].setText("");
            }

            else {
                arr[i].setText("" + randArr[i]);
            }
        }

    }

    // Helper method to check if an array already contains a value
    public boolean arrayContains(int[] array, int x) {
        for (int i = 0; i < 16; i++) {
            if (array[i] == x) {
                return true;
            }
        }

        return false;
    }

    // Takes in and array and sets numbers in a random order
    public void generateRandomArray(int[] arr){
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
