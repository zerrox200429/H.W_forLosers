package com.company;

public class Human implements Runnable, Limit {
    int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void run() {

    }

    public int getSpeed() {
        return speed;
    }

    public Human(int speed) {
        if (speed >= 3) {
            System.out.println(speed + "Максимальная Скорость");
        } else if (speed <= 35) {
            System.out.println(speed + "Минимальная Скорость");
        }
        this.speed = speed;
    }

    @Override
    public int getMinimum() {
        return 3;
    }

    @Override
    public int getMaximum() {
        return 35;
    }
}

