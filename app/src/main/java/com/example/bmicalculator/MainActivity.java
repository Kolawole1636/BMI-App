package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText height,weight;
    TextView txt1,txt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn1);
        height =(EditText) findViewById(R.id.edit1);
        weight =(EditText) findViewById(R.id.edit2);
        txt1 = (TextView) findViewById(R.id.textView);
        txt2 = (TextView) findViewById(R.id.textView1);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Double h = Double.parseDouble(height.getText().toString());
                Double w = Double.parseDouble(weight.getText().toString());
                Double bmi = w/Math.pow(h,2);

                if(bmi<18){
                    txt1.setText("Your BMI is "+ bmi +" ");
                    txt2.setText("You are Underweight");
                }
                else if(bmi>18 && bmi<25){
                    txt1.setText("Your BMI is "+ bmi +" ");
                    txt2.setText("Your health is in good condition!");
                }
                else if(bmi>25 && bmi<30){
                    txt1.setText("Your BMI is "+ bmi +" ");
                    txt2.setText("You are overweight, please contact your doctor!");
                }
                else{
                    txt1.setText("Your BMI is "+bmi+" ");
                    txt2.setText("Your health is in critical condition, please contact your doctor now!!!");
                }

            }
        });




    }
}