package com.example.xu.myapplication;

import android.os.Bundle;

/**
 * Created by xu on 2017/3/24.
 */

public class FragmentOne extends BaseFragment {
    public static FragmentOne newInstance(String s){
        Bundle bundle = new Bundle();
        bundle.putString(Constants.KEY_ARGS,s);
        FragmentOne fragment = new FragmentOne();
        fragment.setArguments(bundle);
        return fragment;
    }
}
