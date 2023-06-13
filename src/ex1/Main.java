package ex1;

public class Main {
    public static void main(String[] args) {
       MyClass ten = new MyClass("Hieu");
        System.out.println(ten.getName());
        ten.setName("Phat");
        System.out.println(ten.getName());

    }
}
