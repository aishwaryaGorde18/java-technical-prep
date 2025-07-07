public class AssignOperator
{
    public static void main(String[] args)
    {
        int a = 10;

        a += 5;
        // 10 + 5
        System.out.println("a += 5: " + a);

        a -= 3;
        // 15 - 3
        System.out.println("a -= 3: " + a);

        a *= 2;
        // 12 * 2
        System.out.println("a *= 2: " + a);

        a /= 4;
        // 24 / 4
        System.out.println("a /= 4: " + a);

        a %= 4;
        // 6 % 4
        System.out.println("a %= 4: " + a);
    }
}
