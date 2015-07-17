package com.jcuentas.ejmviewpager.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.jcuentas.ejmviewpager.ui.fragment.PagerFragment;

import java.util.Random;

/**
 * Created by Jose Cuentas Turpo on 16/07/2015 - 09:15 AM.
 * E-mail: jcuentast@gmail.com
 */
public class PagerAdapter extends FragmentPagerAdapter {

    private int pagerCount = 5;
    private Random random = new Random();

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return PagerFragment.newInstance(0xff000000 | random.nextInt(0x00ffffff));
    }

    @Override
    public int getCount() {
        return pagerCount;
    }
}
