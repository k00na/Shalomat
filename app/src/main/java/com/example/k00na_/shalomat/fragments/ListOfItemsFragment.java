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

import com.example.k00na_.shalomat.Model.GostilniskeJokes;
import com.example.k00na_.shalomat.R;
import com.example.k00na_.shalomat.adapters.AdapterForRecyclerView;

/**
 * Created by k00na_ on 24.8.2015.
 */
public class ListOfItemsFragment extends Fragment {

    public static final String CATEGORY_KEY = "pageintegerkey";
    public static final String CATEGORY_TITLE_KEY = "categoryTitleKey";
    private int mCurrentCategoryInt;

    private TextView mTextView;
    private RecyclerView mRecyclerView;
    private AdapterForRecyclerView mAdapterForRecyclerView;
    private String mCurrentCategoryTitle;

    public static Fragment newInstance(int categoryNum, String currentTitle){

        Bundle args = new Bundle();
        args.putInt(CATEGORY_KEY, categoryNum);
        args.putString(CATEGORY_TITLE_KEY, currentTitle);
        ListOfItemsFragment loiFragment = new ListOfItemsFragment();
        loiFragment.setArguments(args);
        return loiFragment;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mCurrentCategoryInt = getArguments().getInt(CATEGORY_KEY);
        mCurrentCategoryTitle = getArguments().getString(CATEGORY_TITLE_KEY);


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.list_of_items_fragment, container, false);


        mRecyclerView = (RecyclerView)v.findViewById(R.id.recyclerViewID);
        mAdapterForRecyclerView = new AdapterForRecyclerView(getActivity(), mCurrentCategoryInt, mCurrentCategoryTitle);
       // mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(mAdapterForRecyclerView);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(llm);

        /*
        mTextView = (TextView)v.findViewById(R.id.dummyTextViewId);
        mTextView.setText("Fragment #" + mCurrentCategoryInt);
        mRecyclerView = (RecyclerView)v.findViewById(R.id.recyclerViewID);
        */

        return v;
    }


}
