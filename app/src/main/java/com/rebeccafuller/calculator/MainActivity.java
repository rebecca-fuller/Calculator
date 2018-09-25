package com.rebeccafuller.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView mathTV;
    Button one, two, three, four, five, six, seven, eight, nine, zero, add, minus, multi, division, enter, clear;

    String user, math, answer, numOneS, numTwoS;

    int numOne, numTwo;

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

        

        numOneS = null;
        numTwoS = null;

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userInput(1);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userInput(2);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userInput(3);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userInput(4);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userInput(5);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userInput(6);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userInput(7);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userInput(8);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userInput(9);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userInput(0);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                math = "+";
                userMath(math);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                math = "-";
                userMath(math);
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                math = "/";
                userMath(math);
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                math = "*";
                userMath(math);
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numOneS != null && numTwoS != null) {
                    mathTV.setText(answer);
                } else {
                    Toast.makeText(MainActivity.this, "Please enter a problem.", Toast.LENGTH_SHORT).show();
                }
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

    private void userInput(int num) {
        if (numOneS != null) {
            numOneS = String.valueOf(num);
            numOne = num;

            mathTV.setText(numOneS);
        }

        if (numTwoS != null) {
            numTwoS = String.valueOf(num);
            numOne = num;

            user = numOneS + math + numTwoS;

            mathTV.setText(user);
        }


    }

    private void userMath(String math) {
        if (numOneS == null) {
            Toast.makeText(this, "Please enter your first number.", Toast.LENGTH_SHORT).show();
        } else {
            user = numOneS + math;
        }

        if (numOneS != null && numTwoS != null) {
            user = numOneS + math + numTwoS;
        }


        if (math == "+") {
            if (numOneS != null && numTwoS != null) {
                answer = String.valueOf(numOne + numTwo);
            }
        } else if (math == "-") {
            if (numOneS != null && numTwoS != null) {
                answer = String.valueOf(numOne - numTwo);
            }
        } else if (math == "/") {
            if (numOneS != null && numTwoS != null) {
                if (numOne > numTwo) {
                    answer = String.valueOf(numOne / numTwo);
                } else {
                    Toast.makeText(this, "Please enter a different problem.", Toast.LENGTH_SHORT).show();
                }
            }
        } else if (math == "*") {
            answer = String.valueOf(numOne * numTwo);
        }

        mathTV.setText(user);
    }
}
