package com.example.hpsus.timercustom.activity;

import android.app.TimePickerDialog;
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
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        recyclerView = findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new TimerFragment(),"Таймер");
        adapter.addFragment(new TimerFragment(),"История");
        viewPager.setAdapter(adapter);
    }

    public void showTimeDialog(View v){
        Log.d("-----------","Запуск dialog Frame");
        timePickerFragment = new TimePickerFragment();
    }
}
