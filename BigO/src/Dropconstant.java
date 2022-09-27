public class Dropconstant
{
    public static void printItems(int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(i);
        }
        for(int j=0;j<n;j++)
        {
            System.out.println(j);
        }
    }
    public static void main(String[] args)
    {
        printItems(10);
    }
}
//this case ,we had in plus in operations ,we passed this 10 items, and it ran 20 times,
//which is two in one{n+n=2n},so you might think that this would be oh of two in{O(2n)}.
// we simply this by dropping the constant, and it just becomes a with in,and it doesn't matter
// if the conmstant is two or a thousand

//o/p=0
//1
//2
//3
//4
//5
//6
//7
//8
//9
//0
//1
//2
//3
//4
//5
//6
//7
//8
//9