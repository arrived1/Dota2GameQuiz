package com.dota.my;

import android.app.Activity;
import android.media.MediaPlayer;

public class GameSounds {
    private Activity actv;

    private void playSound(int id) {
        MediaPlayer mp = MediaPlayer.create(actv, id);
        mp.start();
    }

    public GameSounds(Activity actv_) {
        this.actv = actv_;
    }

    public void welcome() {
        playSound(R.raw.welcome);
    }

    public void playMusic() {
        playSound(R.raw.gamestartup2);
    }

    public void correct() {
        playSound(R.raw.correct);
    }

    public void incorrect() {
        playSound(R.raw.incorrect);
    }

    public void gameOver() {
        playSound(R.raw.game_over);
    }

    public void correctNumber(int num) {
        switch (num) {
            case 1:
                playSound(R.raw.announcer_1stblood_01);
                break;
            case 2:
                playSound(R.raw.announcer_kill_double_01);
                break;
            case 3:
                playSound(R.raw.announcer_kill_triple_01);
                break;
            case 5:
                playSound(R.raw.announcer_kill_ultra_01);
                break;
            case 10:
                playSound(R.raw.announcer_kill_rampage_01);
                break;
            case 15:
                playSound(R.raw.announcer_kill_spree_01);
                break;
            case 20:
                playSound(R.raw.announcer_kill_dominate_01);
                break;
            case 30:
                playSound(R.raw.announcer_kill_mega_01);
                break;
            case 50:
                playSound(R.raw.announcer_kill_unstop_01);
                break;
            case 80:
                playSound(R.raw.announcer_kill_wicked_01);
                break;
            case 120:
                playSound(R.raw.announcer_kill_monster_01);
                break;
            case 170:
                playSound(R.raw.announcer_kill_godlike_01);
                break;
            case 230:
                playSound(R.raw.announcer_kill_holy_01);
                break;
            case 300:
                playSound(R.raw.announcer_ownage_01);
                break;
            default:
                break;
        }
    }
}
