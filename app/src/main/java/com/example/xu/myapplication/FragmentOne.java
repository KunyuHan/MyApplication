package com.example.xu.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by xu on 2017/3/24.
 */

public class FragmentOne extends Fragment {
    //private String[] str = {"AAA55555555","CICU8020416","CICU8020437","CICU8020421","CICU8020400"};
   // private SimpleAdapter adapter;
///////////////////////////
    ////添加的代码段
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_one, container, false);
    }


    ////////////////////结束
    ///////////////////////////////////////////////////////////////////////////////////////////////



}
