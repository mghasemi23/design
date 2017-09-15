package com.example.uefi.design;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import static com.example.uefi.design.Start_frgment.charityList;


/**
 * A simple {@link Fragment} subclass.
 */
public class favoritsfragment extends Fragment {
    RecyclerView rv;


    public favoritsfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_frag1, container, false);
        rv = (RecyclerView)v.findViewById(R.id.recycle2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity() , LinearLayoutManager.VERTICAL,false) ;
        rv.setLayoutManager(layoutManager);
        rv.setHasFixedSize(true);
        rv.smoothScrollToPosition(0);
        List<Charity> charityList2 = new ArrayList<>();
       for (int i=0 ; i<charityList.size(); i++ ){
           if(charityList.get(i).isFav()==true) charityList2.add(charityList.get(i));
       }



        Adapter adapter = new Adapter(charityList2, new Adapter.OnItemClick() {
            @Override
            public void onItemClicked(Charity charity1) {
                Intent intent = new Intent(getActivity(), Detail.class);
                intent.putExtra("charity", charity1);
                startActivity(intent);
            }
        });
        rv.setAdapter(adapter);
        // Inflate the layout for this fragment

      /*  TabLayout tabLayout = (TabLayout) v.findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("اطلاعات"));
        tabLayout.addTab(tabLayout.newTab().setText("آپدیت ها"));


        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        final ViewPager viewPager = (ViewPager) v.findViewById(R.id.pageri);
        final PagerAdaptherforfrag adapter = new PagerAdaptherforfrag(getChildFragmentManager(),tabLayout.getTabCount());
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




        return v;
    }
    @Override
    public void onStart() {
        super.onStart();

      /*  TabLayout tabLayout = (TabLayout) getView().findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("اطلاعات"));
        tabLayout.addTab(tabLayout.newTab().setText("آپدیت ها"));


        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        final ViewPager viewPager = (ViewPager) getView().findViewById(R.id.pageri);
        final PagerAdaptherforfrag adapter = new PagerAdaptherforfrag(getChildFragmentManager(),tabLayout.getTabCount());
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
