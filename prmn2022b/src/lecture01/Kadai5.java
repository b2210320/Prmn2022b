package lecture01;

public class Kadai5 {
    public static void main(String[] args) {
        int[] score = {41, 85, 72, 38, 80};
        int sum = 0;
        int min = score[0];
        int max = score[0];
        for (int i = 0; i < 5; i++) {
            sum = sum + score[i];
            min = min(score[i],min);
            max = max(score[i],max);
            judgement(i,score[i]);
        }
        double ave = average(sum);
        System.out.println("最高点:"+max+"点");
        System.out.println("最低点:"+min+"点");
        System.out.println("平均点 "+ave+"点");
    }
    static void judgement(int i,int data){        //成績を判定する関数
        if(data < 60){
            System.out.println(i+"番 "+data+"点 "+"不可");
        } else if (data < 70) {
            System.out.println(i+"番 "+data+"点 "+"可");
        } else if (data < 80) {
            System.out.println(i+"番 "+data+"点 "+"良");
        } else if (data < 90) {
            System.out.println(i+"番 "+data+"点 "+"優");
        }else {
            System.out.println(i+"番 "+data+"点 "+"秀");
        }

    }
    static int min(int data,int base) {     //最小値を判定する関数
        int min = base;
        if (data < min) {
            min = data;
        }
        return min;
    }
    static int max(int data,int base){      //最大値を判定する関数
        int max = base;
        if(data > max){
            max = data;
        }
        return max;
    }
    static double average(int sum){        //平均点を判定する関数
        double ave = (double)sum / 5;
        return ave;
    }
}
