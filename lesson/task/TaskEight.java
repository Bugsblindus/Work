package com.company.lesson.task;

import java.util.Scanner;

/**
 * Created by Home on 21.12.2016.
 */
public class TaskEight {
    public static void main(String[] args) {
        /*Напишите программу, запрашивающую у пользователя значения двух дробей,
 а затем выводящую результат, также записанный в форме дроби. Взаимодействие
  программы с пользователем может выглядеть, например, следующим образом:
   Введите первую дробь: 1/2 Введите вторую дробь: 2/5 Сумма равна 9/10*/

        System.out.println("Простите, но мы дураки, чтобы сделать все как нормальные люди, по этому не пишите риску" + "\n" + "Введите первой чисельник");
        Scanner sc = new Scanner(System.in); //a
        int uponen = sc.nextInt();

        System.out.println("Введите первой знаменник");

        Scanner scone = new Scanner(System.in); //b
        int  downonen = sc.nextInt();

        System.out.println("Введите второй чисельник");

        Scanner sctwo = new Scanner(System.in);  //c
        int uptwon = sc.nextInt();

        System.out.println("Введите второй знаменник");

        Scanner scthree = new Scanner(System.in);  //d
        int downtown = sc.nextInt();

        int res = (uponen * downtown + downonen * uptwon);
        int restwo = (downonen * downtown);

        System.out.println("Вот ваш ответ" + res + "/" + restwo);
    }
}
