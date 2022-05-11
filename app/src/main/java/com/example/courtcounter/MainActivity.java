package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 int counter=0;
 int counterB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void threeB(View view)
    {
        counterB=counterB+3;
        displayScoreB(counterB);
    }
    public void twoB(View view)
    {
        counterB=counterB+2;
        displayScoreB(counterB);
    }
    public void freethrowB(View view)
    {
        counterB=counterB+1;
        displayScoreB(counterB);
    }
    public void three(View view)
    {
        counter=counter+3;
        displayScore(counter);
    }
    public void two(View view)
    {
        counter=counter+2;
        displayScore(counter);
    }
    public void freethrow(View view)
    {
        counter=counter+1;
        displayScore(counter);
    }
    public void reset(View view)
    {
        counter=0;
        counterB=0;
        displayScore(counter);
        displayScoreB(counterB);
    }

    public void displayScore(int number)
    {
        TextView textview= (TextView) findViewById(R.id.score);
        textview.setText(""+number);
    }
    public void displayScoreB(int number)
    {
        TextView textview= (TextView) findViewById(R.id.scoreB);
        textview.setText(""+number);
    }
}