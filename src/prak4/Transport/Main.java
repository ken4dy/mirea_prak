package prak4.Transport;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double time;
        double price;
        double priceRate;

        Transport[] transports={new Car(60,10,50,2),
                new Plane(700,1578,51,1.6),
                new Train(140, 400,52,1.5),
                new Ship(30,280, 5,3)};

        Scanner input = new Scanner(System.in);
        System.out.print("Введите расстояние в км: ");
        double S=input.nextInt();

        for (Transport transport:transports)
        {
            time=S/ transport.getSpeed();
            price= transport.getPrise_1km()*S;
            priceRate=price* transport.getCargoRate();

            System.out.println("\nТип транспорта "+ transport.toString());
            System.out.println(String.format("Время перевозки %.1f минут",time*60));
            System.out.println("Цена перевозки пассажира "+ price+"руб");
            System.out.println("Цена перевозки груза "+ priceRate+"руб");
        }
    }
}