package genericEx;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class GStack<T> implements Iterable{

    int tos;
    Object[] stck;
    final int MAX_SIZE = 10;

    public GStack() {
        tos = 0;
        stck = new Object[10];
    }

    public void push(T item) {
        if (tos == MAX_SIZE) return;
        stck[tos] = item;
        tos++;
    }

    public T pop() {
        if(tos ==0) return null;
        tos--;
        return (T)stck[tos];
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }
}
