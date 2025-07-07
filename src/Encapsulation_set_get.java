class StudentA
{
    private String name;   // private variable

    // Getter method (to read the value)
    public String getName() {
        return name;
    }

    // Setter method (to set the value)
    public void setName(String newName) {
        name = newName;
    }
}

public class Encapsulation_set_get
{
    public static void main(String[] args)
    {
        StudentA s = new StudentA();
        s.setName("Aishwarya");
        System.out.println(s.getName());
    }
}

