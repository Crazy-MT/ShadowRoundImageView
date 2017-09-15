package com.mt.dev;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Glide.with(this)
                .load(R.mipmap.mix)
                .transform(new GlideRoundTransform(this, 8))
                .into((ImageView) findViewById(R.id.id_img));
    }
}
