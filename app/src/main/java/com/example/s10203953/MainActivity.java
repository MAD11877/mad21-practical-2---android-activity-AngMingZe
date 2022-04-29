package com.example.s10203953;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public class User{
        //Attr
        String name;
        String description;
        int id;
        boolean followed;
        //Constructor
        public User(){};
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void anyName(View v){
        //Event handler
        Button b1 = findViewById(R.id.follow);
        String text = b1.getText().toString();//Text of follow button
        if (text == "Follow"){
            b1.setText("Unfollow");
        }
        else if (text == "Unfollow"){
            b1.setText("Follow");
        }
    }
}