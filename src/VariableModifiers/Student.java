package VariableModifiers;

public class Student
{
    static String college = "PREC College";
    String name;
    int rollNo;

    Student(String n, int r)
    {
        name = n;
        rollNo = r;
    }

    void display()
    {
        System.out.println(name + " " + rollNo + " " + college); // Line 8
    }

    public static void main(String[] args)
    {
        Student s1 = new Student("Aishwarya",10);
        Student s2 = new Student("Ruchika", 11);

        s1.display();
        s2.display();
}
}