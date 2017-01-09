package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CrimeActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);
        FragmentManager f=getSupportFragmentManager();
        Fragment fragment=f.findFragmentById(R.id.fragmentContainer);
        if(fragment==null){
            fragment=new CrimeFragment();
            f.beginTransaction().add(R.id.fragmentContainer,fragment).commit();
        }
    }
}
