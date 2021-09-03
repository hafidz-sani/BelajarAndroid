package com.hafidzproject.basicandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import java.util.ArrayList;

public class CalculatorActivity extends AppCompatActivity {

    private String result = "";
    private String splitOperator = "";
    private EditText etResult;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_main);

        // Initialisation Variable
        AppCompatButton btnNumber0 = findViewById(R.id.btn_0);
        AppCompatButton btnNumber1 = findViewById(R.id.btn_1);
        AppCompatButton btnNumber2 = findViewById(R.id.btn_2);
        AppCompatButton btnNumber3 = findViewById(R.id.btn_3);
        AppCompatButton btnNumber4 = findViewById(R.id.btn_4);
        AppCompatButton btnNumber5 = findViewById(R.id.btn_5);
        AppCompatButton btnNumber6 = findViewById(R.id.btn_6);
        AppCompatButton btnNumber7 = findViewById(R.id.btn_7);
        AppCompatButton btnNumber8 = findViewById(R.id.btn_8);
        AppCompatButton btnNumber9 = findViewById(R.id.btn_9);
        AppCompatButton btnPlus = findViewById(R.id.btn_plus);
        AppCompatButton btnMinus = findViewById(R.id.btn_minus);
        AppCompatButton btnMultiple = findViewById(R.id.btn_multiple);
        AppCompatButton btnDivide = findViewById(R.id.btn_divide);
        AppCompatButton btnEqual = findViewById(R.id.btn_equal);
        AppCompatButton btnClear = findViewById(R.id.btn_clear);
        etResult = findViewById(R.id.et_result);


        // Action
        btnNumber1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = etResult.getText().toString() + "1";
                etResult.setText(result);
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String operator = etResult.getText().toString() + "+";
                etResult.setText(operator);

                // disable
                btnMinus.setEnabled(false);
                btnDivide.setEnabled(false);
                btnMultiple.setEnabled(false);

                splitOperator = "\\+";
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String operator = etResult.getText().toString() + "/";
                etResult.setText(operator);

                // disable
                btnMinus.setEnabled(false);
                btnPlus.setEnabled(false);
                btnMultiple.setEnabled(false);

                splitOperator = "/";
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String operator = etResult.getText().toString() + "-";
                etResult.setText(operator);

                // disable
                btnPlus.setEnabled(false);
                btnDivide.setEnabled(false);
                btnMultiple.setEnabled(false);

                splitOperator = "-";
            }
        });

        btnMultiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String operator = etResult.getText().toString() + "x";
                etResult.setText(operator);

                // disable
                btnMinus.setEnabled(false);
                btnDivide.setEnabled(false);
                btnPlus.setEnabled(false);

                splitOperator = "x";
            }
        });


        btnNumber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = etResult.getText().toString() + "2";
                etResult.setText(result);
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hasilnya
                String[] arrayResult = result.split(splitOperator);
                count(arrayResult);
                btnDivide.setEnabled(true);
                btnPlus.setEnabled(true);
                btnMinus.setEnabled(true);
                btnPlus.setEnabled(true);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = "";
                etResult.setText(result);
                btnDivide.setEnabled(true);
                btnPlus.setEnabled(true);
                btnMinus.setEnabled(true);
                btnPlus.setEnabled(true);
            }
        });

    }

    private void count(String[] arrayResult){
        if(splitOperator.contains("+")){
            int count = Integer.valueOf(arrayResult[0]) + Integer.valueOf(arrayResult[1]);
            result = String.valueOf(count);
            etResult.setText(result);
        }
        else if(splitOperator.contains("-")){
            int count = Integer.valueOf(arrayResult[0]) - Integer.valueOf(arrayResult[1]);
            result = String.valueOf(count);
            etResult.setText(result);
        }
        else if(splitOperator.contains("x")){
            int count = Integer.valueOf(arrayResult[0]) * Integer.valueOf(arrayResult[1]);
            result = String.valueOf(count);
            etResult.setText(result);
        }
        else if(splitOperator.contains("/")){
            int count = Integer.valueOf(arrayResult[0]) / Integer.valueOf(arrayResult[1]);
            result = String.valueOf(count);
            etResult.setText(result);
        }
    }
}
