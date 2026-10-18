public class Task6
{

    // Інтерфейс, який реалізуватимуть анонімні класи
    interface Action
    {
        void execute();
    }

    public static void main(String[] args)
    {

        // Перший анонімний клас
        Action action1 = new Action()
        {
            @Override
            public void execute()
            {
                System.out.println("Перший клас: Привіт!");
            }
        };

        // Другий анонімний клас
        Action action2 = new Action()
        {
            @Override
            public void execute()
            {
                System.out.println("Другий клас: Java!");
            }
        };

        // Третій анонімний клас
        Action action3 = new Action()
        {
            @Override
            public void execute()
            {
                System.out.println("Третій клас: Шифрування!");
            }
        };

        // Поліморфізм: один тип інтерфейсу, різна поведінка
        Action[] actions = {action1, action2, action3};

        for (Action action : actions)
        {
            action.execute();
        }

        // Анонімний клас без локальної змінної
        new Action()
        {
            @Override
            public void execute()
            {
                System.out.println(
                        "Виклик без локальної змінної");
            }
        }.execute();
    }
}