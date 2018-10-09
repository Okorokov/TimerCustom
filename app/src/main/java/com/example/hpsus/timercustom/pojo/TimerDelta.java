package com.example.hpsus.timercustom.pojo;

import java.util.GregorianCalendar;

public class TimerDelta {

    private GregorianCalendar timeUst;
    private GregorianCalendar timeNow;
    private Boolean push;
    private Boolean visible;

    public GregorianCalendar getTimeUst() {
        return timeUst;
    }

    public void setTimeUst(GregorianCalendar timeUst) {
        this.timeUst = timeUst;
    }

    public GregorianCalendar getTimeNow() {
        return timeNow;
    }

    public void setTimeNow(GregorianCalendar timeNow) {
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
