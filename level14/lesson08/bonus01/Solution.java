package com.javarush.test.level14.lesson08.bonus01;

import java.io.*;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        //Add your code here
        try {
            //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            //String s = reader.readLine();
            String s = "sdgs";
            FileReader file = new FileReader(new File(s));
            int i = file.read();
        } catch (Exception e){
            exceptions.add(new FileNotFoundException());
        }

        try
        {
            int[] j = new int[0];
            for (int i = 0; i < 10; i++)
            {
                System.out.println(j[11]);
            }
        } catch (Exception e){
            exceptions.add(e);
        }

        try{
            //while (true){
                String s = new String();
            //}
        }catch (Exception e){
            exceptions.add(new InstantiationException());
        }

        try{
            String[] ss = new String[1];
            //StringBuilder s = new StringBuilder(ss);
        } catch (Exception e){
            exceptions.add(new BufferOverflowException());
        }

        try{

            System.out.println(File.createTempFile(null, null));
        } catch (Exception e){
            exceptions.add(e);
        }

        try{
            String i = String.valueOf(0);
            int j = Integer.parseInt(i);
        } catch (Exception e){
            exceptions.add(e);
        }

        try{
            int i = Integer.parseInt(null);
            int j = 5;
            System.out.println(i*j);

        } catch (Exception e){
            exceptions.add(e);
        }

        try{
            String s = null;
            StringBuilder ss = new StringBuilder(s);
            System.out.println(ss);
        } catch (Exception e){
            exceptions.add(new BufferOverflowException());
        }
        exceptions.add(new NoSuchFieldException());
        exceptions.add(new BufferUnderflowException());
        exceptions.add(new IllegalArgumentException());
        exceptions.add(new InstantiationException());
    }

}
