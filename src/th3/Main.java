package th3;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Giang","Nguyen",25,true);
        Person p2 = new Person("Duy","Vo",23,true);
//        System.out.println(p1.firstName);
        System.out.println(p1.getFirstName());
        p1.setFirstName("Hung");
        System.out.println(p1.getFirstName());
        System.out.println("Name2 : "+ p2.getFirstName() + p2.getLastName());
    }
}
