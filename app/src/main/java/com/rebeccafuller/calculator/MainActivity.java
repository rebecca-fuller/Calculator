package com.rebeccafuller.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView mathTV;

    Button zero, one, two, three, four, five, six, seven, eight, nine, decimal, addition, subtraction, multi, division, enter, clear;

    String sOne, sTwo, sAnswer, sOp, tempS;

    Double dOne, dTwo, dAnswer;

    Boolean mathPlace, useDouble;

    int numOne, numTwo, numAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mathTV = findViewById(R.id.math_TextView);

        zero = findViewById(R.id.zero_Button);
        one = findViewById(R.id.one_Button);
        two = findViewById(R.id.two_Button);
        three = findViewById(R.id.three_Button);
        four = findViewById(R.id.four_Button);
        five = findViewById(R.id.five_Button);
        six = findViewById(R.id.six_Button);
        seven = findViewById(R.id.seven_Button);
        eight = findViewById(R.id.eight_Button);
        nine = findViewById(R.id.nine_Button);

        decimal = findViewById(R.id.decimal_Button);

        addition = findViewById(R.id.plus_Button);
        subtraction = findViewById(R.id.sub_Button);
        multi = findViewById(R.id.multi_Button);
        division = findViewById(R.id.div_Button);

        enter = findViewById(R.id.enter_Button);
        clear = findViewById(R.id.clear_Button);

        sOne = null;
        sTwo = null;
        sAnswer = null;
        sOp = null;

        mathPlace = false;
        useDouble = false;

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(0);
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(1);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(2);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(3);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(4);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(5);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(6);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(7);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(8);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(9);
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dec();
            }
        });

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOp("+");
            }
        });
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOp("-");
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOp("*");
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOp("/");
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                math();
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });
    }

    private void insert(int i) {
        if (!mathPlace) {
            if (sOne == null) {
                sOne = String.valueOf(i);
            } else {
                sOne+=i;
            }
        } else {
            if (sTwo == null) {
                sTwo = String.valueOf(i);
            } else {
                sTwo+=i;
            }
        }
        setString();

    }

    private void dec() {
        useDouble = true;
        if (!mathPlace) {
            if (sOne == null) {
                sOne = "0.";
            } else {
                sOne+=".";
            }
        } else {
            if (sTwo == null) {
                sTwo = "0.";
            } else {
                sTwo+=".";
            }
        }

        setString();
    }

    private void setOp(String op) {
        if (sOne != null) {
            mathPlace = true;
            sOp = op;

            tempS = sOne + " " + sOp;
            mathTV.setText(tempS);
        } else {
            Toast.makeText(this, "Please enter a number first.", Toast.LENGTH_SHORT).show();
        }
    }

    private void math() {
        if (sTwo!= null) {
            if (useDouble) {
                dOne = Double.valueOf(sOne);
                dTwo = Double.valueOf(sTwo);

                switch (sOp) {
                    case "+":
                        dAnswer = dOne + dTwo;
                        break;
                    case "-":
                        dAnswer = dOne - dTwo;
                        break;
                    case "*":
                        dAnswer = dOne * dTwo;
                        break;
                    case "/":
                        dAnswer = dOne / dTwo;
                        break;
                    default:
                        break;
                }

                tempS = sOne + " " + sOp + " " + sTwo + " = " + String.valueOf(dAnswer);
                mathTV.setText(tempS);
            } else {
                numOne = Integer.parseInt(sOne);
                numTwo = Integer.parseInt(sTwo);

                switch (sOp) {
                    case "+":
                        numAnswer = Math.addExact(numOne, numTwo);
                        break;
                    case "-":
                        numAnswer = Math.subtractExact(numOne, numTwo);
                        break;
                    case "*":
                        numAnswer = Math.multiplyExact(numOne, numTwo);
                        break;
                    case "/":
                        numAnswer = Math.floorDiv(numOne, numTwo);
                        break;
                    default:
                        break;
                }

                tempS = sOne + " " + sOp + " " + sTwo + " = " + String.valueOf(numAnswer);
                mathTV.setText(tempS);
            }
        } else {
            Toast.makeText(this, "Please enter your problem.", Toast.LENGTH_SHORT).show();
        }

    }

    private void reset() {
        sOne = null;
        sTwo = null;
        sAnswer = null;
        sOp = null;

        mathPlace = false;
        useDouble = false;

        mathTV.setText("");
    }

    private void setString() {
        if (!mathPlace) {
            mathTV.setText(sOne);
        } else {
            tempS = sOne + " " + sOp + " " + sTwo;
            mathTV.setText(tempS);
        }
    }


}
