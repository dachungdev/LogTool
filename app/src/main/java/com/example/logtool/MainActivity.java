package com.example.logtool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
*  DACHUNG 19-5-31
*  主活动界面
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //日志工具的使用测试
        new LogUtil().getinstance().debug("hello dachung");
    }
}
