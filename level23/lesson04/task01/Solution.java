package com.javarush.test.level23.lesson04.task01;

/* Inner
Реализовать метод getTwoSolutions, который должен возвращать массив из 2-х экземпляров класса Solution.
Для каждого экземпляра класса Solution инициализировать поле innerClasses двумя значениями.
Инициализация всех данных должна происходить только в методе getTwoSolutions.
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {

        Solution[] solutions = new Solution[2];
        solutions[0].innerClasses = new InnerClass[0];
        solutions[0].innerClasses = new InnerClass[1];
        solutions[1].innerClasses = new InnerClass[2];
        solutions[1].innerClasses = new InnerClass[3];



        return solutions;
    }
}
