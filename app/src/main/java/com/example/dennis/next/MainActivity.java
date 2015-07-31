package com.example.dennis.next;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void plusThreeTeamA(View v){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void plusTwoTeamA(View v){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void freeThrowTeamA(View v){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }


    public void plusThreeTeamB(View v){
        scoreTeamB  = scoreTeamB  + 3;
        displayForTeamB(scoreTeamB);
    }

    public void plusTwoTeamB(View v){
        scoreTeamB  = scoreTeamB  + 2;
        displayForTeamB(scoreTeamB);
    }

    public void freeThrowTeamB(View v){
        scoreTeamB = scoreTeamB  + 1;
        displayForTeamB(scoreTeamB);
    }


    public void displayForTeamA(int score){
        TextView scoreView = (TextView)findViewById(R.id.display_team_score_A);
        scoreView.setText(String.valueOf(score));
    }



    public void displayForTeamB(int score){
        TextView scoreView = (TextView)findViewById(R.id.display_team_score_B);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScores(View v){
        displayForTeamA(scoreTeamA = 0);
        displayForTeamB(scoreTeamB = 0);
    }

}
