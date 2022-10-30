package com.company;

public class MyObject {
    private int value1;
    private int value2;

    public MyObject (int value1, int value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public boolean equals(Object ob1){
        if(this == ob1)return true; //сравнение ссылок
        if(ob1 == null) return false;
        if(this.getClass()!=ob1.getClass()) return false; //сравнение типов
        MyObject buf = (MyObject) ob1;
        return (value1 == buf.value1 && value2 == buf.value2);
    }
}
