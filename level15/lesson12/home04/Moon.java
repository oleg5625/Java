package com.javarush.test.level15.lesson12.home04;

/**
 * Created by oleg on 30.08.2014.
 */
public class Moon implements Planet
{
    private static Moon instance;
    private Moon(){

    }
    public static Moon getInstance(){
        if (instance == null){
            synchronized (Moon.class){
                if (instance == null){
                    instance = new Moon();
                }
            }
        }
        return instance;
    }
}
