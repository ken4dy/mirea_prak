package prak24.Chair;;
import prak24.Chair.SuperChair;
import prak24.Chair.MagicalChair;
import prak24.Chair.VictorianChair;
import prak24.Chair.MultifunctionalChair;
public class ChairFactory {

    public static SuperChair getChair(String type, String material, String legs, String back)
    {
        if("Викторианский".equalsIgnoreCase(type))
            return new VictorianChair(material, legs, back);
        else if ("Универсальный".equalsIgnoreCase(type))
            return new VictorianChair(material, legs, back);
        else if ("Магический".equalsIgnoreCase(type))
            return new VictorianChair(material, legs, back);
        else
            return null;

    }
}
