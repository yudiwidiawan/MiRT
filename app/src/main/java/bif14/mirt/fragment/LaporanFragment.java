package bif14.mirt.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import bif14.mirt.R;
import bif14.mirt.adapter.LaporanAdapter;
import bif14.mirt.object.LaporanObject;
import bif14.mirt.object.Warga;

/**
 * Created by makan on 08/10/2017.
 */

public class LaporanFragment extends Fragment {
    Firebase mRef;
    final static ArrayList<Warga> listWarga = new ArrayList<>();
    RecyclerView laporanRecyclerView;
    public LaporanFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_laporan, container, false);
        getActivity().setTitle("Laporan");
        laporanRecyclerView = (RecyclerView)view.findViewById(R.id.song_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        laporanRecyclerView.setLayoutManager(linearLayoutManager);
        laporanRecyclerView.setHasFixedSize(true);
        //LaporanAdapter mAdapter = new LaporanAdapter(getActivity(), getTestData());
        //laporanRecyclerView.setAdapter(mAdapter);
        return view;
    }
    public List<LaporanObject> getTestData() {
        List<LaporanObject> recentLaporan = new ArrayList<LaporanObject>();
        recentLaporan.add(new LaporanObject("No. KK : 12383723", "Keluarga Bpk. Andy"));
        recentLaporan.add(new LaporanObject("No. KK : 12333219", "Keluarga Bpk. Budi"));

        return recentLaporan;
    }

    @Override
    public void onStart() {
        super.onStart();
        mRef = new Firebase("https://mirt-8bf77.firebaseio.com/warga");
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                listWarga.clear();
                for (DataSnapshot wargaSnapshot : dataSnapshot.getChildren()){
                    listWarga.add(wargaSnapshot.getValue(Warga.class));
                }
                LaporanAdapter mAdapter = new LaporanAdapter(getActivity(), listWarga);
                laporanRecyclerView.setAdapter(mAdapter);
                mAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {
                Log.e("error_fbase:", firebaseError.getMessage());
            }
        });
    }
}
