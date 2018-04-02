package com.zk.gilde_370;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.zk.gilde_370.util.GlideUtils;


public class MainActivity extends AppCompatActivity {

    private GlideUtils mIantance;
    String url = "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3127633144,3836369598&fm=27&gp=0.jpg";
    private ImageView mMImg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMImg1 = findViewById(R.id.mImg1);
        mIantance = GlideUtils.getIantance();
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mIantance.showImageView(MainActivity.this, R.mipmap.ic_launcher, url, mMImg1);

            }
        });
    }


}
