package bif14.mirt.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import bif14.mirt.R;

/**
 * Created by makan on 08/10/2017.
 */

public class LaporanViewHolder extends RecyclerView.ViewHolder {

    public TextView laporanTitle;
    public TextView laporanDesc;

    public LaporanViewHolder(View itemView, TextView laporanTitle, TextView laporanDesc) {
        super(itemView);
        this.laporanTitle = laporanTitle;
        this.laporanDesc = laporanDesc;
    }

    public LaporanViewHolder(View itemView) {
        super(itemView);
        laporanTitle = itemView.findViewById(R.id.txvJudulLap);
        laporanDesc = itemView.findViewById(R.id.txvDeskripsi);
    }
}
