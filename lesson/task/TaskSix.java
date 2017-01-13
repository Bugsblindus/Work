package com.company.lesson.task;

import java.util.Scanner;

/**
 * Created by Home on 21.12.2016.
 */
public class TaskSix {
    public static void main(String[] args) {
        /*Температуру, измеренную в градусах по Цельсию, можно перевести в градусы
 по Фаренгейту путем умножения на 9/5 и сложения с числом 32. Напишите программу,
  запрашивающую температуру в градусах по Цельсию и отображающую ее эквивалент по Фаренгейту.*/

                System.out.println("Please, write Celsil to take Faringate");
                Scanner sc = new Scanner(System.in);
                float numberTwo = sc.nextFloat();
                double far = numberTwo * 1.8 + 32;
                System.out.println(numberTwo + " is " + far + " Faringate");

        }
    }
