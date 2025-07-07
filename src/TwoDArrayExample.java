public class TwoDArrayExample
{
    public static void main(String[] args)
    {
        String[][] fruits =
                {
                {"Apple", "Banana"},
                {"Mango", "Orange"}
        };
        System.out.println("2D Array of Fruits:");
        for (int i = 0; i < fruits.length; i++)
        {
            for (int j = 0; j < fruits[i].length; j++)
            {
                System.out.print(fruits[i][j] + " ");
            }
            System.out.println();
        }
    }
}
