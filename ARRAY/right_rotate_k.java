package ARRAY;

import java.util.Scanner;

public class right_rotate_k {
    static void rot(int x[],int l,int r)
    {
        while(l<r)
        {
            int t=x[l];
            x[l]=x[r];
            x[r]=t;
            l++;
            r--;
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
        System.out.print("Enter the value of K : ");
        int k=sc.nextInt();
        System.out.print("Array Before : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        System.out.println();
        if(n>1 && k!=n && k!=0)
        {
            k=((k%n)+n)%n;
            rot(x, 0, n-k-1);
            rot(x, n-k, n-1);
            rot(x, 0, n-1);
        }
        System.out.print("Array After : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
