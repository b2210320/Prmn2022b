package lecture03;

import java.util.ArrayList;

public class Exercise3_4 {
    public static void main(String[] args) {
        ArrayList<Vegetable> out = new ArrayList<Vegetable>();
        out.add(new Vegetable("にんじん",117));
        out.add(new Vegetable("たまねぎ",120));
        out.add(new Vegetable("じゃがいも",154));
        for(Vegetable data : out){
            data.print();
        }

    }
}
