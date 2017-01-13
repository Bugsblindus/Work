package com.company.lesson.task;

import java.util.Scanner;

/**
 * Created by Home on 21.12.2016.
 */
public class TaskFive {
    public static void main(String[] args) {
        /* На биржевых торгах за 1 фунт стерлингов давали $1.487, за франк — $0.172,
 за немецкую марку — $0.584, а за японскую йену — $0.00955. Напишите программу,
  которая запрашивает денежную сумму в долларах, а затем выводит эквивалентные суммы в других валютах. */
    double funt = 1.487;
    double frank = 0.172;
    double mark = 0.584;
    double yen = 0.00955;
        Scanner scanner = new Scanner(System.in);
        double dollar = scanner.nextDouble();

        System.out.println("dollar in funt "+dollar*funt+"\n"+"dollar in frank "+dollar*frank+"\n"+"dollar in mark "+dollar*mark+"\n"+"dollar in yen "+dollar*yen);
    }
}
