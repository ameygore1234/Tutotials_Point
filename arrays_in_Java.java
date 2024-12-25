package tutorials_point;

import java.util.Arrays;

public class arrays_in_Java {

    public static void main(String[] args) {

        int a[] = {12,4,26,1,10,12};

        int b[] = {1,4,2,77,10,12};
        Arrays.sort(a);

        System.out.println(a.length);

        System.out.println(Arrays.toString(a));

        if(a.equals(b))
        {
            System.out.println("Amey Gore");
        }
else {
            System.out.println("India");
        }
    }
}
