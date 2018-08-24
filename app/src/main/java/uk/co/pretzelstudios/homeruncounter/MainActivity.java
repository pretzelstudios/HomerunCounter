package uk.co.pretzelstudios.homeruncounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Keep track of the match");
    }

    //team A Score display

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //team A scores a single hit add 1 to the score

    public void onePointTeamA(View view) {
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }

    //team A scores a pitching win add 3 to the score

    public void threePointTeamA(View view) {
        teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);
    }

    //team A scores a home run add 4 points to the score

    public void fourPointTeamA(View view) {
        teamAScore = teamAScore + 4;
        displayForTeamA(teamAScore);
    }

    //team B Score display

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //team B scores a single hit add 1 to the score

    public void onePointTeamB(View view) {
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }

    //team B scores a pitching win add 3 to the score

    public void threePointTeamB(View view) {
        teamBScore = teamBScore + 3;
        displayForTeamB(teamBScore);
    }

    //team B scores a home run add 4 points to the score

    public void fourPointTeamB(View view) {
        teamBScore = teamBScore + 4;
        displayForTeamB(teamBScore);
    }

    // resets the scores for both teams

    public void resetScores(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }

}
