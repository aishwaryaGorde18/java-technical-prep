package Comparable_ComparatorExamples;

import java.util.*;
class Student
{
    String name;
    int age, roll;
    Student(String name, int age, int roll)
    {
        this.name = name;
        this.age = age;
        this.roll = roll;
    }
}
class AgeComparator implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2)
    {
        return o1.age - o2.age;
    }
}
class RollComparator implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2)
    {
        return o1.roll - o2.roll;
    }
}
public class ComparatorExample
{
    public static void main(String[] args)
    {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Ramesh", 30, 20));
        list.add(new Student("Adithya", 7, 10));
        list.add(new Student("Krishna", 25, 5));
        list.add(new Student("Vineet", 24, 15));
        System.out.println("BEFORE SORTING");
        for (Student e : list)
        {
            System.out.println("[ STU : name = " + e.name + " age = " + e.age + " roll = " + e.roll + "]");
        }
        Collections.sort(list,new AgeComparator());
        System.out.println("AFTER SORTING WITH AGE");
        for (Student e : list)
        {
            System.out.println("[ STU : name = " + e.name + " age = " + e.age + " ]");
        }
        Collections.sort(list,new RollComparator());
        System.out.println("AFTER SORTING WITH ROLL");
        for (Student e : list)
        {
            System.out.println("[ STU : name = " + e.name + " roll = " + e.roll + " ]");
}
}
}

