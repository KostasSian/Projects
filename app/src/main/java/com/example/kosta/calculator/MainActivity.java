/*Onoma: Konstantinos Sianidis
* Am: 154535
* Eksamino 3
* Ergasia bonus 3
* */

package com.example.kosta.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View; //gia view
import android.widget.Button; //gia button
import android.widget.EditText; //gia setText

public class MainActivity extends AppCompatActivity {

    String total = "";
    double num1; //arithmos1
    double num2; //arithmos2
    String oper =""; //operator

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){ // buttons 0-9, dot
        Button button = (Button)v;
        String str = button.getText().toString();
        total += str;
        EditText edit  = (EditText)findViewById(R.id.editText); //anafora sto editText
        edit.setText(total);
    }

    public void OnAdd(View v){ //oles oi praxeis
        num1 = Double.parseDouble(total);
        total="";
        Button button  = (Button)v;
        String str = button.getText().toString();
        oper = str;
        EditText edit = (EditText)findViewById(R.id.editText); //anafora sto editText
        edit.setText("");
    }

    public void OnCalculate(View v){//to ison

        EditText edit = (EditText)findViewById(R.id.editText); //anafora sto editText
        String str2 = edit.getText().toString();
        num2 = Double.parseDouble(str2);

        double result = 0; //teliko apotelesma

        if (oper.equals("+")){ // Addition
            result = num1+num2;
        }
        else if (oper.equals("-")){ //Subtraction
            result = num1-num2;
        }
        else if (oper.equals("*")){ //Multiplication
            result = num1*num2;
        }
        else if (oper.equals("/")){ // Division
            result = num1/num2;
        }
        edit.setText(result+"");
    }

    //clear
    public void OnClear(View v){ // to clear

        EditText edit = (EditText)findViewById(R.id.editText); //anafora sto editText
        edit.setText("");
        total="";
    }
}