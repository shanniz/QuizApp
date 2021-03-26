package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mButtonTrue;
    private Button mButtonNext;
    private Button mButtonExplain;
    private TextView mQuestionTextView;
    private int mCurrentIndex;
    private Question[] mQuestionBank = new Question[]
            {
                    new Question(R.string.question_australia, R.string.question_australia_explanation, true),
                    new Question(R.string.question_oceans, R.string.question_oceans_explanation, true),
                    new Question(R.string.question_mideast, false),
                    new Question(R.string.question_africa, false),
                    new Question(R.string.question_americas, true),
                    new Question(R.string.question_asia, true),
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("callback", "onCreate callback method invoked");

        mCurrentIndex = 0;
        mQuestionTextView = (TextView) findViewById(R.id.textViewQuestion);
        mQuestionTextView.setText(mQuestionBank[mCurrentIndex].getQuizId());

        mButtonTrue = findViewById(R.id.buttonTrue);
        mButtonNext = findViewById(R.id.buttonNext);
        mButtonExplain = findViewById(R.id.buttonExplain);

        mButtonExplain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ExplanationActivity.class);
                intent.putExtra("qExplanationId", mQuestionBank[mCurrentIndex].getQuizExplanation());
                startActivity(intent);

            }
        });

        mButtonTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mQuestionBank[mCurrentIndex].isAnswerTrue() == true) {
                    Toast.makeText(MainActivity.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Incorrect Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentIndex++;
                if(mCurrentIndex<mQuestionBank.length){
                    mQuestionTextView.setText(mQuestionBank[mCurrentIndex].getQuizId());
                }
            }
        });

    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("callback", "onStart callback");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("callback", "onResume callback");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("callback", "onPause callback");
    }

    public void btnFalseClick(View view){
        if(mQuestionBank[mCurrentIndex].isAnswerTrue() == false) {
            Toast.makeText(MainActivity.this, "Correct Answer", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity.this, "Incorrect Answer", Toast.LENGTH_SHORT).show();
        }
    }

}