public class DiffTermsForInput1
{
    public static void printitems(int a,int b,int c) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    System.out.println(i + " " + j+" "+k);
                }
            }
        }
    }
       public static void main (String[] args)
        {
            printitems(3,3,3);
        }
}
//o/p=0 0 0
//0 0 1
//0 0 2
//0 1 0
//0 1 1
//0 1 2
//0 2 0
//0 2 1
//0 2 2
//1 0 0
//1 0 1
//1 0 2
//1 1 0
//1 1 1
//1 1 2
//1 2 0
//1 2 1
//1 2 2
//2 0 0
//2 0 1
//2 0 2
//2 1 0
//2 1 1
//2 1 2
//2 2 0
//2 2 1
//2 2 2
