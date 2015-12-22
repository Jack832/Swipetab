package com.example.bridge.swipetab;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity ;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity implements ActionBar.TabListener  {
    TabsPagerAdapter madapter;
    ActionBar actionbar;
    ViewPager pager;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager=(ViewPager)findViewById(R.id.pager);
        madapter=new TabsPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(madapter);


        actionbar =getActionBar();
        actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionbar.addTab(actionbar.newTab().setText("Java").setTabListener(this));
        actionbar.addTab(actionbar.newTab().setText("aspnet").setTabListener(this));
        actionbar.addTab(actionbar.newTab().setText("C").setTabListener(this));
        actionbar.setSelectedNavigationItem(position);
    }
    
    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                actionbar.setSelectedNavigationItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
