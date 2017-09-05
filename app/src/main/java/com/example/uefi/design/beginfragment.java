package com.example.uefi.design;


import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.app.Fragment;
import android.*;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



/**
 * A simple {@link Fragment} subclass.
 */
public class beginfragment extends android.support.v4.app.Fragment {


    public beginfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
 View v = inflater.inflate(R.layout.fragment_beginfragment, container, false);
        TabLayout tabLayout = (TabLayout)v.findViewById(R.id.tabtab);
        tabLayout.addTab(tabLayout.newTab().setText("محبوب ترین ها"));
        tabLayout.addTab(tabLayout.newTab().setText("جدید ترین ها"));

        tabLayout.addTab(tabLayout.newTab().setText("کم درامد ها"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        final ViewPager viewPager = (ViewPager)v.findViewById(R.id.pagerpage);
        final PagerAdapter adapter = new PagerAdapter(getChildFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        return  v ;
    }

  /*  @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        TabLayout tabLayout = (TabLayout) getView().findViewById(R.id.tabtab);
        tabLayout.addTab(tabLayout.newTab().setText("Home"));
        tabLayout.addTab(tabLayout.newTab().setText("Likes"));
        tabLayout.addTab(tabLayout.newTab().setText("profilo"));
    } */

    @Override
    public void onStart() {
        super.onStart();
      /*  TabLayout tabLayout = (TabLayout) getView().findViewById(R.id.tabtab);
        tabLayout.addTab(tabLayout.newTab().setText("محبوب ترین ها"));
        tabLayout.addTab(tabLayout.newTab().setText("جدید ترین ها"));

       tabLayout.addTab(tabLayout.newTab().setText("کم درامد ها"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        final ViewPager viewPager = (ViewPager) getView().findViewById(R.id.pagerpage);
        final PagerAdapter adapter = new PagerAdapter(getChildFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        }); */
    }



}
