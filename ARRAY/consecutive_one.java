package ARRAY;
import java.util.*;

public class consecutive_one {
    static int cons(int x[])
    {
        int m=0,c=0;
        for(int i=0;i<x.length;i++)
        {
            if(x[i]==1)
            {
                c++;
            }
            else{
                m=Math.max(m, c);
                c=0;
            }
        }
        return Math.max(m,c);
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
        System.out.println("Longest consecutive ' 1s ' : "+cons(x));
        sc.close();
    }
}
