package ARRAY;
import java.util.*;
public class sort_zot_dnf_algo {
    static void DNF(int x[])
    {
        int l=0,m=0,h=x.length-1,t;
        while(m<=h)
        {
            if(x[m]==0)
            {
                t=x[l];
                x[l]=x[m];
                x[m]=t;
                l++;
                m++;
            }
            else if(x[m]==1)
            {
                m++;
            }
            else
            {
                t=x[h];
                x[h]=x[m];
                x[m]=t;
                h--;
            }
        }
        System.out.print("\nArray After : ");
        for(int i=0;i<x.length;i++)
        {
            System.out.print(x[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n=sc.nextInt();
        int x[]=new int[n];
        System.out.println("Enter the array elements below 🦴");
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        System.out.print("Array Before : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        DNF(x);
        sc.close();
    }
}
