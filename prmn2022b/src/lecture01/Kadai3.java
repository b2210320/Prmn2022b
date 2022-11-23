package lecture01;

import java.util.Scanner;

public class Kadai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.print("age = ");
        age = input.nextInt();
        if(age < 20){
            System.out.println("I am XX years old so I cannot drink liquor.");
        }else
        System.out.println("I am XX years old so I can drink liquor.");

    }
}
