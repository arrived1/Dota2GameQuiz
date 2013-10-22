package com.dota.my;

import android.app.Activity;
import android.view.View;
import android.content.Intent;

public class ButtonOnClickListener implements View.OnClickListener {
    private Activity actv;

    public ButtonOnClickListener(Activity activity_) {
        this.actv = activity_;
    }

    @Override
    public void onClick(View v) {
        Intent myIntent = new Intent(actv, SkillQuizActivity.class);
        actv.startActivity(myIntent);
    }
}
