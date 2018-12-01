package com.dalvikmx.bridgepattern;

import android.util.Log;

public class OpenSandwich implements SandwichInterface{

    private static final String TAG = "OpenSandwich";

    @Override
    public void makeSandwich(String filing1, String filing2) {
        Log.d(TAG, "makeSandwich: " + filing1 + filing2);
    }
}

