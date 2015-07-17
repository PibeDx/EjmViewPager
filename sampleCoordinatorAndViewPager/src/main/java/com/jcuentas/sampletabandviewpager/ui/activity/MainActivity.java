package com.jcuentas.sampletabandviewpager.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.jcuentas.sampletabandviewpager.R;
import com.jcuentas.sampletabandviewpager.ui.adapter.PagerAdapter;
import com.jcuentas.sampletabandviewpager.ui.fragment.PagerFragment;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {
    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpager_default);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
//        CircleIndicator circleIndicator = (CircleIndicator) findViewById(R.id.indicator_default);
//        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());
//        viewPager.setAdapter(pagerAdapter);
//        circleIndicator.setViewPager(viewPager);
        
        setupViewPager();
        if (toolbar!=null)
            setSupportActionBar(toolbar);
        

    }

    private void setupViewPager() {
        final int[] ICONS = new int[] {
                R.drawable.abc_ic_commit_search_api_mtrl_alpha,
                R.drawable.abc_ic_clear_mtrl_alpha,
        };
        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager(), buildFragments()));
        tabLayout.setupWithViewPager(viewPager);
        for (int i = 0; i <ICONS.length ; i++) {
            tabLayout.getTabAt(i).setIcon(ICONS[i]);
        }
    }

    private ArrayList<Fragment> buildFragments() {
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(PagerFragment.newInstance(8885));
        fragments.add(PagerFragment.newInstance(852852856));
        return fragments;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

