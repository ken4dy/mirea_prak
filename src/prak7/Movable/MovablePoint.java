package prak7.Movable;


public class MovablePoint implements Movable {
    protected int x = 0;
    protected int y = 0;
    protected int xSpeed = 0;
    protected int ySpeed = 0;

    MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveDown()
    {
        this.y = y - ySpeed;
    }

    @Override
    public void moveLeft()
    {
        this.x = x - xSpeed;
    }

    @Override
    public void moveRight()
    {
        this.x = x + xSpeed;
    }

    @Override
    public void moveUp()
    {
        this.y = y + ySpeed;
    }

    public int SpeedTest()
    {
        return xSpeed + ySpeed;
    }

    @Override
    public String toString()
    {
        return String.format("[ %s ; %s ] Смещение по x: %s; Смещение по y: %s;",x,y,xSpeed,ySpeed);
    }
}
