package lecture03;

import java.util.Scanner;

public class Kadai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1つ目の整数を入力してください:");
        int a = input.nextInt();
        System.out.println("2つ目の整数を入力してください:");
        int b = input.nextInt();
        Integer ans = new Integer();
        System.out.println( a + "+" +b + "=" + ans.parseInt(a,b));
    }
}
