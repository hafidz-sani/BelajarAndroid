package com.hafidzproject.basicandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Global Variable
    private EditText etInputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        log("onCreate");
        setContentView(R.layout.activity_main);

        // Variable | tipe data = Button, variable name = btnMoveToPage2, nilai = findViewById(R.id.btn_next_to_page_2)
        Button btnSendToPage2 = findViewById(R.id.btn_send_data_to_page_2);
        etInputText = findViewById(R.id.edit_input_text);

        btnSendToPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aksi tombol
                moveToPage(v, BilanganActivity.class);
//                Log.d("Main Activity", "onClick Position");
//                Log.e("Main Activity", "onClick Position");
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        log("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        log("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        log("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        log("onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        log("onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        log("onDestroy");
    }

    private void log(String message){
        Log.d("hafidz_main", message);
    }

    // function/method || methodName = moveToPage, paremeter = View v, Class<?> cls
    private void moveToPage(View v, Class<?> cls) {
        Intent intentToPage = new Intent(v.getContext(), cls);
        startActivity(intentToPage);

    }
}