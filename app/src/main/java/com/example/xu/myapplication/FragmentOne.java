package com.example.xu.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentOne extends Fragment {
    //private String [] data = {"one","two","three","four","five"};
    //ListView listview;
    //ArrayAdapter<String> adapter;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
       View view =inflater.inflate(R.layout.fragment_one, container, false);
       //listview = (ListView) view.findViewById(R.id.listview);
        return view ;
    }

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*
        adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,data);
        listview.setAdapter(adapter);
        */
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }


}
