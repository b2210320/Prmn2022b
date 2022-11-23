package lecture01;

public class Kadai4 {
    public static void main(String[] args) {
        int sum = 0;
        int [] array = new int [100];
        for(int i = 0;i<100;i++){        //同じ処理の繰り返しかつ回数が変数として値の要素として代入されているためforを使用する。
            array[i] = i+1;
        }
        for(int j = 0;j<100;j++){
            sum = sum + array[j];
        }
        System.out.println(sum);
    }
}
