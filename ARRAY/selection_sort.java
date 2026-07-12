package ARRAY;

import java.util.Scanner;

public class selection_sort {
    static void selection(int x[])
    {
        System.out.print("Array Before sorting : ");
        for(int i=0;i<x.length;i++)
        {
            System.out.print(x[i]+" ");
        }
        for(int i=0;i<x.length-1;i++)
        {
            for(int j=i;j<x.length;j++)
            {
                if(x[j]<x[i])
                {
                    int t=x[i];
                    x[i]=x[j];
                    x[j]=t;
                }
            }
        }
        System.out.print("\nArray after sorting : ");
        for(int i=0;i<x.length;i++)
        {
            System.out.print(x[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        int x[]=new int[n];
        System.out.println("Enter the array elements below ");
        for(int i=0;i<x.length;i++)
        {
            x[i]=sc.nextInt();
        }
        selection(x);
        sc.close();
    }
}
