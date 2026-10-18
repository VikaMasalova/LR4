public class Task3
{

    private String message = "Це поле зовнішнього класу";
    private int number = 17;

    void outerMethod()
    {
        System.out.println("Викликано метод зовнішнього класу");
    }

    // Звичайний вкладений клас
    class Inner
    {
        void show()
        {
            System.out.println(message);
            System.out.println("Число: " + number);

            // Доступ до методу зовнішнього класу
            outerMethod();
        }
    }

    // Статичний вкладений клас
    static class StaticNested
    {
        void show()
        {
            System.out.println(
                    "Це статичний вкладений клас");
            System.out.println(
                    "Він може звертатися до статичних членів "
                            + "зовнішнього класу без його об'єкта.");
        }
    }

    public static void main(String[] args)
    {
        Task3 outer = new Task3();

        System.out.println("Звичайний вкладений клас:");
        Task3.Inner inner = outer.new Inner();
        inner.show();

        System.out.println("\nСтатичний вкладений клас:");
        Task3.StaticNested nested = new Task3.StaticNested();
        nested.show();
    }
}

