public class NLogNTIme
{
    public static void printitem(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1; j<=n; j=j*2)
            {
                System.out.println(i+" "+j);
            }
        }
    }
    public static void main(String[] agrs)
    {
        printitem(3);
    }
}
//o/p=1 1
//1 2
//2 1
//2 2
//3 1
//3 2
//need some explenation