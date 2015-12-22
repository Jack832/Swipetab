package com.example.bridge.swipetab;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;
/**
 * Created by bridgelabz5 on 15/12/15.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new java();
            case 1:
                return new aspnet();
            case 2:
                return new C();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}
