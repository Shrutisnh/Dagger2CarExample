package com.example.dagger2carexample.car;

import android.util.Log;

import com.example.dagger2carexample.car.Engine;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = "PetrolEngine";

    @Inject
    public PetrolEngine(){

    }

    @Override
    public void start() {
        Log.d(TAG, "start: petrol engine started");
    }
}
