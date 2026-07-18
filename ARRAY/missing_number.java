package ARRAY;
import java.util.*;
public class missing_number {
    static long miss(int x[],int n)
    {
        long s=0;
        for(int i=0;i<x.length;i++)
        {
            s+=x[i];
        }
        return (long)n*(n+1)/2-s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of 'N' : ");
        int n=sc.nextInt();
        int x[]=new int[n-1];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n-1;i++)
        {
            x[i]=sc.nextInt();
        }
        System.out.print("Array : ");
        for(int i=0;i<n-1;i++)
        {
            System.out.print(x[i]+" ");
        }
        System.out.println();
        System.out.println("Missing number : "+miss(x, n));
        sc.close();
    }
}
