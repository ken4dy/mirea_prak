package prak23.Array;

public class ArrayQueueModuleTest {
    public static void main(String[] args) {


        for (int i=1;i<11; i++)
            ArrayQueueModule.enqueue(i);

        for (int i=1;i<11; i++)
            System.out.println(ArrayQueueModule.dequeue());
    }
}