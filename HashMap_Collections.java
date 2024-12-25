package tutorials_point;

import java.util.HashMap;

public class HashMap_Collections {

    public static void main(String[] args) {

        HashMap<String,String> hm =  new HashMap<String ,String>();

        hm.put("firstName" , "Amey");
        hm.put("lastName" , "Gore");
        hm.put("City" , "Pune");
        hm.put("Age" , "23");
        hm.put("firstName" , "Akshay");
        hm.put(null,null);
        hm.put(null,null);

        System.out.println(hm);
        System.out.println(hm.get("Age"));
        System.out.println(hm.size());
        System.out.println(hm.containsValue("Gore"));
        System.out.println(hm.containsKey("City"));
    }


 }
