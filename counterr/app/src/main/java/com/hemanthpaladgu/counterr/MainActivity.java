package com.hemanthpaladgu.counterr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    int a=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.text);
    }

    public void minus(View view) {
        a--;
        if(a<=0){
            a=0;
            Toast.makeText(this, "Minimum value is 0", Toast.LENGTH_SHORT).show();
        }
        tv.setText(a+"");
    }

    public void reset(View view) {

        tv.setText(0+"");
    }

    public void plus(View view) {
        a++;
        tv.setText(a+"");
    }

    public void toast(View view) {
        Toast.makeText(this, "The count is "+a, Toast.LENGTH_LONG).show();
    }
}