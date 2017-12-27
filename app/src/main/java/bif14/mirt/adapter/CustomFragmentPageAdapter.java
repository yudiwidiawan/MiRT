package bif14.mirt.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import bif14.mirt.fragment.LaporanFragment;
import bif14.mirt.fragment.ProsesFragment;
import bif14.mirt.fragment.RewardFragment;

/**
 * Created by makan on 08/10/2017.
 */

public class CustomFragmentPageAdapter extends FragmentPagerAdapter {
    private static final String TAG = CustomFragmentPageAdapter.class.getSimpleName();
    private static final int FRAGMENT_COUNT = 3;
    public CustomFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new LaporanFragment();
            case 1:
                return new ProsesFragment();
            case 2:
                return new RewardFragment();
        }
        return null;
    }
    @Override
    public int getCount() {
        return FRAGMENT_COUNT;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Daftar Warga";
            case 1:
                return "Proses";
            case 2:
                return "Saldo";
        }
        return null;
    }
}
