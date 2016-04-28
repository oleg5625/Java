package com.javarush.test.level21.lesson16.big01;

/**
 * Created by Oleg on 18.05.14.
 */
public class Horse
{
   private String name;
   private double distance;
   private double speed;

    public Horse(String name, double speed, double distance)
    {
        this.name = name;
        this.speed = speed;
        this.distance = distance;

    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getDistance()
    {
        return distance;
    }

    public void setDistance(double distance)
    {
        this.distance = distance;
    }

    public double getSpeed()
    {
        return speed;
    }

    public void setSpeed(double speed)
    {
        this.speed = speed;
    }


    public void move() {
        setDistance(getDistance() + getSpeed() * Math.random());
    }

    public void print() {
        int n = (int) Math.round(getDistance());
        for (int i = 1; i <= n; i++) {
            System.out.print(".");
        }
        System.out.println(getName());
    }
}
