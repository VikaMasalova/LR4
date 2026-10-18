public class Task1
{

    static class Student
    {
        String name;
        int age;
        String group;

        Student(String name, int age, String group)
        {
            this.name = name;
            this.age = age;
            this.group = group;
        }

        void study()
        {
            System.out.println(name + " навчається.");
        }

        @Override
        public String toString()
        {
            return "Ім'я: " + name
                    + ", вік: " + age
                    + ", група: " + group;
        }
    }

    public static void main(String[] args)
    {
        Student student = new Student("Вікторія", 20, "КБ-41");

        System.out.println(student);
        student.study();
    }
}
