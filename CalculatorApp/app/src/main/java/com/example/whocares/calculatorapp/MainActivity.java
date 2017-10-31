package com.example.whocares.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    //declare view objects
    EditText firstNumber,secondNumber;
    Button addOperation,subtractOperation,multiplyOperation,divideOperation;
    TextView finalAnswer;
    double answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instantiate view objects
        //no need to typecast in android studio 3.0 and above, typecasting required for lower versions of studio
        firstNumber=(EditText)findViewById(R.id.first_number);
        secondNumber=(EditText)findViewById(R.id.second_number);

        addOperation=(Button)findViewById(R.id.add);
        subtractOperation=(Button)findViewById(R.id.subtract);
        multiplyOperation=(Button)findViewById(R.id.multiply);
        divideOperation=(Button)findViewById(R.id.divide);

        finalAnswer=(TextView)findViewById(R.id.final_answer);

        //set OnClickListeners for buttons
        addOperation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer=Double.parseDouble(firstNumber.getText().toString())+
                        Double.parseDouble(secondNumber.getText().toString());
                finalAnswer.setText(String.valueOf(answer));
            }
        });

        subtractOperation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer=Double.parseDouble(firstNumber.getText().toString())-
                        Double.parseDouble(secondNumber.getText().toString());
                finalAnswer.setText(String.valueOf(answer));
            }
        });

        multiplyOperation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer=Double.parseDouble(firstNumber.getText().toString())*
                        Double.parseDouble(secondNumber.getText().toString());
                finalAnswer.setText(String.valueOf(answer));
            }
        });

        divideOperation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Double.parseDouble(secondNumber.getText().toString())!=0) {
                    answer = Double.parseDouble(firstNumber.getText().toString()) /
                            Double.parseDouble(secondNumber.getText().toString());
                    finalAnswer.setText(String.valueOf(answer));
                }
                else
                    finalAnswer.setText("Not defined");
            }
        });
    }
}
