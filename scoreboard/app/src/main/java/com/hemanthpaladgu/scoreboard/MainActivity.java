package com.hemanthpaladgu.scoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    TextView tv2;
    int a=0,b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.team_a);
        tv2=findViewById(R.id.team_b);
    }

    public void plus1(View view) {
        a+=1;
        tv1.setText(a+"");
    }

    public void plus2(View view) {
        a+=2;
        tv1.setText(a+"");
    }

    public void plus3(View view) {
        a+=3;
        tv1.setText(a+"");
    }

    public void plus11(View view) {
        b+=1;
        tv2.setText(b+"");
    }

    public void plus22(View view) {
        b+=2;
        tv2.setText(b+"");
    }

    public void plus33(View view) {
        b+=3;
        tv2.setText(b+"");
    }

    public void Reset(View view) {
        tv1.setText(0+"");
        tv2.setText(0+"");
        Toast.makeText(this, "reset completed", Toast.LENGTH_SHORT).show();
    }
}