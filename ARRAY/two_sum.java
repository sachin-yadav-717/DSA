package ARRAY;
import java.util.*;
public class two_sum {
    
    static int[] RI(int x[],int tar)
    {
        int y[]=new int[2];
        HashMap<Integer,Integer> ix=new HashMap<>();
        for(int i=0;i<x.length;i++)
        {
            int t=tar-x[i];
            if(ix.containsKey(t))
            {
                y[0]=ix.get(t);
                y[1]=i;
                return y;
            }
            else{
                ix.put(x[i],i);
            }
        }
        return y;
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
        System.out.print("Array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        System.out.print("Enter the target : ");
        int t=sc.nextInt();
        RI(x, t);
        sc.close();
    }
}
