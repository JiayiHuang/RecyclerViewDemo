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
public class MyGridAdapter extends RecyclerView.Adapter<MyGridAdapter.GridViewHolder> {
    private Context mContext;
    private ArrayList<DataBean> mDBList;
    public MyGridAdapter(Context context, ArrayList<DataBean> mDBList) {
        this.mContext = context;
        this.mDBList = mDBList;
    }

    @Override
    public GridViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new GridViewHolder(View.inflate(mContext,R.layout.item_grid,null));
    }

    @Override
    public void onBindViewHolder(GridViewHolder holder, int position) {
        holder.setDatas(mDBList.get(position));
    }

    @Override
    public int getItemCount() {
        if (null != mDBList){
            return mDBList.size();
        }
        return 0;
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgGrid;
        private TextView tvGrid;
        public GridViewHolder(View itemView) {
            super(itemView);
            imgGrid = (ImageView) itemView.findViewById(R.id.img_list);
            tvGrid = (TextView) itemView.findViewById(R.id.tv_list);
        }

        public void setDatas(DataBean datas) {
            imgGrid.setImageResource(datas.getResID());
            tvGrid.setText(datas.getDescription());
        }
    }
}
