package com.company.lesson_2.task_2;

import java.util.Scanner;

/**
 * Created by Home on 13.01.2017.
 */
public class TaskSix {
    public static void main(String[] args) {
        /* Напишите программу, рассчитывающую сумму денег, которые вы получи-
       те при вложении начальной суммы с фиксированной процентной ставкой
       дохода через определенное количество лет. Пользователь должен вводить
       с клавиатуры начальный вклад, число лет и процентную ставку. Приме-
       ром результата работы программы может быть следующий:
       Введите начальный вклад: 3000
       Введите число лет: 10
       Введите процентную ставку: 5.5
       Через 10 лет вы получите 5124.43 доллара.
       В конце первого года вы получите 3 000 + (3 000*0.055) = 3165 долларов.
       В конце следующего года вы получите 3 165 + (3 165*0.055) = 3339.08 дол-
       ларов. Подобные вычисления удобно производить с помощью цикла for.*/

        System.out.println("Введите сумму вклада: ");
        Scanner scone = new Scanner(System.in);
        int vklad = scone.nextInt();

        System.out.println("Введите количество лет: ");
        Scanner sctwo = new Scanner(System.in);
        int let = sctwo.nextInt();

        System.out.println("Введите процентную ставку: ");
        Scanner scthre = new Scanner(System.in);
        double procent = scthre.nextDouble();

        System.out.println("Через " + let + " лет(года) вы получите " + (((vklad*procent)/100)*let+vklad) + " доллара");
        System.out.println("В конце первого года вы получите " + (((vklad*procent)/100)+vklad) + " доллара");
    }
}
