package com.example.javadeepaksir;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.zip.Inflater;

public class MyAdaptor extends BaseAdapter
{
    Context context;
    int [] data;
    LayoutInflater inflater;

    MyAdaptor(Context context,int[] data)
    {
        this.context=context;
        this.data=data;
        inflater=LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int i) {
        return 0;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=inflater.inflate(R.layout.gridview,null);
        ImageView imageView=(ImageView) view.findViewById(R.id.imgView);
        imageView.setImageResource(data[i]);
        return view;
    }
}
