public class Task4
{

    private String message = "Поле зовнішнього класу";

    void outerMethod()
    {
        System.out.println("Метод зовнішнього класу");
    }

    void demonstrate()
    {
        int constantNumber = 10;
        int changeableNumber = 20;

        // Локальний клас, оголошений усередині методу
        class LocalClass
        {
            void show()
            {
                System.out.println(message);
                outerMethod();

                System.out.println(
                        "Локальна змінна: " + constantNumber);
                System.out.println(
                        "Змінна, що не змінювалася: "
                                + changeableNumber);
            }
        }

        LocalClass local = new LocalClass();
        local.show();
    }

    public static void main(String[] args)
    {
        Task4 example = new Task4();
        example.demonstrate();
    }
}

