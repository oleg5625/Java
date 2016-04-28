package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by oleg on 03.09.2014.
 */
public abstract class DrinkMaker
{
     void makeDrink()
    {
        getRightCup();
        putIngredient();
        pour();
    }
    abstract void getRightCup();

    abstract void putIngredient();

    abstract void pour();

}
