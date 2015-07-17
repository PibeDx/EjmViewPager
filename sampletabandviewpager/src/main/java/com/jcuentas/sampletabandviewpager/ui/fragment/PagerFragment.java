package com.jcuentas.sampletabandviewpager.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jcuentas.sampletabandviewpager.R;

public class PagerFragment extends Fragment {
    public static final String ARG_COLOR = "color";
    private int mColor;


    public static PagerFragment newInstance(int color){
        PagerFragment fragment = new PagerFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLOR, color);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments()!=null) {
            mColor = getArguments().getInt(ARG_COLOR);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_pager,container, false);
        root.setBackgroundColor(mColor);
        return root;
    }
}
