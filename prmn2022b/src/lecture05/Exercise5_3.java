package lecture05;

public class Excercise5_3 {
    public static void main(String[] args) {
        Butterfly butterfly = new Butterfly();
         Insect insect1 = butterfly;    //Insect型の変数insect1はButterflyクラスをインスタンスした変数に代入できるとそのクラスのメソッドが使える
         insect1.move();
    }
}
