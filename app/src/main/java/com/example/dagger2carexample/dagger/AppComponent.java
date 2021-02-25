package com.example.dagger2carexample.dagger;

import com.example.dagger2carexample.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    ActivityComponent.Builder getActivityComponentBuilder();
}
