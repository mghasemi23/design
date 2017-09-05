package com.example.uefi.design;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

/**
 * Created by uefi on 8/25/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;
    @Override
    public int getCount() {
        return mNumOfTabs;
    }

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FragmentThree tab3 = new FragmentThree();

                return tab3;
            case 1:
                Start_frgment tab2 = new Start_frgment();
                return tab2;
            case 2:
                FragmentThree tab4 = new FragmentThree();
                return tab4;
            default:
                return null;

        }


} }
