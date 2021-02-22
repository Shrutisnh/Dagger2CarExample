package com.example.dagger2carexample.dagger;

import com.example.dagger2carexample.car.DieselEngine;
import com.example.dagger2carexample.car.Engine;

import java.nio.ShortBuffer;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public  class DieselEngineModule {
    int horsePower;

    public DieselEngineModule(int horsePower){
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower(){
        return horsePower;
    }

    @Provides
     Engine provideEngine(DieselEngine engine){
        return engine;
    }
}
