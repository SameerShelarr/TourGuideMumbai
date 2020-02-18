package com.example.tourguide_mumbai;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CustomFragmentPagerAdapter extends FragmentPagerAdapter {

    Context mContext;

    public CustomFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new ArchitectureFragment();
        } else if (position == 1){
            return new EatAndDrinkFragment();
        } else if (position == 2){
            return new ShoppingFragment();
        } else {
            return new ParksFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return mContext.getString(R.string.architecture);
        } else if (position == 1){
            return mContext.getString(R.string.eat_and_drink);
        } else if (position == 2){
            return mContext.getString(R.string.shopping);
        } else {
            return mContext.getString(R.string.gardens_and_parks);
        }
    }
}
