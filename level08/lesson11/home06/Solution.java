package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        Human family[] = new Human[9];
        ArrayList<Human> child = new ArrayList<Human>();

        family[0] = new Human( "Маша", Human.FEMALE, 16);
        family[1] = new Human( "Вова", Human.MALE, 10);
        family[2] = new Human( "Катя", Human.FEMALE, 5);

        child.add(family[0]);
        child.add(family[1]);
        child.add(family[2]);

        family[3] = new Human( "Вика", Human.FEMALE, 36, child);
        family[4] = new Human( "Алекс", Human.MALE, 40, child);

        child.add( family[3] );
        child.add(family[4]);

        family[5] = new Human( "Сталин", Human.MALE, 92, child);
        family[6] = new Human( "Манька", Human.FEMALE, 79, child);



        family[7] = new Human( "Борис", Human.MALE, 69, child);
        family[8] = new Human( "Яань", Human.FEMALE, 58, child);

        for ( Human x : family )
        {
            System.out.println( x );
        }
    }

    public static class Human
    {
        //Написать тут ваш код
        private static final boolean MALE = true;
        private static final boolean FEMALE = false;

        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
        }

        public  Human(String name, boolean sex, int age, ArrayList<Human> children){
            this(name, sex, age);
            this.children.addAll(children);
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
