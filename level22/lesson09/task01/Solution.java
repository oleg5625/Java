package com.javarush.test.level22.lesson09.task01;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/* Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Порядок слов first/second не влияет на тестирование.
Использовать StringBuilder.
Пример, "мор"-"ром", "трос"-"сорт"
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();//"C:\\Users\\Дом\\Desktop\\list1.txt";

        LinkedList<String> list = new LinkedList<String>();
        FileReader fileReader = new FileReader(fileName);
        reader = new BufferedReader(fileReader);

           while (reader.ready()) {
                for(String s: reader.readLine().split(" ")){
                    list.add(s);
                }
            }
        for (int i = 0; i < list.size(); i++)
        {
            String word = list.get(i);
            StringBuilder ss = new StringBuilder(word);
            String res = ss.reverse().toString();

            for (int j = 0; j < list.size();j++)
            {
                if (res.equals(list.get(j)) && i != j)
                {
                    Pair pair = new Pair();
                    pair.first = word;
                    pair.second = res;
                    result.add(pair);
                    list.remove(res);

                }
            }
        }
        System.out.println(result.toString());
        }



    public static class Pair {
        String first;
        String second;

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
