package tutorials_point;

import java.util.ArrayList;

public class Collection_in_Java_ArrayList {

    public static void main(String[] args) {

        //ArrayList

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(3);
        al.add(0);
        al.add(1);
        al.add(5);
        al.add(20145);

        System.out.println(al);

        System.out.println(al.get(2));

        System.out.println(al.getLast());

        if(al.contains(5))
        {
            System.out.println("Amey Gore");
        }

        else {
            System.out.println("Delhi");
        }

        System.out.println(al.indexOf(5));

        System.out.println(al.size());

        al.remove(1);
        System.out.println(al);
    }
}
