package com.jcuentas.sampletabandviewpager.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jcuentas.sampletabandviewpager.R;
import com.jcuentas.sampletabandviewpager.ui.adapter.UsuarioAdapter;

public class PagerFragment extends Fragment {
    public static final String ARG_COLOR = "color";
    private int mColor;
    private RecyclerView recyclerView;
    private UsuarioAdapter adapter;


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
        recyclerView = (RecyclerView) root.findViewById(R.id.recyclerView);
        adapter = new UsuarioAdapter(getActivity());
        setupList();
        root.setBackgroundColor(mColor);
        return root;
    }

    private void setupList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
    }
}
