package org.example;

public class Main {
    public static void main(String[] args) {
        Singleton mySingleton = Singleton.getInstance();
        System.out.println(mySingleton.getData());
        System.out.println(mySingleton);

        Singleton myOtherSingleton = Singleton.getInstance();
        myOtherSingleton.setData("New data");
        System.out.println(mySingleton.getData());
        System.out.println(myOtherSingleton);
    }
}