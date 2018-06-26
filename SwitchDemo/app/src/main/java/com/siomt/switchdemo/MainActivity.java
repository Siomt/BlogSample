package com.siomt.switchdemo;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

/**
 * switch 开发控件demo
 * Created by Mr.Robot on 2018/6/21
 * https://github.com/Siomt
 */
public class MainActivity extends AppCompatActivity {

    private TextView mTvTitle;
    private Switch mSwitch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvTitle = (TextView) findViewById(R.id.tv_title);
        mSwitch1 = (Switch) findViewById(R.id.switch1);

//        mSwitch1.setSplitTrack(true);
        mSwitch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    mTvTitle.setText("关闭");
                }else {
                    mTvTitle.setText("开启");
                }
            }
        });

    }
}
