package com.smart.dehradun;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by User on 12-03-2016.
 */
public class header extends Fragment {
    ImageButton ib;
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

   
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.header, container, false);
        ib=(ImageButton)v.findViewById(R.id.imageButton);
        return v;
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
