package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cards {
    private String nameCard;
    private int strong;
    private int healths;
    private int intelect;
    private int speed;

    public Cards(String nameCard, int strong, int healths, int intelect, int speed) {
        this.nameCard = nameCard;
        this.strong = strong;
        this.healths = healths;
        this.intelect = intelect;
        this.speed = speed;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

    public int getStrong() {
        return strong;
    }

    public void setStrong(int strong) {
        this.strong = strong;
    }

    public int getHealths() {
        return healths;
    }

    public void setHealths(int healths) {
        this.healths = healths;
    }

    public int getIntelect() {
        return intelect;
    }

    public void setIntelect(int intelect) {
        this.intelect = intelect;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


}
