package com.company.lesson.task;

/**
 * Created by Home on 21.12.2016.
 */
public class TaskSeven {
    public static void main(String[] args) {
        /*Две дроби, а/b и c/d можно сложить следующим образом: a/b + c/d = (a*d + b*c)/(b*d),
 например, 1/4 + 2/3 = (1*3 + 4*2)/4*3 = 11/12*/

        int a = 1;
        int b = 4;
        int c = 2;
        int d = 3;
        int res = (a * d + b * c);
        int restwo = (b * d);

        System.out.println(res + "/" + restwo);
    }
}
