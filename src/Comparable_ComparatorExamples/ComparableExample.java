package Comparable_ComparatorExamples;

import java.util.*;
class Employee implements Comparable<Employee>
{
    String name;
    int age;
    Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    //overridden compareTo method
    @Override
    public int compareTo(Employee o)
    {
        return this.age - o.age;
    }
}
public class ComparableExample
{
    public static void main(String[] args)
    {
        // CREATION
        List<Employee> list = new ArrayList<>();
        //INSERTION
        list.add(new Employee("Krishna", 30));
        list.add(new Employee("Archana", 28));
        list.add(new Employee("Vineet", 25));
        list.add(new Employee("Ramesh", 38));
        list.add(new Employee("Alok", 28));
        System.out.println("Before sorting: ");
        for (Employee e : list)
        {
            System.out.print("[ EMP : age = " + e.age + " ] ");
        }
        //SORTING
        Collections.sort(list);
        System.out.println("After sorting: ");
        for (Employee e : list)
        {
            System.out.print("[ EMP : age = " + e.age + " ] ");
}
}
}

