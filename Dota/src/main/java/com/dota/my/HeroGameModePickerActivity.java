package com.dota.my;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class HeroGameModePickerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_mode_picker);

        addListenerOnButtonHeroQuizNoRepead();
        addListenerOnButtonHeroQuizNoRepeadHardcore();
        addListenerOnButtonHeroQuizDeadMatch();
        addListenerOnButtonHeroQuizDeadMatchHardcore();
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

    private void addListenerOnButtonHeroQuizNoRepead() {
        final Button button = (Button)findViewById(R.id.ModePick1);
        button.setOnClickListener(new ButtonOnClickListeneHeroNoRepead(this, 3));
    }

    private void addListenerOnButtonHeroQuizNoRepeadHardcore() {
        final Button button = (Button)findViewById(R.id.ModePick2);
        button.setOnClickListener(new ButtonOnClickListeneHeroNoRepead(this, 1));
    }

    private void addListenerOnButtonHeroQuizDeadMatch() {
        final Button button = (Button)findViewById(R.id.ModePick3);
        button.setOnClickListener(new ButtonOnClickListenerHeroDeathMatch(this, 3));
    }

    private void addListenerOnButtonHeroQuizDeadMatchHardcore() {
        final Button button = (Button)findViewById(R.id.ModePick4);
        button.setOnClickListener(new ButtonOnClickListenerHeroDeathMatch(this, 1));
    }
}
