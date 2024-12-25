package tutorials_point;

import java.util.HashSet;

public class hashSet_collections {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Amey");
        hs.add("Gore");
        hs.add("Mumbai");
        hs.add("Chennai");
        hs.add("Delhi");
        hs.add("Pune");
        hs.add("Pune");
        hs.add(null);

        System.out.println(hs);
        System.out.println(hs.size());


        if(!hs.contains("Agra"))
        {
            System.out.println("It does not contain Agra");
        }
        else
        {
            System.out.println("India");
        }

    }
}
