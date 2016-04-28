package com.javarush.test.level22.lesson09.task02;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* Формируем Where
Сформируйте часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.
Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
*/
public class Solution {

    public static StringBuilder getCondition(Map<String, String> params) {
        StringBuilder out = new StringBuilder();
        if (!params.isEmpty()) {
            for (Map.Entry<String, String> pair : params.entrySet())
                    if (pair.getValue() != null) {
                       out.append(pair.getKey() + " = '" + pair.getValue() + "' and ");
                     }
           out = out.delete(out.lastIndexOf(" and "), out.length());
        }
        return out;
    }
    public static void main (String[] args) throws Exception{
        Map<String, String> map = new LinkedHashMap<>();


        System.out.println(getCondition(map).toString());
    }
}
