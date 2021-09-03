package com.hafidzproject.basicandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Page2Activity extends AppCompatActivity {

    String dataFromPage1;
    TextView tvPrint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvPrint = findViewById(R.id.tv_print);

        getDataFromPage1();
        printToText();
    }

    private void getDataFromPage1(){
        dataFromPage1 = getIntent().getExtras().getString("key1","Gagal");
    }

    private void printToText(){
        tvPrint.setText(dataFromPage1);
    }
}

