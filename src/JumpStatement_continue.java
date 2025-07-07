public class JumpStatement_continue
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            if (i == 3)
            {
                continue; // skips the rest of the loop when i is 3
            }
            System.out.println("i = " + i);
        }
    }
}
