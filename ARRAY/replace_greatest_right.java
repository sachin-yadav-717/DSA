package ARRAY;
import java.util.*;
public class replace_greatest_right {
    static int[] RGRS(int x[])
    {
        int y[]=new int[x.length];
        int g=-1;
        for(int i=x.length-1;i>=0;i--)
        {
            y[i]=g;
            if(x[i]>g)
            {
                g=x[i];
            }
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int x[] = new int[n];
        System.out.println("Enter the array elements below ");
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        System.out.print("Array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        int U[]=RGRS(x);
        System.out.print("\nUpdated Array : ");
        for(int i=0;i<U.length;i++)
        {
            System.out.print(U[i]+" ");
        }
        sc.close();
    }
}
