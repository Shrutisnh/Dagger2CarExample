package com.example.dagger2carexample;

import android.app.Application;

import com.example.dagger2carexample.dagger.AppComponent;
import com.example.dagger2carexample.dagger.DaggerAppComponent;

public class ExampleApp extends Application {
    private AppComponent component;
    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();

    }

    public AppComponent getComponent(){
        return component;
    }
}
