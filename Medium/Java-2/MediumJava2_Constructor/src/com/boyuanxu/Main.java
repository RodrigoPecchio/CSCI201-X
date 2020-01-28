package com.boyuanxu;

public class Main {

    public static void main(String[] args) {
        Human h1 = new Human("AB");
        System.out.println(h1.getBloodType());
    }
}

class Human {
    private String bloodType;

    public Human(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getBloodType() {
        return bloodType;
    }
}