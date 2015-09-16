package com.example.kangingu.testapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class ConfirmCallActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private PagerAdapter mPagerAdapter;
    private ArrayList<ConfirmCallFragment> mCallFragmentArray;
    //TODO : 서버에서 현재 주문서정보 읽어온뒤 프래그먼트 생성
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_call);

        mViewPager = (ViewPager)findViewById(R.id.call_pager);
        mPagerAdapter = new gpdPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mPagerAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_confirm_call, menu);
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


    private  void loadCallPaperFragmentsFromServer(){
     //TODO : 서버로부터 주문서정보 받아와서 프래그먼트 로드함.
    }


    //TODO : 만들어진 프래그먼트를 보여주는 어댑터
    private  class  gpdPagerAdapter extends FragmentPagerAdapter {

        public gpdPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {


            return mCallFragmentArray.get(position);
        }

        @Override
        public int getCount() {
            return mCallFragmentArray.size();
        }
    }
}
