package ARRAY;

import java.util.Scanner;

public class frequency_count {
    static Scanner sc=new Scanner(System.in);
    static void fre(int x[],int h[])
    {
        int f=0;
        while(f==0)
        {
            System.out.print("Enter the number to search it frequency : ");
            int n=sc.nextInt();
            System.out.println(n+" appears : "+h[n]+" times\n");
            System.out.print("Enter '1' to exit searching else '0' :");
            f=sc.nextInt();
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the max element which array would  contain : ");
        int m=sc.nextInt();
        int h[]=new int[m+1];
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        int x[]=new int[n];
        System.out.println("Enter the elements below ");
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            h[x[i]]+=1;
        }
        System.out.print("Array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        System.out.println();
        fre(x, h);
    }
}
