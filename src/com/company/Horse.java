package com.company;

public class Horse  implements Runnable,Limit{
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

    public Horse(int speed) {
        if (speed >= 7 ){
            System.out.println(speed +"Максимальная Скорость");
        }else if (speed <= 80){
            System.out.println(speed + "Минимальная Скорость");
        }
        this.speed = speed;
    }

    @Override
    public int getMinimum()
    {
        return 7;

    }

    @Override
    public int getMaximum() {
        return 80;
    }
}

