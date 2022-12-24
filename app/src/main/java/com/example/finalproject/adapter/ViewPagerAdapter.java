package com.example.finalproject.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.finalproject.fragment.CartFragment;
import com.example.finalproject.fragment.HomeFragment;
import com.example.finalproject.fragment.ProductFragment;
import com.example.finalproject.fragment.ProfileFragment;
import com.example.finalproject.fragment.VoucherFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new ProductFragment();
            case 2:
                return new CartFragment();
            case 3:
                return new VoucherFragment();
            case 4:
                return new ProfileFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
