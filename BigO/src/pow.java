public class pow
{
    public static void printitem(int n)
    {
        for(int i=1;i<=Math.pow(2,n);i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        printitem(3);
    }
}

