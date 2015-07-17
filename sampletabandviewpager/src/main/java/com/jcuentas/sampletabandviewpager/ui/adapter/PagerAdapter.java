package com.jcuentas.sampletabandviewpager.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Jose Cuentas Turpo on 16/07/2015 - 12:33 PM.
 * E-mail: jcuentast@gmail.com
 */
public class PagerAdapter extends FragmentPagerAdapter {

    private Random random = new Random();
    private int pagerCount = 100;

    private ArrayList<Fragment> fragments;

    public PagerAdapter(FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
//        return PagerFragment.newInstance(0xff000000 | random.nextInt(0x00ffffff));
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
