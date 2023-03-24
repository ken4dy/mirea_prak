package prak13.Shirt;

public class Shirt {
    private String number;
    private String name;
    private String color;
    private String size;

    public Shirt(){}
    public Shirt(String number, String name, String color, String size)
    {
        this.number = number;
        this.name = name;
        this.color = color;
        this.size = size;
    }


    public String getNumber(String number)
    {
        String[] data = number.split(",");
        return data[0];
    }

    public String getName(String name)
    {
        String[] data = name.split(",");
        return data[1];
    }

    public String getColor(String color)
    {
        String[] data = color.split(",");
        return data[2];
    }

    public String getSize(String size)
    {
        String[] data = size.split(",");
        return data[3];
    }

    public String toString(String number, String name, String color, String size)
    {
        return "Номер - " + number + "\n"
                + "Название - " + name + "\n"
                + "Цвет - " + color + "\n"
                + "Размер - " + size;
    }
}