package prak6.Convertable;
public class Convert1 implements Convertable
{
    @Override
    public float convert(float c)
    {
        float f = (float) c * 9/5 + 32;
        return f;
    }
}
