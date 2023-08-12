package Sem4;

import java.nio.file.attribute.UserDefinedFileAttributeView;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>(4);
        String v = hashMap.put("2","A");
        v= hashMap.put("3","B");
        v= hashMap.put("3","C");

        String serchrRes = hashMap.get("3");
        System.out.println(serchrRes);
        hashMap.perebor();

    }
}
