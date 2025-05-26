package com.example.mysocialuni;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ASHaberlerAdapter extends RecyclerView.Adapter<ASHaberlerAdapter.ViewHolder> {
    private final List<ASHaberlerModel> haberList;
    private final Context context;

    public ASHaberlerAdapter(Context context, List<ASHaberlerModel> haberList) {
        this.context = context;
        this.haberList = haberList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.as_haberler_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ASHaberlerModel haber = haberList.get(position);
        holder.tvDay.setText(haber.getDay());
        holder.tvMonth.setText(haber.getMonth());
        holder.tvTitle.setText(haber.getTitle());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, ASHaberDetayActivity.class);
            intent.putExtra("day", haber.getDay());
            intent.putExtra("month", haber.getMonth());
            intent.putExtra("title", haber.getTitle());
            intent.putExtra("description", haber.getDescription()); // Açıklamayı ekle
            intent.putExtra("imageResId", haber.getImageResId());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return haberList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvDay, tvMonth, tvTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvDay = itemView.findViewById(R.id.tv_news_day);
            tvMonth = itemView.findViewById(R.id.tv_news_month);
            tvTitle = itemView.findViewById(R.id.tv_news_title);
        }
    }
}