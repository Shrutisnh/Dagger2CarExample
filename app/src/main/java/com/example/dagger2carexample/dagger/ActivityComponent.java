package com.example.dagger2carexample.dagger;

import com.example.dagger2carexample.MainActivity;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {WheelsModule.class , PetrolEngineModule.class})
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

    @Subcomponent.Builder
    interface Builder{
        ActivityComponent build();

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

      
    }

//    @Subcomponent.Factory
//    interface  Factory{
//
//    }
}
