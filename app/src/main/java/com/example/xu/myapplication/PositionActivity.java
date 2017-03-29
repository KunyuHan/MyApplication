package com.example.xu.myapplication;

import android.os.Bundle;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.ashokvarma.bottomnavigation.BadgeItem;
import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

/**
 * Created by xu on 2017/3/21.
 */

public class PositionActivity extends AppCompatActivity {
    private BottomNavigationBar bottomNavigationBar;
    private FragmentOne mfragmentOne;
    private FragmentOne mfragmentTwo;
    private FragmentOne mfragmentThird;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_main);
        bottomNavigationBar = (BottomNavigationBar) findViewById(R.id.bottom_navigation_bar);
        bottomNavigationBar.addItem(new BottomNavigationItem(R.drawable.ic_home_grey_600_24dp,R.string.tab_one).setActiveColorResource(R.color.colorPrimary))
                .addItem(new BottomNavigationItem(R.drawable.ic_room_grey_600_24dp,R.string.tab_two).setActiveColorResource(R.color.colorPrimary))
                .addItem(new BottomNavigationItem(R.drawable.ic_perm_identity_grey_600_24dp,R.string.tab_three).setActiveColorResource(R.color.colorPrimary))
                .setFirstSelectedPosition(0).initialise();
        bottomNavigationBar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                switch (position){
                    case 0:{
                        if(mfragmentOne==null){
                            mfragmentOne = FragmentOne.newInstance("First Fragment");
                        }
                        transaction.replace(R.id.id_content,mfragmentOne);
                        break;
                    }
                    case 1:{
                        if(mfragmentTwo==null){
                            mfragmentTwo = FragmentTwo.newInstance("Second Fragnment");
                        }
                        transaction.replace(R.id.id_content,mfragmentTwo);
                        break;
                    }
                    case 2:{
                        if(mfragmentThird==null){
                            mfragmentThird = FragmentThird.newInstance("Third Fragnment");
                        }
                        transaction.replace(R.id.id_content,mfragmentThird);
                        break;
                    }

                    default:
                        if(mfragmentOne==null){
                            mfragmentOne = FragmentOne.newInstance("First Fragment");
                        }
                        transaction.replace(R.id.id_content,mfragmentOne);
                        break;
                }
                transaction.commit();
            }

            @Override
            public void onTabUnselected(int position) {

            }

            @Override
            public void onTabReselected(int position) {

            }

        });
    }
}


