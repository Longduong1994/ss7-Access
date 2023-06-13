package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StaticMethod staticMethod1 = new StaticMethod(3.5,2.5,6,3,4,5);
        StaticMethod staticMethod2 = new StaticMethod(6,4,7,4.5,7,6);

        System.out.println(staticMethod1.calCircleArea(staticMethod1.getR()));
        System.out.println(staticMethod1.calRectangleArea(staticMethod1.getWidth(), staticMethod1.getHeight()));
        System.out.println(staticMethod1.calTriangArea(staticMethod1.a, staticMethod1.b, staticMethod1.c));
        System.out.println(staticMethod2.calCircleArea(staticMethod2.getR()));
        System.out.println(staticMethod2.calRectangleArea(staticMethod2.getWidth(), staticMethod2.getHeight()));
        System.out.println(staticMethod2.calTriangArea(staticMethod2.a, staticMethod2.b, staticMethod2.c));
    }
}
