package collectionEx.hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {

    public static void main(String[] args) {

        HashMap<String, String> dictionary = new HashMap<>();

        dictionary.put("baby", "아기");
        dictionary.put("love", "사랑");
        dictionary.put("apple", "사과");


        for (String key : dictionary.keySet()) {
            String value = dictionary.get(key);
            System.out.println(key + ", " + value);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("찾고 싶은 단어는?");
        String eng = scanner.next();

        String kor = dictionary.get(eng);
        if (kor == null) System.out.println(eng + "는 없는 단어입니다.");
        else System.out.println(kor);
    }
}
