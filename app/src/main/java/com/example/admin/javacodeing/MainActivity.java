package com.example.admin.javacodeing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.admin.javacodeing.Utities.MyTextUtil;

import static com.example.admin.javacodeing.R.id.myTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyTextUtil util =new MyTextUtil();
        TextView tv = (TextView) findViewById(myTextView);
        tv.setText(util.getval());

    }
}
