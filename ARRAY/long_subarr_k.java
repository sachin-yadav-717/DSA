package ARRAY;
import java.util.*;
public class long_subarr_k {
    static int sub(int x[],int k)
    {
        if(x.length==0)
        {
            return 0;
        }
        int s=x[0],i=0,j=0,m=0;
        while(j<x.length)
        {
            while(s>k && i<=j)
            {
                s-=x[i++];
            }
            if(s==k)
            {
                m=Math.max(m, j-i+1);
            }
            j++;
            if(j<x.length)
            {
                s+=x[j];
            }
        }
        return m;
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
        System.out.print("Enter the target : ");
        int k=sc.nextInt();
        System.out.print("Array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        System.out.println();
        System.out.println("Longest subarray : "+sub(x, k));
        sc.close();
    }
}
