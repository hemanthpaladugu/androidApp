package com.hemanthpaladgu.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText passwor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        passwor=findViewById(R.id.passw);
    }

    public void signin(View view) {
        if(passwor.getText().toString().equals("hello")){
            Intent i=new Intent(this,welcome.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, "wrong password ", Toast.LENGTH_SHORT).show();
        }
        
    }

    public void register(View view) {
        Intent i= new Intent(this,register.class);
        startActivity(i);
    }
}