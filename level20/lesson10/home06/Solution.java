package com.javarush.test.level20.lesson10.home06;

import java.io.*;

/* Запрет сериализации
Запретите сериализацию класса SubSolution используя NotSerializableException.
Сигнатуры классов менять нельзя
*/
public class Solution implements Serializable {
    private static final long serialVersionUID = 123456789;
    public static class SubSolution extends Solution {
        private static final long serialVersionUID = 123456789;
        public SubSolution() throws NotSerializableException
        {
            throw new NotSerializableException();
        }
    }
}
