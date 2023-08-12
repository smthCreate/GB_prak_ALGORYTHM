package Sem4.sample;

import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("Nurofen","Temperature");
        System.out.println(hashMap.get("Nurofen"));
        hashMap.put("Nurofen","Temperature1");
        System.out.println(hashMap.get("Nurofen"));
    }
}
