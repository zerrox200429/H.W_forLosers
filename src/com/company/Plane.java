package com.company;

public class Plane implements Runnable, Limit {
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

    public Plane(int speed) {
        if (speed >= 560) {
            System.out.println(speed + "Максимальная Скорость");
        } else if (speed <= 150) {
            System.out.println(speed + "Минимальная Скорость");
        }


        this.speed = speed;

    }

    @Override
    public int getMinimum()
    { return 150;}


    @Override
    public int getMaximum() {
        return 560;
    }
}
