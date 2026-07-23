package ARRAY;
import java.util.*;
public class max_subarr_sum {
    static int MSAS(int x[])
    {
        int m=Integer.MIN_VALUE;
        int s=0,f=0,ff=0,e=0;
        for(int i=0;i<x.length;i++)
        {
            if(s==0)
            {
                f=i;
            }
            s+=x[i];
            if(s>m)
            {
                m=s;
                ff=f;
                e=i;
            }
            if(s<0)
            {
                s=0;
            }
        }
        System.out.println("\nsubarray with max sum : "+ff+" <-> "+e);
        return m;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
        int x[]=new int[n];
        System.out.println("\nEnter the array elements below");
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        System.out.print("\nArray : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        System.out.println("Max sub-array sum : "+MSAS(x));
        sc.close();
    }
}
