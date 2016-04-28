package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //add your code here - напиши код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String i = reader.readLine();


        switch (i){
            case "January":
                System.out.println("January is 1 month"); break;
            case "February":
                System.out.println("February is 2 month"); break;
            case "March":
                System.out.println("March is 3 month"); break;
            case "April":
                System.out.println("April is 4 month"); break;
            case "May":
                System.out.println("May is 5 month"); break;
            case "June":
                System.out.println("June is 6 month"); break;
            case "July":
                System.out.println("July is 7 month"); break;
            case "Augost":
                System.out.println("August is 8 month"); break;
            case "September":
                System.out.println("September is 9 month"); break;
            case "October":
                System.out.println("October is 10 month"); break;
            case "November":
                System.out.println("November is 11 month"); break;
            case "December":
                System.out.println("December is 12 month"); break;
        }
    }

}
