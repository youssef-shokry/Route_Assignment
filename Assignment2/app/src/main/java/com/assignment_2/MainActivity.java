package com.assignment_2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button androidButton = findViewById(R.id.android_button);
        Button iosButton = findViewById(R.id.ios_button);
        Button fullStackButton = findViewById(R.id.full_stack_button);

        androidButton.setOnClickListener(v -> startAndroidActivity());

        iosButton.setOnClickListener(v -> startIosActivity());

        fullStackButton.setOnClickListener(view -> startFullStackActivity());

    }

    private void startFullStackActivity() {
        Intent intent = new Intent(this, FullStackActivity.class);
        startActivity(intent);
    }

    private void startIosActivity() {
        Intent intent = new Intent(this, IosActivity.class);
        startActivity(intent);
    }

    private void startAndroidActivity() {
        Intent intent = new Intent(this, AndroidActivity.class);
        startActivity(intent);
    }
}