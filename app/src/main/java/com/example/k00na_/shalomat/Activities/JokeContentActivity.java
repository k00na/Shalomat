package com.example.k00na_.shalomat.Activities;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.NavUtils;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.k00na_.shalomat.MainActivity;
import com.example.k00na_.shalomat.Model.AppsSingleton;
import com.example.k00na_.shalomat.Model.GostilniskeJokes;
import com.example.k00na_.shalomat.Model.Joke;
import com.example.k00na_.shalomat.Model.JokeArrays;
import com.example.k00na_.shalomat.R;
import com.example.k00na_.shalomat.adapters.ViewPagerAdapter;
import com.example.k00na_.shalomat.fragments.JokeContentFragment;
import com.example.k00na_.shalomat.fragments.ListOfItemsFragment;

import java.util.ArrayList;
import java.util.UUID;

public class JokeContentActivity extends AppCompatActivity {

    private TextView jokeContent;
    private Toolbar mToolbar;
    private static ArrayList<Joke> mCurrentCategory;
    private int mCurrentCategoryNum;
    private UUID mJokeID;

    private ViewPager mViewPager;
    // letsdothis


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_content);

        mViewPager = (ViewPager)findViewById(R.id.viewPagerXMLid);


        /*
            GETTING DATA
         */

        Intent i = getIntent();

        mJokeID = (UUID) i.getSerializableExtra("jokeIDForContentFragment");
        int currentJokeIndex = i.getIntExtra("currentJokeIndex", 0);
        String currentTitle = i.getStringExtra(ListOfItemsFragment.CATEGORY_TITLE_KEY);
        mCurrentCategoryNum = i.getIntExtra("currentCategoryInt", 0);

        Log.i("checkcheck", "Current category num: " + mCurrentCategoryNum);

        mCurrentCategory = AppsSingleton.get(getApplicationContext()).getCurrentJokeCategory(mCurrentCategoryNum);

        /*
            TOOLBAR WIRING
         */


        mToolbar = (Toolbar)findViewById(R.id.includingAppBarForJokeContent);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle(currentTitle);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        /*
            VIEW PAGERS ADAPTER
         */

        mViewPager.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {

                Joke joke = mCurrentCategory.get(position);
                return JokeContentFragment.newInstance(joke.getJokeID());

            }

            @Override
            public int getCount() {
                return mCurrentCategory.size();
            }


        });

        for(int j = 0; j<mCurrentCategory.size(); j++){
            if(mCurrentCategory.get(j).getJokeID().equals(mJokeID)){
                mViewPager.setCurrentItem(j);
                break;
            }
        }

    }

    public static ArrayList<Joke> getJokesFromContentActivity(){

        return mCurrentCategory;


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_joke_content, menu);
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

        if(id == R.id.home) {
            Intent i = new Intent(this, MainActivity.class);
            i.putExtra("categoryFromJokeContentActivity", mCurrentCategoryNum);
            startActivity(i);

           // NavUtils.navigateUpTo(getParent(), i);
        }

        return super.onOptionsItemSelected(item);
    }

    private ArrayList<Joke> setCurrentCategory(String currTitle){

        ArrayList<Joke> currentCategory = new ArrayList<Joke>();

        switch (currTitle){

            case("Blondinke"):
                currentCategory = AppsSingleton.get(getApplicationContext()).getCurrentJokeCategory(R.id.blondinke_navigation);

            case("Gostilniške"):
                currentCategory = AppsSingleton.get(getApplicationContext()).getCurrentJokeCategory(R.id.gostilniske_navigation);




        }

        return currentCategory;
    }


}
