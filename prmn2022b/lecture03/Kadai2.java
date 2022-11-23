package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Kadai2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> kadai2s = new ArrayList<String>();
        System.out.println("何行分入力しますか？");
        int num = input.nextInt();
            for (int i = 1; i < num+1; i++) {
                System.out.println(input.nextLine());   //改行コードを空読み
                System.out.println(i+"行目:");
                kadai2s.add(input.next());
            }
            int j = 0;
            for (String kadai2 : kadai2s) {
                System.out.println("入力した文字列");
                System.out.println("["+j+"]"+kadai2);
                j++;
            }
    }
}
