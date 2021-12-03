package collectionEx.iterator;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();

        vector.add(5);
        vector.add(4);
        vector.add(-1);
        vector.add(2, 100);

        int sum = 0;
        Iterator<Integer> iterator = vector.iterator();
        while (iterator.hasNext()) {
            sum = sum + iterator.next();
            System.out.println(iterator.next());
        }

        System.out.println(sum);
    }
}
