package com.samseen.foodordering;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;

public class IntroActivity extends AppCompatActivity {

    private ConstraintLayout startBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        initViews();

        initListeners();

    }

    private void initViews() {
        startBtn = findViewById(R.id.startBtn);

    }

    private void initListeners() {
        startActivity(new Intent(IntroActivity.this, MainActivity.class));
    }
}