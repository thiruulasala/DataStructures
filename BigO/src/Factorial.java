public class Factorial
{
    public static  int factorial(int n)
    {
        for(int i = 1; i<=factorial(n); i++)
        {
            System.out.println(i);
        }
        return n;
    }
    public static void main(String[] args)
    {
        factorial(3);
    }
}
//need to explain
//o/p=Stackoverflowerror