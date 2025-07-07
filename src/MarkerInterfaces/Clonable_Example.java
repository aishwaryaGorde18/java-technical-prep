package MarkerInterfaces;

import java.io.*;
class Student1 implements Cloneable {
    int id = 1;

    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Creates a copy of the object
    }
}

public class Clonable_Example {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student1 s1 = new Student1();
        Student1 s2 = (Student1) s1.clone(); // Cloning s1

        System.out.println("s1 id: " + s1.id);
        System.out.println("s2 id: " + s2.id);
    }
}

