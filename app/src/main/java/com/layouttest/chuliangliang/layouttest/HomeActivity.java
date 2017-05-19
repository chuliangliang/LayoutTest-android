package com.layouttest.chuliangliang.layouttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


    private void startNewActivityWithClass(Class cls)
    {
        Intent intent = new Intent(HomeActivity.this,cls);
        startActivity(intent);

    }

    //线性布局 之 水平
    public  void btn_h_linelayout(View view)
    {
        this.startNewActivityWithClass(LineActivity.class);
    }

    //线性布局 之 竖向
    public void btn_v_linelayout(View view)
    {
        this.startNewActivityWithClass(LineActivityForVertical.class);
    }

    //相对布局
    public void btn_relativeLayout(View view)
    {
        this.startNewActivityWithClass(RelativelActivity.class);
    }

    //帧布局
    public void btn_frameLayout(View view)
    {
        this.startNewActivityWithClass(FrameActivity.class);
    }

    //百分比布局
    public  void  btn_percentFrameLayout(View view)
    {
        this.startNewActivityWithClass(PercentFrameActivity.class);
    }
}
