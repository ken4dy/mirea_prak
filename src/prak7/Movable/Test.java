package prak7.Movable;

import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите x, y, скорость изменения по x и скорость изменения по y: ");
        System.out.println("Для первой точки: ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int xSpeed1 = input.nextInt();;
        int ySpeed1 = input.nextInt();
        System.out.println("Для второй точки: ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int xSpeed2 = input.nextInt();;
        int ySpeed2 = input.nextInt();
        MovableRectangle movableRectangle = new MovableRectangle
                (
                        new MovablePoint(x1,y1,xSpeed1,ySpeed1),
                        new MovablePoint(x2,y2,xSpeed2,ySpeed2)
                );

        movableRectangle.moveLeft();
        movableRectangle.moveLeft();
        movableRectangle.moveLeft();
        movableRectangle.moveRight();

        boolean SameSpeed = movableRectangle.speedTest();

        System.out.println(String.format("Точки:\n%sОдинаковая скорость: %s",movableRectangle.toString(), SameSpeed));
    }
}
