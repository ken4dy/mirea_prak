package prak23.Array;

public interface Queue {

    void enqueue (Object element);
    Object element();
    Object dequeue();
    int size();
    boolean isEmpty();
    void clear();

}