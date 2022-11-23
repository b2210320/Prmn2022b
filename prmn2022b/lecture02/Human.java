package lecture02;

public class Human {
    //フィールド値
    String name;
    int age;
    //実行結果を表示する
    void print() {
        if (age <= 18) {
            System.out.println("生徒:"+name+" "+age+"歳です。");
        } else if (age <= 22) {
            System.out.println("学生:"+name+" "+age+"歳です。");
        }
    }
}
