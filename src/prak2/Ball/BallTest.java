package prak2.Ball;
public class BallTest {
    public static void main(String[] args)
    {
        ball ball = new ball(20,20);
        ball.SetXY(5,5);
        ball.GetX();
        ball.GetY();
        ball.Move(-500,5);
        System.out.print(String.format("Шар стоит в точке: %s:%s",ball.GetX(), ball.GetY()));
    }
}
