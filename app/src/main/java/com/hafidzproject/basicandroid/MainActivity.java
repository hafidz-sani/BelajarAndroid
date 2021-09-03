package com.hafidzproject.basicandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Global Variable
    private EditText etInputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Variable | tipe data = Button, variable name = btnMoveToPage2, nilai = findViewById(R.id.btn_next_to_page_2)
        Button btnSendToPage2 = findViewById(R.id.btn_send_data_to_page_2);
        etInputText = findViewById(R.id.edit_input_text);

        btnSendToPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aksi tombol
                moveToPage(v, CalculatorActivity.class);
            }
        });


    }

    // function/method || methodName = moveToPage, paremeter = View v, Class<?> cls
    private void moveToPage(View v, Class<?> cls) {
        Intent intentToPage = new Intent(v.getContext(), cls);
        intentToPage.putExtra("key1", etInputText.getText().toString());
        startActivity(intentToPage);
    }
}