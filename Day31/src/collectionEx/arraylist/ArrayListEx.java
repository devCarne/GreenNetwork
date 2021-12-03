package collectionEx.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("이름을 입력하세요 : ");
            arrayList.add(scanner.next());
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(arrayList.get(i));
        }

        int longestIndex = 0;
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(longestIndex).length() < arrayList.get(i).length()) {
                longestIndex = i;
            }
        }
    }
}
