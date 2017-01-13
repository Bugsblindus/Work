package com.company.lesson.task;

import java.util.Scanner;

/**
 * Created by Home on 20.12.2016.
 */
public class TaskOne {
    public static void main(String[] args) {
    /*1. Считая, что кубический фут равен 7.481 галлона, написать программу, запрашивающую у пользователя число галлонов
и выводящую на экран эквивалентный объем в кубических футах. */

        Scanner sc = new Scanner(System.in);
        double gal = sc.nextDouble(); // create scanner
        double x = 7.481;
        double fut = gal * x;

        System.out.println(fut);
    }
}
