package ARRAY;
import java.util.*;
public class check_sorted {
    static void sort(int x[])
    {
        int c=0,f=0;
        for(int i=0;i<x.length-1;i++)
        {
            if(x[i+1]<=x[i] && x[i+1]-x[i]<=0)
            {
                c++;
            }
            if(x[i+1]>=x[i] && x[i+1]-x[i]>=0)
            {
                f++;
            }
        } 
        if(c==x.length-1 || f==x.length-1)
        {
            System.out.println("Sorted Array");
        }
        else
        {
            System.out.println("Unsorted Array");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
        int x[]=new int[n];
        System.out.println("Enter array elements ");
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        System.out.print("Array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        System.out.println();
        sort(x);
        sc.close();
    }
}
