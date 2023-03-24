package prak24.Chair;
import prak24.Chair.ChairFactory;
import prak24.Chair.SuperChair;
import prak24.Chair.Chair;

public class TestFactory {
    public static void main(String[] args) {

        SuperChair MChair = ChairFactory.getChair("Универсальный", "Пластмасс", "Колесики","Прямая");
        SuperChair VChair = ChairFactory.getChair("Викторианский", "Дерево и ткань", "Изогнутые","Закругленная");
        SuperChair MagicChair = ChairFactory.getChair("Магический", "Пух кашмирской козы", "Левитируют", "По желанию");
        System.out.println(MagicChair);
        Seat(MagicChair);
    }

    public static void Seat(SuperChair ch)
    {

    }

}