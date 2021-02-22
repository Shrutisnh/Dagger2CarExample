package com.example.dagger2carexample.dagger;

import com.example.dagger2carexample.MainActivity;

import dagger.Component;

@Component(modules = {WheelsModule.class , PetrolEngineModule.class})
public interface MyComponent {

    void inject(MainActivity mainActivity);
}
