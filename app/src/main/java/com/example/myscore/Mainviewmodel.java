package com.example.myscore;

import android.util.Log;

import androidx.lifecycle.ViewModel;

public class Mainviewmodel extends ViewModel {

    private static final String TAG = "MAIN";
    private int count;

    public Mainviewmodel() {
        Log.i(TAG, "ViewModel created");
        count = 0;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i(TAG, "ViewModel destroyed");
    }
}
