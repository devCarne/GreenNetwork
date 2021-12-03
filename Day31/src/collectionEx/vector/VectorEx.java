package collectionEx.vector;

import java.util.Vector;

public class VectorEx {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();

        vector.add(3);
        vector.add(5);
        vector.add(-1);
        vector.add(7);
        vector.add(2, 100);

        System.out.println(vector);
        System.out.println("vector.size()" + vector.size());
        System.out.println("vector.capacity()" + vector.capacity());

        int sum = 0;
        for(Integer i : vector) sum = sum + i;

        System.out.println(sum);
    }
}
