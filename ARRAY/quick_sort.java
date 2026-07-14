package ARRAY;
import java.util.*;
public class quick_sort {
    static void quick(int x[],int l,int h)
    {
        if(l<h)
        {
            int p=part(x, l, h);
            quick(x, l, p-1);
            quick(x, p+1, h);
        }
    }
    static int part(int x[],int l,int h)
    {
        int i=l,j=h;
        while(i<j)
        {
            while(x[i]<=x[l] && i<h)
            {
                i++;
            }
            while (x[j]>x[l] && j>l) {
                j--;
            }
            if(i<j)
            {
                int t=x[i];
                x[i]=x[j];
                x[j]=t;
            }
        }
        int p=x[l];
        x[l]=x[j];
        x[j]=p;
        return j;
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
        System.out.print("Array Before Swap : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        quick(x, 0, n-1);
        System.out.print("\nArray After Swap : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        sc.close();
    }
}
