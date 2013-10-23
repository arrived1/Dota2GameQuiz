package com.dota.my;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;

public class GameModePickerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_mode_picker);

        addListenerOnButtonSkillQuizDeadMatch();
        addListenerOnButtonSkillQuizDeadMatchHardcore();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    private void addListenerOnButtonSkillQuizDeadMatch() {
        final Button button = (Button)findViewById(R.id.ModePick1);
        button.setOnClickListener(new ButtonOnClickListenerDeadMatch(this, 3));
    }

    private void addListenerOnButtonSkillQuizDeadMatchHardcore() {
        final Button button = (Button)findViewById(R.id.ModePick2);
        button.setOnClickListener(new ButtonOnClickListenerDeadMatch(this, 1));
    }
}
