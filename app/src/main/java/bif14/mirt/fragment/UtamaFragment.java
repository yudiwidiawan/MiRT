package bif14.mirt.fragment;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bif14.mirt.R;
import bif14.mirt.adapter.CustomFragmentPageAdapter;

/**
 * Created by makan on 08/10/2017.
 */

public class UtamaFragment extends Fragment {
    private static final String TAG = UtamaFragment.class.getSimpleName();
    private TabLayout tabLayout;
    private ViewPager viewPager;
    public UtamaFragment() {
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_utama, container, false);
        tabLayout = (TabLayout)view.findViewById(R.id.tabs);
        viewPager = (ViewPager)view.findViewById(R.id.view_pager);
        viewPager.setAdapter(new CustomFragmentPageAdapter(getChildFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }
}
