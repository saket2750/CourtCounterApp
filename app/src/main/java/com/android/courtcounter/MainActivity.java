package com.android.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int teamAscore = 0;
    private int teamBscore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void teamA1(View view){
        teamAscore = teamAscore+1;
        displayA(teamAscore);
    }

    public void teamA2(View view){
        teamAscore = teamAscore+2;
        displayA(teamAscore);
    }

    public void teamA3(View view){
        teamAscore = teamAscore+3;
        displayA(teamAscore);
    }

    public void displayA(int num){
        TextView view = findViewById(R.id.teamAScore);
        view.setText("" +num);
    }

    public void teamB1(View view){
        teamBscore = teamBscore+1;
        displayB(teamBscore);
    }

    public void teamB2(View view){
        teamBscore = teamBscore+2;
        displayB(teamBscore);
    }

    public void teamB3(View view){
        teamBscore = teamBscore+3;
        displayB(teamBscore);
    }

    public void displayB(int num){
        TextView view = findViewById(R.id.teamBScore);
        view.setText(""+num);
    }

    public void resetScore(View view)
    {
        teamBscore = 0;
        teamAscore = 0;
        displayA(teamAscore);
        displayB(teamBscore);
    }
}