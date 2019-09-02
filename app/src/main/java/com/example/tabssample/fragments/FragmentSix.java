package com.example.tabssample.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tabssample.R;

public class FragmentSix extends Fragment {

    public FragmentSix() {
        Log.i("Fragment Check", "Fragment Six Created");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_six, container, false);
    }
}
