package ex2;

public class StaticMethod {
    protected
    public static double PI = 3.14;
    double R;
    double width,height;
    double a,b,c;

    public double calCircleArea(double R){
       return  PI*R*R;
    }
    public double calRectangleArea(double width,double height){
        return width*height;
    }
    public double calTriangArea(double a,double b,double c){
       double p =(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public String toString() {
        return "StaticMethod{" +
                "R=" + R +
                ", width=" + width +
                ", height=" + height +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public StaticMethod(double r, double width, double height, double a, double b, double c) {
        R = r;
        this.width = width;
        this.height = height;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
