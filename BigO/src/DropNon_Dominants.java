public class DropNon_Dominants
{
    public static void printItems(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println(i+"  "+j);
            }
        }
        for(int k=0;k<n;k++)
        {
            System.out.println(k);
        }
    }
    public static void main(String[] args)
    {
        printItems(3);
    }
}
//O/P=0  0
//0  1
//0  2
//1  0
//1  1
//1  2
//2  0
//2  1
//2  2
//0
//1
//2