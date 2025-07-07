class WrapperExample

{
    public static void main(String[] args)
    {
        int num = 10;
        double price = 99.99;
        char grade = 'A';

        Integer numObj = num;       // int to Integer
        Double priceObj = price;    // double to Double
        Character gradeObj = grade; // char to Character

        System.out.println("Primitive int: " + num);
        System.out.println("Wrapped Integer: " + numObj);

        System.out.println("Primitive double: " + price);
        System.out.println("Wrapped Double: " + priceObj);

        System.out.println("Primitive char: " + grade);
        System.out.println("Wrapped Character: " + gradeObj);
    }
}
