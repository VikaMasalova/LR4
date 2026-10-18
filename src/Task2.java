public class Task2
{

    // Власний клас для передавання як параметра
    static class Student
    {
        String name;
        int age;

        Student(String name, int age)
        {
            this.name = name;
            this.age = age;
        }
    }

    // Виведення типу та значення параметра
    static void printParameter(Object param)
    {
        if (param instanceof Student)
        {
            Student s = (Student) param;
            System.out.println("Тип: Student, ім'я: "
                    + s.name + ", вік: " + s.age);
        } else
        {
            System.out.println("Тип: "
                    + param.getClass().getSimpleName()
                    + ", значення: " + param);
        }
    }

    // Спосіб 1: п'ять явно заданих параметрів
    static void showExplicit(String text, int number,
                             double price, boolean active,
                             Student student)
    {
        System.out.println("\nСпосіб 1: явні параметри");
        printParameter(text);
        printParameter(number);
        printParameter(price);
        printParameter(active);
        printParameter(student);
    }

    // Спосіб 2: масив Object[]
    static void showArray(Object[] params)
    {
        System.out.println("\nСпосіб 2: масив Object[]");
        for (Object param : params)
        {
            printParameter(param);
        }
    }

    // Спосіб 3: varargs
    static void showVarargs(Object... params)
    {
        System.out.println("\nСпосіб 3: varargs");
        for (Object param : params)
        {
            printParameter(param);
        }
    }

    public static void main(String[] args)
    {
        String text = "Java";
        int number = 17;
        double price = 3.14;
        boolean active = true;
        Student student = new Student("Вікторія", 20);

        showExplicit(text, number, price, active, student);

        Object[] params = {text, number, price, active, student};
        showArray(params);

        showVarargs(text, number, price, active, student);
    }
}
