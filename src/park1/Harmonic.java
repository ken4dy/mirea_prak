package park1;

public class Harmonic {
    public static void main(String[] args) {
        for (double i = 1; i <= 10; i++) {
            double a=(1/i);
            String str = String.format("%.2f", a);
            System.out.print(str + " ");
        }
    }
}

