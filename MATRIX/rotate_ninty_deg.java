package MATRIX;

import java.util.Scanner;

public class rotate_ninty_deg {
    static void rotate(int x[][])
    {
        int n=x.length;
        //Transpose
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int t=x[i][j];
                x[i][j]=x[j][i];
                x[j][i]=t;
            }
        }
        //reverse each row
        for(int i=0;i<n;i++)
        {
            int l=0,r=n-1;
            while(l<r)
            {
                int t=x[i][l];
                x[i][l]=x[i][r];
                x[i][r]=t;
                l++;
                r--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dimension : ");
        int n=sc.nextInt();
        int x[][]=new int[n][n];
        System.out.println("\nEnter Matrix elements below ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                x[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nMatrix Before");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
        rotate(x);
        System.out.println("\nMatrix After");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
