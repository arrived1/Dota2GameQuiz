package com.dota.my;

import android.app.Activity;
import android.view.View;
import android.content.Intent;

public class ButtonOnClickListenerDeathMatch implements View.OnClickListener {
    private Activity actv;
    private int chances;

    public ButtonOnClickListenerDeathMatch(Activity activity_, int chances) {
        this.actv = activity_;
        this.chances = chances;
    }

    @Override
    public void onClick(View v) {
        Intent myIntent = new Intent(actv, SkillQuizActivityDeathMatch.class);
        myIntent.putExtra("CHANCES", chances);
        actv.startActivity(myIntent);
    }
}
