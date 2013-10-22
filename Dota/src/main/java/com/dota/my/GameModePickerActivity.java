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

        addListenerOnButtonSkillQuiz();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    private void addListenerOnButtonSkillQuiz() {
        final Button button = (Button)findViewById(R.id.skillQuiz);
        button.setOnClickListener(new ButtonOnClickListener(this));
    }
}
