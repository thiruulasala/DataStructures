public class BigON2N
{
    public static void printitems(int n)
{
    for(int i=0;i<n;i++)
    {
        for (int j=0;j<n;j++) {
            for (int k = 0; k < n; k++) {
                System.out.println(i + "  " + j);
            }
        }
    }
}
    public static void main(String[] args)
    {
        printitems(10);
    }
}

//this was a for loop followed by another for loop to make this code ovince squaared.
//so these for loop ran in times ,in times  or in squares, so we pass this a 10.{n*n=n^2}
//and we had 100 lines that we output and that is all been squared.& that is O(n^2).
//o/p=
//0  0
//0  1
//0  2
//0  3
//0  4
//0  5
//0  6
//0  7
//0  8
//0  9
//1  0
//1  1
//1  2
//1  3
//1  4
//1  5
//1  6
//1  7
//1  8
//1  9
//2  0
//it will be print like 0 0 to 9 9