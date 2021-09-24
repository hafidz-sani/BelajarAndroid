package com.hafidzproject.basicandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.hafidzproject.basicandroid.data.Bilangan;

public class BilanganActivity extends AppCompatActivity {

    private TextView tvGanjil;
    private Bilangan bilangan;
    private TestModifier testModifier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilangan);

        tvGanjil = findViewById(R.id.tv_ganjil);
        bilangan = new Bilangan();
        testModifier = new TestModifier();

        tvGanjil.setText(testModifier.getGetPrivate());
    }
}