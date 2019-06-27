package com.example.repeatbasics;

public class FragmentController {
    public int firstfragcounter;
    public int secondfragcounter;

    public FragmentController() {
    }

    public FragmentController(int firstfragcounter, int secondfragcounter) {
        this.firstfragcounter = firstfragcounter;
        this.secondfragcounter = secondfragcounter;
    }

    public int getFirstfragcounter() {
        return firstfragcounter;
    }

    @Override
    public String toString() {
        return "FragmentController{" +
                "firstfragcounter=" + firstfragcounter +
                ", secondfragcounter=" + secondfragcounter +
                '}';
    }

    public int getSecondfragcounter() {
        return secondfragcounter;
    }

    public void setFirstfragcounter(int firstfragcounter) {
        this.firstfragcounter = firstfragcounter;
    }

    public void setSecondfragcounter(int secondfragcounter) {
        this.secondfragcounter = secondfragcounter;
    }

}
