package th1;

public class Student {
    private int rollNo;
    private String name;
    private static String college = "BBDIT";

    //constructtor to initialize the variables
    Student(int r, String n){
        rollNo=r;
        name=  n;
    }

    static void change(){
        college = "RIKKEI ACADEMY";
    }
    //method to display values
    void display(){
        System.out.println(rollNo+" "+name+" "+college);
    }
}
