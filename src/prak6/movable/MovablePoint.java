package prak6.movable;

public class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString()
    {
        return "[" + x + ", " + y + "]";
    }
    @Override
    public void moveUp()
    {
        this.y = y + ySpeed;
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
}
