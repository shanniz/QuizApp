package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ExplanationActivity extends AppCompatActivity {
    private TextView mTextViewExplanation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explanation);

        int quizExplanationId = getIntent().getIntExtra("qExplanationId", 0);
        mTextViewExplanation = findViewById(R.id.textViewExplanation);
        mTextViewExplanation.setText(quizExplanationId);
    }
}