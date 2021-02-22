package com.example.dagger2carexample.dagger;

import com.example.dagger2carexample.car.Rims;
import com.example.dagger2carexample.car.Tires;
import com.example.dagger2carexample.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    static public Rims provideRims(){
        return new Rims();
    }

    @Provides
    static public Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static public Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(tires,rims);
    }
}
