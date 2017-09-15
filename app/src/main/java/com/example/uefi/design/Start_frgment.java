package com.example.uefi.design;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Start_frgment extends Fragment {
    RecyclerView rv;
   static View v =null;
    public static   List<Charity> charityList = new ArrayList<>();
   /* @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // keep the fragment and all its data across screen rotation
        setRetainInstance(true);

    } */



    public Start_frgment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment

            //if((ViewGroup)v.getParent()!=null)
              //  ((ViewGroup)v.getParent()).removeView(v);
         //   Toast.makeText(getActivity(), "inside" , Toast.LENGTH_SHORT).show();

           // Toast.makeText(getActivity(), "outside" , Toast.LENGTH_SHORT).show();
            v = inflater.inflate(R.layout.fragment_start_frgment, container, false);

            rv = (RecyclerView) v.findViewById(R.id.recycle);
            LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
            rv.setLayoutManager(layoutManager);
            rv.setHasFixedSize(true);
            rv.smoothScrollToPosition(0);

            Adapter adapter = new Adapter(charityList, new Adapter.OnItemClick() {
                @Override
                public void onItemClicked(Charity charity1) {
                    Intent intent = new Intent(getActivity(), Detail.class);
                    intent.putExtra("charity", charity1);
                    startActivity(intent);
                   /* Log.e("Test", "bfjefnkfef : " + charity1.getName());
                    detaiLFragment detaiLFragment = new detaiLFragment();
                    detaiLFragment.setArguments(new Bundle());
                    detaiLFragment.getitem(charity1);
                    FragmentManager fragManager = getActivity().getSupportFragmentManager();
                    android.support.v4.app.FragmentTransaction fragmentTransaction2 = fragManager.beginTransaction();
                    fragmentTransaction2.replace(R.id.fragment_container, detaiLFragment);
                    fragmentTransaction2.commit(); */
                }
            });
            rv.setAdapter(adapter);

         //   ((ViewGroup)v.getParent()).removeView(v);


        return v;

    }
   /* @Override
    public void onDestroyView() {
        if (v.getParent() != null) {
            ((ViewGroup)v.getParent()).removeView(v);
        }
        super.onDestroyView();
    } */


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
