package com.example.dagger2carexample.dagger;

import com.example.dagger2carexample.car.Engine;
import com.example.dagger2carexample.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
   abstract Engine provideEngine(PetrolEngine engine);
}
