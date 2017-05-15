package com.example.xiao.hackathonenac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hypertrack.lib.HyperTrack;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HyperTrack.initialize(this,"pk_51e90839ad5ee373fa2c47e7854f9daa8172c807");


    }
}
