package com.dota.my;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class SkillGameModelPickerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_mode_picker);

        addListenerOnButtonSkillQuizNoRepead();
        addListenerOnButtonSkillQuizNoRepeadHardcore();
        addListenerOnButtonSkillQuizDeadMatch();
        addListenerOnButtonSkillQuizDeadMatchHardcore();
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

    private void addListenerOnButtonSkillQuizNoRepead() {
        final Button button = (Button)findViewById(R.id.ModePick1);
        button.setOnClickListener(new ButtonOnClickListeneSkillNoRepead(this, 3));
    }

    private void addListenerOnButtonSkillQuizNoRepeadHardcore() {
        final Button button = (Button)findViewById(R.id.ModePick2);
        button.setOnClickListener(new ButtonOnClickListeneSkillNoRepead(this, 1));
    }

    private void addListenerOnButtonSkillQuizDeadMatch() {
        final Button button = (Button)findViewById(R.id.ModePick3);
        button.setOnClickListener(new ButtonOnClickListenerSkillDeathMatch(this, 3));
    }

    private void addListenerOnButtonSkillQuizDeadMatchHardcore() {
        final Button button = (Button)findViewById(R.id.ModePick4);
        button.setOnClickListener(new ButtonOnClickListenerSkillDeathMatch(this, 1));
    }
}
