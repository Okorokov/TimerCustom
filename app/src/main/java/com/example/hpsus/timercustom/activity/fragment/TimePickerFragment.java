package com.example.hpsus.timercustom.activity.fragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hpsus.timercustom.R;


public class TimePickerFragment extends DialogFragment  {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        getDialog().setTitle(getString(R.string.titleDialog));
        View view = inflater.inflate(R.layout.dialog_time,null);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}

