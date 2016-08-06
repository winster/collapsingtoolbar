package com.amadeus.collpasingtoolbar;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by wjose on 7/11/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static String TAG = MyAdapter.class.getSimpleName();

    private Context mContext;
    private ArrayList<Card> arrayList;

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView _data;

        public ViewHolder(View view) {
            super(view);
            _data = (TextView) itemView.findViewById(R.id.data);
        }
    }

    public MyAdapter(Context mContext, ArrayList<Card> arrayList) {
        this.mContext = mContext;
        this.arrayList = arrayList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;
        RecyclerView.ViewHolder viewHolder=null;
        itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }


    @Override
    public int getItemViewType(int position) {
        Card card = arrayList.get(position);
        return 1;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        Card card = arrayList.get(position);
        ((ViewHolder) holder)._data.setText(card.getData());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

}
