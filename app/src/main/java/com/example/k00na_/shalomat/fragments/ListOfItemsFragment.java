package com.example.k00na_.shalomat.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.k00na_.shalomat.Model.DummyData;
import com.example.k00na_.shalomat.Model.GostilniskeJokes;
import com.example.k00na_.shalomat.Model.JokeArrays;
import com.example.k00na_.shalomat.R;
import com.example.k00na_.shalomat.adapters.AdapterForRecyclerView;

/**
 * Created by k00na_ on 24.8.2015.
 */
public class ListOfItemsFragment extends Fragment {

    public static final String PAGE_INT_KEY = "pageintegerkey";
    private int mCurrentPage;

    private TextView mTextView;
    private RecyclerView mRecyclerView;
    private AdapterForRecyclerView mAdapterForRecyclerView;

    public static Fragment newInstance(int pageNum){

        Bundle args = new Bundle();
        args.putInt(PAGE_INT_KEY, pageNum);
        ListOfItemsFragment loiFragment = new ListOfItemsFragment();
        loiFragment.setArguments(args);
        return loiFragment;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mCurrentPage = getArguments().getInt(PAGE_INT_KEY);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.list_of_items_fragment, container, false);

        mRecyclerView = (RecyclerView)v.findViewById(R.id.recyclerViewID);
        mAdapterForRecyclerView = new AdapterForRecyclerView(getActivity(), GostilniskeJokes.getGostilniskeJokes());
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(mAdapterForRecyclerView);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(llm);

        /*
        mTextView = (TextView)v.findViewById(R.id.dummyTextViewId);
        mTextView.setText("Fragment #" + mCurrentPage);
        mRecyclerView = (RecyclerView)v.findViewById(R.id.recyclerViewID);
        */

        return v;
    }


}
