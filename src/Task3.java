public class Task3
{

    private String message = "Це поле зовнішнього класу";
    private int number = 17;
    private static String staticMessage = "Це статичне поле зовнішнього класу";

    void outerMethod()
    {
        System.out.println("Викликано метод зовнішнього класу");
    }

    static void staticOuterMethod()
    {
        System.out.println("Викликано статичний метод зовнішнього класу");
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
            System.out.println("Це статичний вкладений клас");
            System.out.println(staticMessage);
            staticOuterMethod();
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
