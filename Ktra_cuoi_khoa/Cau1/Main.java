package Ktra_cuoi_khoa.Cau1;

import Bai_tap_day4a.Bai1.Circle;
import Day4b.Bt41.Cylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
        System.out.println(c1);

        Circle c2 = new Circle(6);
        System.out.println(c2.getArea());
        System.out.println(c2.getCircumference());
        System.out.println(c2);

        try{
            Circle c3 = new Circle(-1);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
