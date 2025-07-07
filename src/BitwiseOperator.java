public class BitwiseOperator
{
    public static void main(String[] args)
    {
        int A = 5;  // 0101 in binary
        int B = 6;  // 0110 in binary

        System.out.println("A = " + A + " (binary: 0101)");
        System.out.println("B = " + B + " (binary: 0110)");

        System.out.println("A & B: " + (A & B));       //0100
        System.out.println("A | B: " + (A | B));       //0111
        System.out.println("A ^ B: " + (A ^ B));       //0011
        System.out.println("~A: " + (~A));             // -6 in 2's complement
        System.out.println("A << 1: " + (A << 1));     //1010
        System.out.println("A >> 1: " + (A >> 1));     // 0010
        System.out.println("A >>> 1: " + (A >>> 1));   // 0010
    }
}
