package com.example.viewpager1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class Adapter  extends FragmentStateAdapter {
    public Adapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position==0)
            return new AppleFragment();
        else if (position==1)
            return  new OrangeFragment();
        else if (position==2)
            return new GrapesFragment();
        else
            return new BananaFragment();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
