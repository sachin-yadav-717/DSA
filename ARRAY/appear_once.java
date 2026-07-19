package ARRAY;

import java.util.Scanner;

public class appear_once {
    static int xo(int x[])
    {
        int xor=0;
        for(int i=0;i<x.length;i++)
        {
            xor^=x[i];
        }
        return xor;
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
        System.out.println("The number which appears once : "+xo(x));
        sc.close();
    }
}
