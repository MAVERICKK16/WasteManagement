package com.example.wastenewgroupapplication.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wastenewgroupapplication.R;
import com.example.wastenewgroupapplication.activity.WasteOptionActivity;
import com.example.wastenewgroupapplication.databinding.FragmentHomeBinding;

import org.xmlpull.v1.XmlPullParser;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        view.findViewById(R.id.plasticimg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoNext(0);
            }
        });
        view.findViewById(R.id.glassimg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoNext(1);
            }
        });
        view.findViewById(R.id.ewasteimg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoNext(2);
            }
        });
        view.findViewById(R.id.otherimg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoNext(3);
            }
        });
        return view;
    }

    private void gotoNext(int number) {
        Intent intent=new Intent(getContext(), WasteOptionActivity.class);
        intent.putExtra("id",number);
        startActivity(intent);
    }
}