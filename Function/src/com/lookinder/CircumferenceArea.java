package com.lookinder;

public class CircumferenceArea {
    public static void main(String[] args){
        int area = Area(4);
        System.out.println(area);
        int circumference = Circumference(9);
        System.out.println(circumference);

    }
    public static int Area(int radius){
        return (22/7)*radius *radius;
    }
    public static int Circumference(int radius) {
        return 2*(22 / 7)*radius;
    }
}
