package com.example.dagger2carexample.dagger;

import com.example.dagger2carexample.MainActivity;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {WheelsModule.class , PetrolEngineModule.class})
public interface MyComponent {

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder{
        MyComponent build();

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);
    }
}
