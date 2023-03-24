package prak6.Computer;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Memory memory = new Memory();
        Monitor monitor = new Monitor();
        Processor processor = new Processor();
        Shop shop = new Shop();
        Scanner input = new Scanner(System.in);

        memory.setName(shop.GetComputerMemory());
        processor.setName(shop.GetComputerProcessor());
        monitor.setName(shop.GetComputerMonitor());

        while (true)
        {

            System.out.println("Введите что нужно сделать с компьютером: 1 - добавить, 2 - удалить, 3 - найти: ");

            if (!input.hasNextInt())
            {
                input.nextLine();
                continue;
            }

            int a = input.nextInt();

            input.nextLine();

            System.out.println("Введите название компьютера: ");
            String comp = input.nextLine();


            switch (a)
            {
                case 1:
                {
                    shop.addComp(comp);
                    System.out.println("Составляющие данного компьютера: ");
                    //memory.setName("RAM");
                    System.out.println("Память: " + memory.getName());
                    //processor.setName("intel core");
                    System.out.println("Процессор: " + processor.getName());
                    //monitor.setName("LG");
                    System.out.println("Монитор: " + monitor.getName() + "\n");
                    break;
                }
                case 2:
                {
                    shop.deleteComp(comp);
                    break;
                }
                case 3:
                {
                    System.out.println("Найденный компьютер: " + shop.findComp(comp));
                }
            }
        }
    }
}
