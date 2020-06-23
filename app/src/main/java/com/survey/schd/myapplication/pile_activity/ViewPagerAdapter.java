package com.survey.schd.myapplication.pile_activity;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;

import com.survey.schd.myapplication.R;

public class ViewPagerAdapter extends PagerAdapter {
    private String[] resIds = {"AK0+100","KK2+500", "KK2+600", "KK2+700", "KK2+800",
            "KK3+100", "KK3+200", "KK3+300","KK4+100", "KK4+200",
            "KK4+300","KK4+500", "KK4+600", "KK4+700","KK5+500",
            "KK5+600","SZK0+500", "SZK0+600","SZK1+300", "SZK1+400",
            "SZK1+500","ZKK4+100", "ZKK4+200", "ZKK4+300", "ZKK5+300", "ZKK5+400", "ZKK5+500"
    };

    private Context context ;
    public ViewPagerAdapter(Context context) {
        this.context = context ;
    }

    @Override
    public int getCount() {
        return resIds.length;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = View.inflate(context, R.layout.activity_pile, null);
//        GridView gridView = (GridView) view.findViewById(R.id.);
//        ImageView imageView = (ImageView) view.findViewById(R.id.image);
//        Glide.with(context)
//                .load(resIds[position])
//                .into(imageView);
//        imageView.setImageResource(resIds[position]);
        //添加到容器中
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }
}
