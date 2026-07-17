package ARRAY;
import java.util.*;
public class move_zero {
    static void shift(int x[])
    {
        int i=0;
        for(int j=0;j<x.length;j++)
        {
            if(x[j]!=0)
            {
                int t=x[i];
                x[i]=x[j];
                x[j]=t;
                i++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n=sc.nextInt();
        int x[]=new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        System.out.print("Array Before : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        System.out.println();
        shift(x);
        System.out.print("Array After : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
