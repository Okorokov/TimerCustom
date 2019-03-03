package com.example.hpsus.timercustom.activity;

import android.support.v4.app.Fragment;
import android.app.FragmentContainer;
import android.app.TimePickerDialog;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.example.hpsus.timercustom.R;
import com.example.hpsus.timercustom.activity.fragment.CardRowFragment;
import com.example.hpsus.timercustom.activity.fragment.TimePickerFragment;
import com.example.hpsus.timercustom.activity.fragment.TimerFragment;
import com.example.hpsus.timercustom.adapter.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private TimePickerFragment timePickerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showTimeDialog(View v){
        Log.d("-----------","Запуск dialog Frame");
        timePickerFragment = new TimePickerFragment();
    }
}
