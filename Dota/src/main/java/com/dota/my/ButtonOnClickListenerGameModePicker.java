package com.dota.my;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class ButtonOnClickListenerGameModePicker implements View.OnClickListener {
    private Activity actv;

    public ButtonOnClickListenerGameModePicker(Activity activity_) {
        this.actv = activity_;
    }

    @Override
    public void onClick(View v) {
        Intent myIntent = new Intent(actv, GameModePickerActivity.class);
        actv.startActivity(myIntent);
    }
}
