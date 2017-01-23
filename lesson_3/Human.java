package com.company.lesson_3;

/**
 * Created by Home on 18.01.2017.
 */
public class Human {

        // создаем строки и описиваем там человека
        String name;
        String sarname;
        String eyeColor;
        String hairColor;
        String national;
        int hands;
        int legs;
        int weigh;
        int age;
        int rost; // rost сириасли?

    // создаем гетеры и сетеры
    public String getSarname() {
        return sarname;
    }

    public void setSarname(String sarname) {
        this.sarname = sarname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) { this.eyeColor = eyeColor;}

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public int getHands() {
        return hands;
    }

    public void setHands(int hands) {
        this.hands = hands;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRost() {
        return rost;
    }

    public void setRost(int rost) {
        this.rost = rost;
    }
}
