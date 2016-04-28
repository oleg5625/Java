package com.javarush.test.level22.lesson05.task02;

/* Между табуляциями
Метод getPartOfString должен возвращать подстроку между первой и второй табуляцией.
На некорректные данные бросить исключение TooShortStringException.
Класс TooShortStringException не менять.
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException
    {
        if (string == null) {
            throw new TooShortStringException();
        }

        if (string.isEmpty()) {
            throw new TooShortStringException();
        }


        char[] chars = string.toCharArray();
        int count = 0;
        for (char ch : chars) {
            if (ch == '\t') count++;
        }

        if (count < 2) {
            throw new TooShortStringException();
        } else {
        int i = string.indexOf("\t");
        int j = string.indexOf("\t", i + 1);
            String s =  string.substring(i, j);
        return s.trim();
    }
    }

    public static class TooShortStringException extends Exception {
    }
    public static void main(String[] args)throws TooShortStringException{
        System.out.println(getPartOfString("\t dfhfg\t"));
    }
}

