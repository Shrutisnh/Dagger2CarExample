package com.example.dagger2carexample.dagger;

import com.example.dagger2carexample.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {

    @Provides
    @Singleton
    static public Driver provideDriver(){
        return new Driver();
    }
}
