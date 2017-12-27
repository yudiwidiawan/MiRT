package bif14.mirt.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import bif14.mirt.R;
import bif14.mirt.adapter.LaporanAdapter;
import bif14.mirt.object.LaporanObject;

/**
 * Created by makan on 08/10/2017.
 */

public class ProsesFragment extends Fragment {
    public ProsesFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_proses, container, false);
        getActivity().setTitle("Proses");
        RecyclerView laporanRecyclerView = (RecyclerView)view.findViewById(R.id.proses_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        laporanRecyclerView.setLayoutManager(linearLayoutManager);
        laporanRecyclerView.setHasFixedSize(true);
        LaporanAdapter mAdapter = new LaporanAdapter(getActivity(), getTestData());
        laporanRecyclerView.setAdapter(mAdapter);
        return view;
    }
    public List<LaporanObject> getTestData() {
        List<LaporanObject> recentLaporan = new ArrayList<LaporanObject>();
        recentLaporan.add(new LaporanObject("Laporan 1", "Kendaraan parkir sembarangan"));
        recentLaporan.add(new LaporanObject("Laporan 2", "Kendaraan parkir sembarangan"));
        return recentLaporan;
    }
}
