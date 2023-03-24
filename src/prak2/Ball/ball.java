package prak2.Ball;
public class ball {
    private double X = 0.0;
    private double Y = 0.0;

    ball(double x, double y){
        X = x;
        Y = y;
    }

    public double GetX()
    {
        return X;
    }

    public double GetY()
    {
        return Y;
    }

    public void SetX(double x)
    {
        X = x;
    }

    public void SetY(double y)
    {
        Y = y;
    }

    public void SetXY(double x, double y){
        X = x;
        Y = y;
    }

    public void Move(double x, double y)
    {
        X +=x;
        Y +=y;
    }

    public String ToString()
    {
        return "X: " + X + "Y: " + Y;
    }
}