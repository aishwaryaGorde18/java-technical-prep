public class Immutable_classExample
{

    // Immutable Student class inside the same file
    static final class Student
    {
        private final int id;
        private final String name;

        // Constructor
        public Student(int id, String name)
        {
            this.id = id;
            this.name = name;
        }

        // Getter methods
        public int getId()
        {
            return id;
        }

        public String getName()
        {
            return name;
        }
    }

    // Main method to run the program
    public static void main(String[] args)
    {
        Student student = new Student(1, "Aishwarya");

        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
}
}