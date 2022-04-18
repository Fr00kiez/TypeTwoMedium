package com.example.typetwomedium;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buka_soal = findViewById(R.id.uts);
        Button liat_hint = findViewById(R.id.hint);
        final TextView pop = findViewById(R.id.pop);

        buka_soal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pop.setText("Perbaiki kodingan yang salah!");
                Toast.makeText(MainActivity.this, "Kamu melihat soal", Toast.LENGTH_LONG).show();
            }
        });

        liat_hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pop.setText("Perhatikan id dan fungsi");
                Toast.makeText(MainActivity.this, "Kamu melihat hint", Toast.LENGTH_LONG).show();
            }
        });

    }
}