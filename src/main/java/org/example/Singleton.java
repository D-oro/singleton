package org.example;

public class Singleton {
    private static Singleton instance = null;
    private String data;
    private Singleton(){
        data = "I am data";
    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
