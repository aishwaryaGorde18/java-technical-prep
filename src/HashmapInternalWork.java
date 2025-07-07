import java.util.HashMap;

public class HashmapInternalWork
{

    public static void main(String[] args)
    {

        // Creating Student objects
        Student student1 = new Student(1, "Aishwarya");
        Student student2 = new Student(2, "Rucha");
        Student student3 = new Student(1, "Trisha");

        // Creating a HashMap with Student as key and grade as value
        HashMap<Student, String> hm = new HashMap<>();

        // Adding elements to the HashMap
        hm.put(student1, "A Grade");
        hm.put(student2, "B Grade");

        // Retrieving values using keys
        System.out.println("Grade of student1: " + hm.get(student1));
        System.out.println("Grade of student2: " + hm.get(student2));

        // Using student3 (same id as student1) to retrieve value
        System.out.println("Grade of student3: " + hm.get(student3));
    }
}

// Student class with overridden hashCode and equals based on id only
class Student {
    private int id;
    private String name;

    // Constructor
    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    // Override hashCode method using only id
    @Override
    public int hashCode()
    {
        return 31 * id;
    }

    // Override equals method using only id
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return id == student.id;
    }
}