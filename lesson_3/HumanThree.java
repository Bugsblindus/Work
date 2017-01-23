package com.company.lesson_3;

/**
 * Created by Home on 22.01.2017.
 */
public class HumanThree {
    //я этого сам не понял, но кажеться мы опять создали строки, наверное
    private String name;
    private String sarname;
    private String eyecolor;
    private String haircolor;
    private String national;
    private int hands;
    private int legs;
    private int weigh;
    private int age;
    private int rost;

    // здесь мы наверное...опять что-то делаем
    public HumanThree(String name, String sarname, String eyecolor, String haircolor, String national, int hands, int legs, int weigh, int age, int rost) {
        this.name = name;
        this.sarname = sarname;
        this.eyecolor = eyecolor;
        this.haircolor = haircolor;
        this.national = national;
        this.hands = hands;
        this.legs = legs;
        this.weigh = weigh;
        this.age = age;
        this.rost = rost;

    }

    // присваевыаем и выводим в консоль строки
    public static void main(String[] args) {
    HumanThree humanThree = new HumanThree("Holy", "Pitrakov", "brown", "brown", "polish", 2, 2, 48, 31, 174);

        System.out.println("He's name is: "+humanThree.name+"\n"+"He's sarname is: "+humanThree.sarname+"\n"+"He's eye color is: "+humanThree.eyecolor+"\n"+"He's hair color is: "+humanThree.haircolor+"\n"+"He's national: "+humanThree.national+"\n"+"He have hands: "+humanThree.hands+"\n"+"He have legs: "+humanThree.legs+"\n"+"He's weigh is: "+humanThree.weigh+"\n"+"He's age is: "+humanThree.age+"\n"+"He's rost is: "+humanThree.rost);

    }
}