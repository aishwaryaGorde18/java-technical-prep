class EvenThread extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 10; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println("Even: " + i);
            }
        }
    }
}

class OddThread extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 10; i++)
        {
            if (i % 2 != 0)
            {
                System.out.println("Odd: " + i);
            }
        }
    }
}
public class EvenOddThread
{
    public static void main(String[] args)
    {
        EvenThread even = new EvenThread(); // Thread for even numbers
        OddThread odd = new OddThread();    // Thread for odd numbers

        even.start();
        odd.start();
    }
}
