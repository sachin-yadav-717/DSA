package ARRAY;
import java.util.*;
public class long_subarr_k_prefixsum {
    static int longest(int x[],int k)
    {
        int s=0,m=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<x.length;i++)
        {
            s+=x[i];
            if(s==k)
            {
                m=Math.max(m, i+1);
            }
            if(map.containsKey(s-k))
            {
                m=Math.max(m, i-map.get(s-k));
            }
            if(!map.containsKey(s))
            {
                map.put(s,i);
            }
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
        int x[]=new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        System.out.print("Array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        System.out.print("\nEnter the value of k : ");
        int k=sc.nextInt();
        System.out.println("Length of longest subarray with sum  "+k+" : "+longest(x, k));
        sc.close();
    }
}
