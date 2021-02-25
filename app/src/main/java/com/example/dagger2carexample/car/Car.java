package com.example.dagger2carexample.car;

import android.util.Log;

import com.example.dagger2carexample.dagger.PerActivity;
import com.example.dagger2carexample.dagger.Remote;

import javax.inject.Inject;


@PerActivity
public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;
    private Driver driver;

    @Inject
    public Car(Driver driver,Engine engine,Wheels wheels){
        this.driver = driver;
        this.engine = engine;
        this.wheels = wheels;
    }
    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }
    public void drive(){
        engine.start();
        Log.d(TAG,driver+" drives "+this);
    }
}
