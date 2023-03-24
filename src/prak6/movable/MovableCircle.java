package prak6.movable;


public class MovableCircle implements Movable{
    private int radius = 0;
    private MovablePoint center = new MovablePoint(0,0,0,0);

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        center = new MovablePoint(x,y,xSpeed,ySpeed);
    }

    @Override
    public String toString()
    {
        return "string";
    }

    @Override
    public void moveUp()
    {}
    @Override
    public void moveDown()
    {}
    @Override
    public void moveLeft()
    {}
    @Override
    public void moveRight()
    {}
}
