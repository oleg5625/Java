package com.javarush.test.level22.lesson13.task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/* StringTokenizer
Используя StringTokenizer разделить query на части по разделителю delimiter.
Пример,
getTokens("level22.lesson13.task01", ".") == {"level22", "lesson13", "task01"}
*/
public class Solution {
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
       String[] s = new String[tokenizer.countTokens()];
        int counter = 0;
        while (tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();

            s[counter] = token;
            counter++;

        }


        return s;
    }

    public static void main(String[] args)
    {

       getTokens("level22.lesson13.task01", ".");
    }
}
