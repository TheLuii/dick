package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private Button thiss, that;
    private FrameLayout frameLayout;
    FirstFragment firstFragment = new FirstFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        thiss = findViewById(R.id.thiss);
        that = findViewById(R.id.that);

        FirstFragment firstFragment = new FirstFragment();
        SetNewFragment();


        thiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SetNewFragment();
            }
        });
        that.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondFragment secondFragment = new SecondFragment();
                SetNewFragment(secondFragment);
            }
        });
    }

    private void SetNewFragment(Fragment fragment) {

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame, firstFragment);
    }

    private void SetNewFragment(){
        FirstFragment firstFragment = new FirstFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame, firstFragment);
    }
}