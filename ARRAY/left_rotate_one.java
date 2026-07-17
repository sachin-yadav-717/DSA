package ARRAY;

import java.util.Scanner;

public class left_rotate_one {
    static void rotate(int x[])
    {
        int t=x[0];
        for(int i=1;i<x.length;i++)
        {
            x[i-1]=x[i];
        }
        x[x.length-1]=t;
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
        rotate(x);
        System.out.print("Array After : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
