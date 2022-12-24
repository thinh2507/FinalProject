package com.example.finalproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject.R;
import com.example.finalproject.model.Voucher;

import java.util.List;

public class VoucherAdapter extends RecyclerView.Adapter<VoucherAdapter.VoucherViewHolder> {
    private Context context;
    private List<Voucher> voucherList;

    public VoucherAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<Voucher> list){
        this.voucherList = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public VoucherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_voucher, parent, false);
        return new VoucherViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VoucherViewHolder holder, int position) {
        Voucher voucher = voucherList.get(position);
        if (voucher == null){

        }
        holder.imgVoucher.setImageResource(voucher.getVoucherImg());
        holder.tvExpiredDate.setText(voucher.getExpiredDate());
        holder.tvVoucherName.setText(voucher.getTitle());
        holder.tvVoucherQty.setText(voucher.getQty());
        holder.tvVoucherStatus.setText(voucher.getStatus());

    }

    @Override
    public int getItemCount() {
        if (voucherList != null){
            return voucherList.size();
        }
        return 0;
    }

    public class VoucherViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgVoucher;
        private TextView tvExpiredDate, tvVoucherName, tvVoucherQty, tvVoucherStatus;

        public VoucherViewHolder(@NonNull View itemView) {
            super(itemView);
            imgVoucher = itemView.findViewById(R.id.imgVoucher);
            tvExpiredDate = itemView.findViewById(R.id.tvExpiredDate);
            tvVoucherName = itemView.findViewById(R.id.tvVoucherName);
            tvVoucherQty = itemView.findViewById(R.id.tvVoucherQty);
            tvVoucherStatus = itemView.findViewById(R.id.tvVoucherStatus);
        }
    }
}
