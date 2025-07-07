package VariableModifiers;

public class Test
{
    final int speedLimit = 60;

    void changeSpeed()
    {

        System.out.println("Speed Limit: " + speedLimit);
    }

    public static void main(String[] args)
    {
        Test t = new Test();
        t.changeSpeed();
}
}
