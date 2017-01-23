package com.company.lesson_3;

/**
 * Created by Home on 19.01.2017.
 */
public class HumanTwo {
    public static void main(String[] args) {

        Human humantwo = new Human(); // создаем екземпляр human


        // призначем и выводим
        humantwo.setName("Holy"); //призначаем каждой строке её значение
        System.out.println("He's name is: "+humantwo.getName()); // выводим в консоль

        humantwo.setSarname("Pitrakov");
        System.out.println("He's sarname is: "+humantwo.getSarname());

        humantwo.setEyeColor("brown");
        System.out.println("He's eye color is: "+humantwo.getEyeColor());

        humantwo.setHairColor("brown");
        System.out.println("He's hair color is: "+humantwo.getHairColor());

        humantwo.setNational("polish");
        System.out.println("He's national is: "+humantwo.getNational());

        humantwo.setHands(2);
        System.out.println("He have hads: "+humantwo.getHands());

        humantwo.setLegs(2);
        System.out.println("He have legs: "+humantwo.getLegs());

        humantwo.setWeigh(45);
        System.out.println("He's weigh is: "+humantwo.getWeigh());

        humantwo.setAge(31);
        System.out.println("He's age is: "+humantwo.getAge());

        humantwo.setRost(174);
        System.out.println("He's rost is: "+humantwo.getRost());
    }
}
