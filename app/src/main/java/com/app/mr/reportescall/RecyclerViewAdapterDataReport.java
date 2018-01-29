package com.app.mr.reportescall;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by r.contreras on 29/01/2018.
 */

public class RecyclerViewAdapterDataReport extends RecyclerView.Adapter<RecyclerViewAdapterDataReport.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView fecha, tipo_producto;

        public ViewHolder(View itemView) {
            super(itemView);

            fecha = (TextView)itemView.findViewById(R.id.fechatv);
            tipo_producto = (TextView)itemView.findViewById(R.id.tipo_productotv);
        }
    }

    public List<DataReport> reporteLista;

    public RecyclerViewAdapterDataReport(List<DataReport> reporteLista){

        this.reporteLista = reporteLista;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_report, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.fecha.setText(reporteLista.get(position).getFecha());
        holder.tipo_producto.setText(reporteLista.get(position).getTipo_producto());
    }

    @Override
    public int getItemCount() {
        return reporteLista.size();
    }







}
