package com.example.android.genericnycguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.genericnycguide.EventsFragment;
import com.example.android.genericnycguide.FoodsFragment;
import com.example.android.genericnycguide.R;
import com.example.android.genericnycguide.ShopsFragment;
import com.example.android.genericnycguide.SitesFragment;

public class CategoryAdapter extends FragmentPagerAdapter {

    Context mContext;
    public CategoryAdapter(Context c, FragmentManager fm) {
        super(fm);
        mContext = c;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SitesFragment();
        } else if (position == 1){
            return new FoodsFragment();
        } else if (position == 2) {
            return new ShopsFragment();
        } else{
            return new EventsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    // overriding getPageTitle()
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_sites_title).toUpperCase();
        } else if (position == 1) {
            return mContext.getString(R.string.category_foods_title).toUpperCase();
        } else if (position == 2) {
            return mContext.getString(R.string.category_shops_title).toUpperCase();
        } else {
            return mContext.getString(R.string.category_events_title).toUpperCase();
        }
    }
}
