package prak4.Season;
public enum Season {
    SUMMER(30)
            {
                public void getDescription()
                {
                    System.out.println("Теплое время года");
                }

            },

    AUTUMN(10),

    WINTER(-10),

    SPRING(15);

    private int temp;

    Season(int temp)
    {
        this.temp=temp;
    }

    public void getDescription()
    {
        System.out.println("Холодное время года");
    }

    public String ToString()
    {
        return name()  + " averageTemperature = " + temp + "\u00B0C";
    }
}