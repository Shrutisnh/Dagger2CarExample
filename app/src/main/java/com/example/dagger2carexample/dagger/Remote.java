package com.example.dagger2carexample.dagger;

import android.util.Log;

import com.example.dagger2carexample.car.Car;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Remote";
    @Inject
    public Remote(){

    }

    public void setListener(Car car){
        car.drive();
        Log.d(TAG, "setListener: connected");
    }
}
