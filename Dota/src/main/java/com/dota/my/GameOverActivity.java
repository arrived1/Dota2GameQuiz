package com.dota.my;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class GameOverActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        GameSounds sounds = new GameSounds(this);
        sounds.gameOver();

        Bundle extras = getIntent().getExtras();
        int points = extras.getInt("SCORE");
        String timeTxt = extras.getString("TIME");

        ImageView gameOverImage = (ImageView)findViewById(R.id.logo);
        gameOverImage.setImageResource(R.drawable.dota);

        TextView score = (TextView)findViewById(R.id.scoreRes);
        score.setText(Integer.toString(points));

        TextView time = (TextView)findViewById(R.id.timeRes);
        time.setText(timeTxt);
    }
}
