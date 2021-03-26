package com.example.myapplication1;

public class Question {
    private int mQuizId;
    private int mQuizExplanation;
    private boolean mAnswerTrue;

    public Question(int quizId, boolean answerTrue) {
        mQuizId = quizId;
        mAnswerTrue = answerTrue;
    }

    public Question(int quizId, int quizExplanation, boolean answerTrue) {
        mQuizId = quizId;
        mQuizExplanation = quizExplanation;
        mAnswerTrue = answerTrue;
    }

    public int getQuizId() {
        return mQuizId;
    }
    public int getQuizExplanation() {
        return mQuizExplanation;
    }

    public void setQuizId(int quizId) {
        mQuizId = quizId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
