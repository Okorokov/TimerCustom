package com.example.hpsus.timercustom.activity.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.hpsus.timercustom.R;

public class CardRowFragment extends Fragment implements View.OnClickListener {

    private Button start;
    private Button reset;
    private ProgressBar progressBar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.card_row,container,false);
        start = v.findViewById(R.id.btnStart);
        reset = v.findViewById(R.id.btnReset);
        progressBar = v.findViewById(R.id.progressBar);
        start.setOnClickListener(this);
        reset.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnStart:
                onClickStart();
                break;
            case R.id.btnReset:
                onClickReset();
                break;
        }
    }

    private void onClickStart(){
        if(start.getText().equals(getContext().getString(R.string.btnStart))){
            start.setText(getContext().getString(R.string.btnStop));
        } else {
            start.setText(getContext().getString(R.string.btnStart));
        }
    }

    private void onClickReset(){
        Toast.makeText(getActivity(),reset.getText(),Toast.LENGTH_SHORT).show();
    }
}
