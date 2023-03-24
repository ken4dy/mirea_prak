package prak3.Report;
public class Main {
    private static Employee[] employees;

    public static void main(String[] args)
    {

        employees = new Employee[]
                {
                        new Employee("Боб", 500),
                        new Employee("Бобыч", 3200),
                        new Employee("Артём", 800),
                        new Employee("Шишкин", 3954),
                        new Employee("Гена", 20000)
                };

        System.out.println(Report.GenerateReport(employees));
    }
}
