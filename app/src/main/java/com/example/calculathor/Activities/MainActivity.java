package com.example.calculathor.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.calculathor.Fragments.SignInFragment;
import com.example.calculathor.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment signInFragment = fragmentManager.findFragmentById(R.id.container_main);
        if (signInFragment == null) {
            signInFragment = new SignInFragment();
            fragmentManager.beginTransaction().add(R.id.container_main,signInFragment).commit();
        }
    }
}
