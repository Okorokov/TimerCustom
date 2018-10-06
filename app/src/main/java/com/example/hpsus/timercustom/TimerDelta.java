package com.example.hpsus.timercustom;


import android.text.format.Time;

public class TimerDelta {

    private Time timeUst;
    private Time timeNow;
    private Boolean push;
    private Boolean visible;

    public Time getTimeUst() {
        return timeUst;
    }

    public void setTimeUst(Time timeUst) {
        this.timeUst = timeUst;
    }

    public Time getTimeNow() {
        return timeNow;
    }

    public void setTimeNow(Time timeNow) {
        this.timeNow = timeNow;
    }

    public Boolean getPush() {
        return push;
    }

    public void setPush(Boolean push) {
        this.push = push;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }
}
