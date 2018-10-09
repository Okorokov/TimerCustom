package com.example.hpsus.timercustom.pojo;

import java.util.List;

public class Timer {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<TimerDelta> getTimerDeltas() {
        return timerDeltas;
    }

    public void setTimerDeltas(List<TimerDelta> timerDeltas) {
        this.timerDeltas = timerDeltas;
    }

    public int getReplay() {
        return replay;
    }

    public void setReplay(int replay) {
        this.replay = replay;
    }

    public Boolean getPlay() {
        return play;
    }

    public void setPlay(Boolean play) {
        this.play = play;
    }

    public Boolean getPause() {
        return pause;
    }

    public void setPause(Boolean pause) {
        this.pause = pause;
    }

    public Boolean getStop() {
        return stop;
    }

    public void setStop(Boolean stop) {
        this.stop = stop;
    }

    private int id;
    private List<TimerDelta> timerDeltas=null;
    private int replay;
    private Boolean play;
    private Boolean pause;
    private Boolean stop;
}
