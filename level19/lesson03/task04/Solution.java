package com.javarush.test.level19.lesson03.task04;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1978

Подсказка: воспользуйтесь классом Calendar
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("c:\\tt.txt"));
        PersonScanner adapter = new PersonScannerAdapter(s);
        System.out.println(adapter.read());
        adapter.close();
    }

public static class PersonScannerAdapter implements PersonScanner {
        private Scanner scanner;
        public PersonScannerAdapter (Scanner scanner) {
            this.scanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String[] a = new String[6];
            int i = 0;
            while (this.scanner.hasNext()){
                a[i] = scanner.next();
                i++;
            }

                  //  a = scanner.next().split(" ");

            String firstName = a[1];
            String middleName = a[2];
            String lastName = a[0];

            Calendar calendar = new GregorianCalendar(Integer.parseInt(a[5]), Integer.parseInt(a[4]) - 1, Integer.parseInt(a[3]));
            Date birthDate = calendar.getTime();
            Person user = new Person(firstName, middleName, lastName, birthDate);
            return user;
        }

        @Override
        public void close() throws IOException {
            scanner.close();
        }
    }
}

