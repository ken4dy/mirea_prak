package park1;


public class Args {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7};
        int sum = 0;
        for (int i=0; i<4; i++) {
            sum += array[i];
        }
        double average = sum/array.length;
        System.out.println(average);
    }
}
