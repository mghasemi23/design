package com.example.uefi.design;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by uefi on 8/29/2017.
 */

public class PagerAdaptherforfrag extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    @Override
    public int getCount() {
        return mNumOfTabs;
    }

    public PagerAdaptherforfrag(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                BlankFragment tab2 = new BlankFragment();
                return tab2;
            case 1:
                BlankFragment tab20 = new BlankFragment();
                return tab20;

            default:
                return null;

        }


    }
}
