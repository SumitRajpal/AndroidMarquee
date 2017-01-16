package com.example.sumit.androidmarquee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView.setSelected(true);
        textView.setSingleLine(true);
        textView.setText("Oxfam says 8 men as rich as half the world. | Govt may set threshold for probe into deposits. | At least 32 dead after Turkish plane hits village.");
    }
}
