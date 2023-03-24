package prak4.Matrix;
public class Main {
    public static void main(String[] args) {
        int[][] arr= new int [][]{
                {2,2,2,},
                {2,2,2,},
                {2,2,2,}
        };

        Matrix.sum(arr);
        Matrix.printArr();
        Matrix.mul(2);
        Matrix.printArr();
    }
}
