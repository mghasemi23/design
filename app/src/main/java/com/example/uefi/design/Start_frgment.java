package com.example.uefi.design;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Start_frgment extends Fragment {
    RecyclerView rv;



    public Start_frgment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_start_frgment, container, false);
        List<Charity> charityList = new ArrayList<>();
        rv = (RecyclerView)v.findViewById(R.id.recycle);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity() , LinearLayoutManager.VERTICAL,false) ;
        rv.setLayoutManager(layoutManager);
        rv.setHasFixedSize(true);
        rv.smoothScrollToPosition(0);
        Charity charity = new Charity("محک" ,"کمک به کودکان سرطانی "  , R.drawable.char2 , false);
        charityList.add(charity);
        charityList.add(new Charity("یاوران" , "کمک به کودکان" , R.drawable.char3 , false));
        charityList.add(new Charity("یاوران" , "کمک به یتیمان" , R.drawable.charit , false));
        charityList.add(new Charity("خاوران" , "کمک " , R.drawable.char3 , false));
        Adapter adapter = new Adapter(charityList, new Adapter.OnItemClick() {
            @Override
            public void onItemClicked(Charity charity1) {
                Log.e("Test","bfjefnkfef : "+ charity1.getName());
                detaiLFragment detaiLFragment = new detaiLFragment();
                detaiLFragment.getitem(charity1);
                //  android.support.v4.app.FragmentManager fragmentManager2 = getSupportFragmentManager();
                //  android.support.v4.app.FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
                getActivity();
            }
        });
        rv.setAdapter(adapter);







        return  v;
    }

 /*   @Override
    public void onStart() {
        super.onStart();
        List<Charity> charityList = new ArrayList<>();
        rv = (RecyclerView)getView().findViewById(R.id.recycle);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity() , LinearLayoutManager.VERTICAL,false) ;
        rv.setLayoutManager(layoutManager);
        rv.setHasFixedSize(true);
        rv.smoothScrollToPosition(0);
       Charity charity = new Charity("محک" ,"کمک به کودکان سرطانی "  , R.drawable.char2 , false);
        charityList.add(charity);
        charityList.add(new Charity("یاوران" , "کمک به کودکان" , R.drawable.char3 , false));
        charityList.add(new Charity("یاوران" , "کمک به یتیمان" , R.drawable.charit , false));
        charityList.add(new Charity("خاوران" , "کمک " , R.drawable.char3 , false));
        Adapter adapter = new Adapter(charityList, new Adapter.OnItemClick() {
            @Override
            public void onItemClicked(Charity charity1) {
                Log.e("Test","bfjefnkfef : "+ charity1.getName());
                detaiLFragment detaiLFragment = new detaiLFragment();
                detaiLFragment.getitem(charity1);
              //  android.support.v4.app.FragmentManager fragmentManager2 = getSupportFragmentManager();
              //  android.support.v4.app.FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
                getActivity();
            }
        });
        rv.setAdapter(adapter);


    } */

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
     //   android.support.v4.app.FragmentManager fragmentManager2 = getSupportFragmentManager();
    }



}
