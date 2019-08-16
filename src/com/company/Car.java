package com.company;

public class Car implements Runnable,Limit {
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

    public Car(int speed) {
        if (speed >= 20 ){
            System.out.println(speed +"Максимальная Скорость");
        }else if (speed <= 350){
            System.out.println(speed + "Минимальная Скорость");
        }
        this.speed = speed;
    }

    @Override
    public int getMinimum() {
        return 20;
    }

    @Override
    public int getMaximum() {
        return 350;
    }
}
