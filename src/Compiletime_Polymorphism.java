class Calculator
{

    // method with 2 int parameters
    int add(int a, int b)
    {
        return a + b;
    }

    // method with 3 int parameters
    int add(int a, int b, int c)
    {
        return a + b + c;
    }

    // method with 2 double parameters
    double add(double a, double b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 ints: " + calc.add(5, 10));
        System.out.println("Sum of 3 ints: " + calc.add(2, 4, 6));
        System.out.println("Sum of 2 doubles: " + calc.add(3.5, 2.5));
    }
}
