package collectionEx.vector;

import java.util.Vector;

public class PointVectorEx {

    public static void main(String[] args) {

        Vector<Point> pointVector = new Vector<>();

        pointVector.add(new Point(2, 3));
        pointVector.add(new Point(-5, 20));
        pointVector.add(new Point(30, -8));

        pointVector.remove(1);

        for (Point p : pointVector) System.out.println(p);
    }
}
