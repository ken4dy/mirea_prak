package prak6.movable;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // MovablePoint point = new MovablePoint(0, 0, 0, 0);
        System.out.println("Введите начальные координаты точки: ");
        int x0 = input.nextInt();
        int y0 = input.nextInt();
        System.out.println("Введите движение точки: ");
        int speedX = input.nextInt();
        int speedY = input.nextInt();
        MovablePoint point = new MovablePoint(x0, y0, speedX, speedY);
        point.moveUp();
        point.moveLeft();
        System.out.println("Текущая точка - " + point);
    }
}