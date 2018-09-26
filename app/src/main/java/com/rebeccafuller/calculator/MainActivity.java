package com.rebeccafuller.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    TextView mathTV;
    Button one, two, three, four, five, six, seven, eight, nine, zero, add, minus, multi, division, enter, clear;

    String user, math, answer, numOneS, numTwoS;

    int numOne, numTwo;
    private int mNumOne;
=======
>>>>>>> parent of 703e7c4... Finished UI
=======
>>>>>>> parent of 703e7c4... Finished UI
=======
>>>>>>> parent of 703e7c4... Finished UI

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mathTV = findViewById(R.id.math_TextView);

        one = findViewById(R.id.one_Button);
        two = findViewById(R.id.two_Button);
        three = findViewById(R.id.three_Button);
        four = findViewById(R.id.four_Button);
        five = findViewById(R.id.five_Button);
        six = findViewById(R.id.six_Button);
        seven = findViewById(R.id.seven_Button);
        eight = findViewById(R.id.eight_Button);
        nine = findViewById(R.id.nine_Button);
        zero = findViewById(R.id.zero_Button);

        add = findViewById(R.id.add_Button);
        minus = findViewById(R.id.minus_Button);
        division = findViewById(R.id.div_Button);
        multi = findViewById(R.id.multi_Button);
        enter = findViewById(R.id.enter_Button);
        clear = findViewById(R.id.clear_Button);

        numOneS = null;
        numTwoS = null;

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numOneS == null) {
                    numOne = 1;
                    setNumOne(numOne);
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numOneS == null) {
                    numOne = 2;
                    setNumOne(numOne);
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numOneS == null) {
                    numOne = 3;
                    setNumOne(numOne);
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numOneS == null) {
                    numOne = 4;
                    setNumOne(numOne);
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numOneS == null) {
                    numOne = 5;
                    setNumOne(numOne);
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numOneS == null) {
                    numOne = 6;
                    setNumOne(numOne);
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numOneS == null) {
                    numOne = 7;
                    setNumOne(numOne);
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numOneS == null) {
                    numOne = 8;
                    setNumOne(numOne);
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numOneS == null) {
                    numOne = 9;
                    setNumOne(numOne);
                }
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numOneS == null) {
                    numOne = 0;
                    setNumOne(numOne);
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = null;
                math = null;
                answer = null;
                numOneS = null;
                numTwoS = null;

                mathTV.setText(null);
            }
        });
    }

    public void setNumOne(int numOne) {
        numOneS = String.valueOf(numOne);

        user = numOneS + " ";

        mathTV.setText(user);
    }
}
