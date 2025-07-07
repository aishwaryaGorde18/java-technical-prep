package MarkerInterfaces;

import java.io.*;

// Marking Student as Serializable
class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Serializable_example {
    public static void main(String[] args) throws IOException {
        // Create a Student object
        Student s = new Student(1, "Aishwarya");

        // Serialize: Save object to file
        FileOutputStream fileOut = new FileOutputStream("student.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(s);
        out.close();
        fileOut.close();

        System.out.println("Object has been serialized.");
    }
}
