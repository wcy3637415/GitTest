package com.nantian.gittest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ///////
        System.out.println("master");
        ////
        ////
        System.out.println("v1");


        System.out.println("测试回滚");

        System.out.println("我再测试回滚");
        
        ////
        System.out.println("测试冲突，什么鬼");

    }
}
