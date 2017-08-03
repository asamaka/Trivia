package com.example.android.trivia;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    boolean trueStatement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Resources res = getResources();
        String[] trueStatements = res.getStringArray(R.array.true_statements);
        String[] falseStatements = res.getStringArray(R.array.false_statements);

        if (Math.random() > 0.5) {
            trueStatement = true;
        } else {
            trueStatement = false;
        }
        String text;
        if (trueStatement) {
            text = trueStatements[(int) (Math.random() * 5)];
        } else {
            text = falseStatements[(int) (Math.random() * 5)];
        }

        TextView questionText = (TextView)findViewById(R.id.question);
        questionText.setText(text);

    }

    public void trueClicked(View view) {
        if(trueStatement){
            Intent correctActivity = new Intent(this,CorrectActivity.class);
            startActivity(correctActivity);
        } else {
            Intent wrongActivity = new Intent(this,WrongActivity.class);
            startActivity(wrongActivity);
        }
    }

    public void falseClicked(View view) {
        if(!trueStatement){
            Intent correctActivity = new Intent(this,CorrectActivity.class);
            startActivity(correctActivity);
        } else {
            Intent wrongActivity = new Intent(this,WrongActivity.class);
            startActivity(wrongActivity);
        }
    }
}
