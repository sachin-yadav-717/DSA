package MATRIX;
import java.util.*;
public class print_spiral_order {
    static int[][] spi(int n)
    {
        int k=1,l=0,t=0,r=n-1,b=n-1;
        int x[][]=new int[n][n];
        while(l<=r && t<=b)
        {
            for(int i=l;i<=r;i++)
            {
                x[t][i]=k;
                k++;
            }
            t++;
            for(int i=t;i<=b;i++)
            {
                x[i][r]=k;
                k++;
            }
            r--;
            if(t<=b)
            {
                for(int i=r;i>=l;i--)
                {
                    x[b][i]=k;
                    k++;
                }
                b--;
            }
            if(l<=r)
            {
                for(int i=b;i>=t;i--)
                {
                    x[i][l]=k;
                    k++;
                }
                l++;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the dimension of Matrix : ");
        int n=sc.nextInt();
        int x[][]=spi(n);
        System.out.println("Matrix");
        for(int[] i : x)
        {
            for(int j : i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
