package com.jiyun.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by JiyunHuang on 2015/12/23.
 */
public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ListViewHolder> {
    private Context mContext;
    private ArrayList<DataBean> mDBList;
    public MyListAdapter(Context context,ArrayList<DataBean> mDBList){
        this.mContext = context;
        this.mDBList = mDBList;
    }
    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(mContext,R.layout.item_list,null);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        holder.setData(mDBList.get(position));
    }

    @Override
    public int getItemCount() {
        if (null != mDBList){
            return mDBList.size();
        }
        return 0;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgList;
        private TextView tvList;

        public ListViewHolder(View itemView) {
            super(itemView);
            imgList = (ImageView) itemView.findViewById(R.id.img_list);
            tvList = (TextView) itemView.findViewById(R.id.tv_list);
        }

        public void setData(DataBean data) {
            imgList.setImageResource(data.getResID());
            tvList.setText(data.getDescription());
        }
    }
}
