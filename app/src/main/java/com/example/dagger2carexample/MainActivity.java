package com.example.dagger2carexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2carexample.car.Car;
import com.example.dagger2carexample.car.Wheels;
import com.example.dagger2carexample.dagger.ActivityComponent;
import com.example.dagger2carexample.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car1,car2;

    @Inject
    Wheels wheels;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        MyComponent myComponent = DaggerMyComponent.builder().dieselEngineModule(new DieselEngineModule(5000)).build();
//        MyComponent myComponent = DaggerMyComponent.builder()
//                .horsePower(500)
//                .engineCapacity(1000)
//                .build();
//        ActivityComponent activityComponent = ((ExampleApp)getApplication()).getComponent();
//        activityComponent.inject(this); //Field Injection
//        ActivityComponent activityComponent = DaggerActivityComponent.builder()
//                .horsePower(500)
//                .engineCapacity(10000)
//                .appComponent(((ExampleApp)getApplication()).getComponent())
//                .build();
//        ActivityComponent activityComponent = ((ExampleApp)getApplication()).getComponent().getActivityComponent(new DieselEngineModule(500));

       ActivityComponent activityComponent = ((ExampleApp)getApplicationContext()).getComponent().getActivityComponentBuilder().horsePower(500).engineCapacity(1000).build();
        activityComponent.inject(this);
        car1.drive();
        car2.drive();





    }
}