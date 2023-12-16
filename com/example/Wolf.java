package com.example;
public class Wolf{
    private int hf = 20;
    private int h = hf;
    private int d = 4;

    public int attack(int r){
        int damage = (h/hf)*(d/r*r);
        return damage;
    }

    Wolf(){}

    Wolf(int h){
        if(this.hf >= h) {
            this.h = h;
        }
    }
}
