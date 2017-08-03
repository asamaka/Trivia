package com.example.android.trivia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WrongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong);
    }

    public void continueGame(View view) {

        Intent newGameIntent = new Intent(this,GameActivity.class);
        startActivity(newGameIntent);
    }
}
