package com.dota.my;

public class DataBaseRecord {
    int id;
    int score;
    int chancesLeft;
    CharSequence time;

//    public DataBaseRecord(int id, int score, int chancesLeft, CharSequence time) {
//        this.id = id;
//        this.score = score;
//        this.chancesLeft = chancesLeft;
//        this.time = time;
//    }

//    public DataBaseRecord(String id, String score, String chancesLeft, String time) {
//        this.id = Integer.valueOf(id);
//        this.score = Integer.parseInt(score);
//        this.chancesLeft = Integer.parseInt(chancesLeft);
//        this.time = time;
//    }

    public DataBaseRecord(String score, String chancesLeft, String time) {
        this.id = -1;
        this.score = Integer.parseInt(score);
        this.chancesLeft = Integer.parseInt(chancesLeft);
        this.time = time;
    }

    public String getId() {
        return Integer.toString(id);
    }

    public String getScore() {
        return Integer.toString(score);
    }

    public String getChancesLeft() {
        return Integer.toString(chancesLeft);
    }

    public String getTime() {
        return time.toString();
    }
}
