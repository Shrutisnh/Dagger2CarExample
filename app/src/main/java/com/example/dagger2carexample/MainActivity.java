package com.example.dagger2carexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2carexample.car.Car;
import com.example.dagger2carexample.car.Wheels;
import com.example.dagger2carexample.dagger.DaggerMyComponent;
import com.example.dagger2carexample.dagger.MyComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car;

    @Inject
    Wheels wheels;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        MyComponent myComponent = DaggerMyComponent.builder().dieselEngineModule(new DieselEngineModule(5000)).build();
        MyComponent myComponent = DaggerMyComponent.builder()
                .horsePower(500)
                .engineCapacity(1000)
                .build();
        myComponent.inject(this); //Field Injection

        car.drive();





    }
}