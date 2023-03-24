package prak7.Math;


public class MathFunc implements MathCalculable {
    @Override
    public float getPI()
    {
        return 3.14f;
    }

    @Override
    public double count(double a, double b)
    {
        double number1 = power(a,2);
        double number2 = power(b,2);

        return Math.sqrt((number1 + number2));
    }

    @Override
    public double power(double n, double pow)
    {
        if(pow == 0)
            return 1;

        double result = pow;

        for(int counter = 0; counter < pow -1; counter++)
        {
            result *= pow;
        }
        return result;
    }
}