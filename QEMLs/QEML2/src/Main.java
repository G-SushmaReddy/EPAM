public class Main
{
    public static void main(String[] args)
    {
        int i, j;
        String key;
        String[] letters = {"E","D","C","B","A","B"};
        for (j = 1; j < letters.length; j++)
        {
            key = letters[j];
            i = j - 1;
            while (i >= 0)
            {
                if (key.compareTo(letters[i]) > 0)
                {
                    break;
                }
                letters[i + 1] = letters[i];
                i--;
            }
            letters[i + 1] = key;
        }
        for (int t = 0; t < letters.length; t++)
        {
            System.out.print((letters[t]) + "");
        }
    }
}