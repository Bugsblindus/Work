package com.company.lesson_2.task_2;

import java.util.Scanner;

/**
 * Created by Home on 13.01.2017.
 */
public class TaskTwo {
    public static void main(String[] args) {
      /*  Напишите программу, предлагающую пользователю осуществить перевод
        температуры из шкалы Цельсия в шкалу Фаренгейта или наоборот, а затем
        осуществите преобразование. Используйте в программе переменные веще-
                ственного типа. Взаимодействие программы с пользователем может вы-
                глядеть следующим образом:
        Нажмите 1 для перевода шкалы Цельсия в шкалу Фаренгейта,
                2 для перевода шкалы Фаренгейта в шкалу Цельсия: 2
        Введите температуру по Фаренгейту: 70
        Значение по Цельсию: 21.111111 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, select 1 for transfer Celsil in Faringate" + "\n" + "Please, select 2 fot transfer Faringate to Celsil");
        Scanner scanne = new Scanner(System.in);
        switch (scanner.nextInt()){
            case 1:
                System.out.println("Please, write Celsil to take Faringate");
                Scanner sc = new Scanner(System.in);
                float numberTwo = sc.nextFloat();
                double far = numberTwo * 1.8 + 32;
                System.out.println(numberTwo + " is " + far + " Faringate");
                break;
            case 2:
                System.out.println("Please, write Faringate to take Celsil");
                Scanner scs = new Scanner(System.in);
                float numberThree = scs.nextFloat();
                Double cel = (numberThree - 32) / 1.8;
                System.out.println(numberThree + " is " + cel + " Celsil");
                break;
            default:
                System.out.println("Plesse, writhe currect number");
                break;
        }
    }
}
