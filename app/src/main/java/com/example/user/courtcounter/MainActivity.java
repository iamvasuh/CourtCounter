package com.example.user.courtcounter;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    String message= "WINNER !!";
    String draw= "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * Increase the score for Team A by 1 point.
     */

    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View V){
        displayForTeamA(0);
        displayForTeamB(0);
        scoreTeamA = 0;
        scoreTeamB = 0;
        winnerTeamA(draw);
        winnerTeamB(draw);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
        winnerClass( scoreTeamA ,  scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
        winnerClass( scoreTeamA ,  scoreTeamB);

    }


    private void winnerClass(int scoreTeamA , int scoreTeamB) {
        if( scoreTeamB < scoreTeamA){
            winnerTeamA(message);
        }
        else if (scoreTeamB > scoreTeamA){
            winnerTeamB(message);
        }
        else {
            winnerTeamA(draw);
            winnerTeamB(draw);
        }
    }
    private void winnerTeamA(String message){
        TextView priceTextView = (TextView) findViewById(R.id.winner_team_a);
        priceTextView.setText(message);
    }
    private void winnerTeamB(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.winner_team_b);
        priceTextView.setText(message);
    }
}
