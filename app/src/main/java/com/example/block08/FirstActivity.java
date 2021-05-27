package com.example.block08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }
    public void submit (View v){
        RatingBar ratingBar =(RatingBar) findViewById(R.id.ratingBar);
        float rating = ratingBar.getRating();
        Intent gotosecond = new Intent();
        gotosecond.setClass(this,SecondActivity.class);
        gotosecond.putExtra("stars",rating);
        startActivity(gotosecond);
        finish();
    }
}
