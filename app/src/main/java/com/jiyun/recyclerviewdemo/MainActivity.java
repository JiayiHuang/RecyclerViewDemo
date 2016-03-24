package com.jiyun.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    /**
     * RecyclerView 相较于之前的ListView/GridView
     * 它使用的原理也是适配器模式,只是多了一个布局管理器LayoutManager,
     * 它内部是依赖于LayoutManager来实现布局样式
     *
     */
    private RecyclerView mRecyclerView;
    private ArrayList<DataBean> mDBList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // 1初始化View
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        loadData();
        loadListView(LinearLayout.VERTICAL, false);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_list_normal) {
            loadListView(LinearLayout.VERTICAL, false);
            return true;
        }
        if (id == R.id.action_list_vertical_reverse) {
            loadListView(LinearLayout.VERTICAL, true);
            return true;
        }
        if (id == R.id.action_list_horizontal) {
            loadListView(LinearLayout.HORIZONTAL, false);
            return true;
        }
        if (id == R.id.action_list_horizontal_reverse) {
            loadListView(LinearLayout.HORIZONTAL, true);
            return true;
        }
        if (id == R.id.action_grid_normal) {
            loadGridView(LinearLayout.VERTICAL, false);
            return true;
        }
        if (id == R.id.action_grid_vertical_reverse) {
            loadGridView(LinearLayout.VERTICAL, true);
            return true;
        }
        if (id == R.id.action_grid_horizontal) {
            loadGridView(GridLayoutManager.HORIZONTAL, false);
            return true;
        }
        if (id == R.id.action_grid_horizontal_reverse) {
            loadGridView(LinearLayout.HORIZONTAL, true);
            return true;
        }
        if (id == R.id.action_staggered_normal) {
            loadStaggeredView(LinearLayout.VERTICAL, false);
            return true;
        }
        if (id == R.id.action_staggered_vertical_reverse) {
            loadStaggeredView(LinearLayout.VERTICAL, true);
            return true;
        }
        if (id == R.id.action_staggered_horizontal) {
            loadStaggeredView(LinearLayout.HORIZONTAL, false);
            return true;
        }
        if (id == R.id.action_staggered_horizontal_reverse) {
            loadStaggeredView(LinearLayout.HORIZONTAL, true);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void loadStaggeredView(int orientation, boolean reverse) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, orientation);
        staggeredGridLayoutManager.setReverseLayout(reverse);
        mRecyclerView.setLayoutManager(staggeredGridLayoutManager);
        mRecyclerView.setAdapter(new MyStaggeredAdapter(this,mDBList));
    }

    private void loadGridView(int orientation, boolean reverse) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        gridLayoutManager.setOrientation(orientation);
        gridLayoutManager.setReverseLayout(reverse);
        mRecyclerView.setLayoutManager(gridLayoutManager);
        mRecyclerView.setAdapter(new MyGridAdapter(this,mDBList));
    }

    private void loadListView(int orientation, boolean reverse) {// 标准样式
        //给RecyclerView 加载数据
        // 1. LayoutManager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setReverseLayout(reverse);
        linearLayoutManager.setOrientation(orientation);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        // 2. 适配器
        mRecyclerView.setAdapter(new MyListAdapter(this,mDBList));

    }

    private void loadData(){
        mDBList = new ArrayList<>();
        DataBean dataBean = new DataBean();
        dataBean.setDescription("头像 -- 01");
        dataBean.setResID(R.mipmap.img_1);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 02");
        dataBean.setResID(R.mipmap.img_2);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 03");
        dataBean.setResID(R.mipmap.img_3);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 04");
        dataBean.setResID(R.mipmap.img_4);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 05");
        dataBean.setResID(R.mipmap.img_5);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 06");
        dataBean.setResID(R.mipmap.img_6);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 07");
        dataBean.setResID(R.mipmap.img_7);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 08");
        dataBean.setResID(R.mipmap.img_8);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 09");
        dataBean.setResID(R.mipmap.img_9);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 10");
        dataBean.setResID(R.mipmap.img_10);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 11");
        dataBean.setResID(R.mipmap.img_11);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 12");
        dataBean.setResID(R.mipmap.img_12);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 13");
        dataBean.setResID(R.mipmap.img_13);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 14");
        dataBean.setResID(R.mipmap.img_14);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 15");
        dataBean.setResID(R.mipmap.img_15);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 16");
        dataBean.setResID(R.mipmap.img_16);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 17");
        dataBean.setResID(R.mipmap.img_17);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 18");
        dataBean.setResID(R.mipmap.img_18);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 19");
        dataBean.setResID(R.mipmap.img_19);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 20");
        dataBean.setResID(R.mipmap.img_20);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 21");
        dataBean.setResID(R.mipmap.img_21);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 22");
        dataBean.setResID(R.mipmap.img_22);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 23");
        dataBean.setResID(R.mipmap.img_23);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 24");
        dataBean.setResID(R.mipmap.img_24);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 25");
        dataBean.setResID(R.mipmap.img_25);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 26");
        dataBean.setResID(R.mipmap.img_26);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 27");
        dataBean.setResID(R.mipmap.img_27);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 28");
        dataBean.setResID(R.mipmap.img_28);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 29");
        dataBean.setResID(R.mipmap.img_29);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 30");
        dataBean.setResID(R.mipmap.img_30);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 31");
        dataBean.setResID(R.mipmap.img_31);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 32");
        dataBean.setResID(R.mipmap.img_32);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 33");
        dataBean.setResID(R.mipmap.img_33);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 34");
        dataBean.setResID(R.mipmap.img_34);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 35");
        dataBean.setResID(R.mipmap.img_35);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 36");
        dataBean.setResID(R.mipmap.img_36);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 37");
        dataBean.setResID(R.mipmap.img_37);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 38");
        dataBean.setResID(R.mipmap.img_38);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 39");
        dataBean.setResID(R.mipmap.img_39);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 40");
        dataBean.setResID(R.mipmap.img_40);
        mDBList.add(dataBean);
        dataBean = new DataBean();
        dataBean.setDescription("头像 -- 41");
        dataBean.setResID(R.mipmap.img_41);
        mDBList.add(dataBean);
    }
}
