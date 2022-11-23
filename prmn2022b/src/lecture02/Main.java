package lecture02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        Human student = new Human();
        System.out.print("age:");
        student.age = input.nextInt();
        System.out.print("name:");
        student.name = input.next();
        student.print();
    }
}
