package com.example.k00na_.shalomat;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.k00na_.shalomat.adapters.AdapterForTabs;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;
    private static final String PREF_FILE_NAME = "preferenceFile";
    private static final String KEY_USER_LEARNED_DRAWER = "user_learned_drawer";
    private boolean mUserLearnedDrawer = false;

    private TabLayout mTabLayout;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar)findViewById(R.id.includeappbar);
        mDrawerLayout = (DrawerLayout)findViewById(R.id.ourDrawerLayout);
        mTabLayout = (TabLayout)findViewById(R.id.sliding_tabs_id);
        mViewPager = (ViewPager)findViewById(R.id.viewpager_id);

        mViewPager.setAdapter(new AdapterForTabs(getSupportFragmentManager(), MainActivity.this));
        mTabLayout.setupWithViewPager(mViewPager);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.abc_btn_borderless_material);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mNavigationView = (NavigationView)findViewById(R.id.navigationView);

        mTabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                if(menuItem.isChecked())
                    menuItem.setChecked(false);
                else
                    menuItem.setChecked(true);

                mDrawerLayout.closeDrawers();

                switch (menuItem.getItemId()){

                    case(R.id.blondinke_navigation):{
                        Toast.makeText(getApplicationContext(), "Blondinke", Toast.LENGTH_LONG).show();
                        mToolbar.setTitle(R.string.blondinkeNav);
                        return true;
                    }

                    case(R.id.crnihumor_navigation):{
                        Toast.makeText(getApplicationContext(), "Črni humor", Toast.LENGTH_LONG).show();
                        mToolbar.setTitle(R.string.crnihumorNav);
                        return true;
                    }

                    case(R.id.gostilniske_navigation):{
                        Toast.makeText(getApplicationContext(), "Gostilniške", Toast.LENGTH_LONG).show();
                        mToolbar.setTitle(R.string.gostilniskeNav);
                        return true;
                    }

                    case(R.id.janezek_navigation):{
                        Toast.makeText(getApplicationContext(), "Janezek", Toast.LENGTH_LONG).show();
                        mToolbar.setTitle(R.string.janezNav);
                        return true;
                    }

                    case(R.id.mujohaso_navigation):{
                        Toast.makeText(getApplicationContext(), "Mujo&Haso", Toast.LENGTH_LONG).show();
                        mToolbar.setTitle(R.string.mujohasoNav);
                        return true;
                    }

                    case(R.id.policaji_navigation):{
                        Toast.makeText(getApplicationContext(), "Policaji", Toast.LENGTH_LONG).show();
                        mToolbar.setTitle(R.string.policajiNav);
                        return true;
                    }

                    case(R.id.tvojamama_navigation):{
                            mToolbar.setTitle(R.string.tvojaMamaNav);
                        return true;
                    }

                    case(R.id.tasce_navigation):{
                        mToolbar.setTitle(R.string.tasceNav);
                        return true;
                    }

                    case(R.id.politicnivici_navigation):{
                        mToolbar.setTitle(R.string.politicniNav);
                        return true;
                    }

                    case(R.id.yugovici_navigation):{
                        mToolbar.setTitle(R.string.yugoviciNav);
                        return true;

                    }

                    default: {
                        Toast.makeText(getApplicationContext(), "This shouldnt be happening...", Toast.LENGTH_LONG).show();
                        return true;
                    }



                }
            }
        });

        ActionBarDrawerToggle toggler = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.drawerOpen, R.string.drawerClosed){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);

                if(!mUserLearnedDrawer){
                    mUserLearnedDrawer = true;
                    saveToPreferences(getApplicationContext(), KEY_USER_LEARNED_DRAWER, mUserLearnedDrawer + "");

                }

                invalidateOptionsMenu();


            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);

                invalidateOptionsMenu();
            }
        };

        mDrawerLayout.setDrawerListener(toggler);
        toggler.syncState();


    }

    public static void saveToPreferences(Context context, String preferenceName, String preferenceValue){

        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(preferenceName, preferenceValue);
        editor.apply();

    }

    public static String readFromPreferences(Context context, String preferenceName, String defaultValue){

        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString(preferenceName, defaultValue);

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

        if(id == R.id.home){
            mDrawerLayout.closeDrawers();
           // mDrawerLayout.openDrawer(GravityCompat.START);
           return  true;
        }

        return super.onOptionsItemSelected(item);
    }
}
