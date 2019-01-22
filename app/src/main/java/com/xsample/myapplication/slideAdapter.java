package com.xsample.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class slideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public slideAdapter(Context context){
        this.context=context;
    }

    //Images
    public int[] imaeges1 = {
            R.drawable.baby_dress_10_1096580,
            R.drawable.icon,
            R.drawable.logo
    };

    public String [] title1 ={
            "Baby","Man","Women"
    };
    public String [] description1 ={
            "Baby description1description1description1 ","Man description1description1","Women description1description1"
    };
    public int [] backgroundColors = {
            Color.rgb(88,00,00),
            Color.rgb(00,88,00),
            Color.rgb(00,00,88),
    };
    @Override
    public int getCount() {
        return title1.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return (view == o);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide,container,false);
        LinearLayout layoutslide = view.findViewById(R.id.slideLayout);
        ImageView imgslide = view.findViewById(R.id.slideimg);
        TextView txttitle = view.findViewById(R.id.title);
        TextView txtbody =view.findViewById(R.id.idDescription);
        layoutslide.setBackgroundColor(backgroundColors[position]);
        imgslide.setImageResource(imaeges1[position]);
        txttitle.setText(title1[position]);
        txtbody.setText(description1[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }
}
