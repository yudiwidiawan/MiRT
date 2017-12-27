package bif14.mirt.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import bif14.mirt.DetailWarga;
import bif14.mirt.R;
import bif14.mirt.object.LaporanObject;
import bif14.mirt.viewholder.LaporanViewHolder;

/**
 * Created by makan on 08/10/2017.
 */

public class LaporanAdapter extends RecyclerView.Adapter<LaporanViewHolder>{
    private Context context;
    private List<LaporanObject> alllaporan;
    public LaporanAdapter(Context context, List<LaporanObject> alllaporan) {
        this.context = context;
        this.alllaporan = alllaporan;
    }
    @Override
    public LaporanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.laporan_list_layout, parent, false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailWarga.class);
                context.startActivity(intent);
            }
        });
        return new LaporanViewHolder(view);
    }
    @Override
    public void onBindViewHolder(LaporanViewHolder holder, int position) {
        LaporanObject laporan = alllaporan.get(position);
        holder.laporanTitle.setText(laporan.getJudul());
        holder.laporanDesc.setText(laporan.getStatus());
    }
    @Override
    public int getItemCount() {
        return alllaporan.size();
    }


}
