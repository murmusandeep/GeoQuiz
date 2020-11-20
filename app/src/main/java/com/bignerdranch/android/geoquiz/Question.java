package com.bignerdranch.android.geoquiz;

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mAnsweredAlready;

    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mAnsweredAlready = false;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int mTextResId) {
        this.mTextResId = mTextResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean mAnswerTrue) {
        this.mAnswerTrue = mAnswerTrue;
    }

    public boolean isAnsweredAlready() {
        return mAnsweredAlready;
    }

    public void setAnsweredAlready(boolean answeredAlready) {
        mAnsweredAlready = answeredAlready;
    }
}
