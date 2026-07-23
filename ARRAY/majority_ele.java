package ARRAY;
import java.util.*;
public class majority_ele {
    static int ele(int x[])
    {
        int e=0,c=0;
        for(int i=0;i<x.length;i++)
        {
            if(c==0)
            {
                c=1;
                e=x[i];
            }
            else if(x[i]==e)
            {
                c++;
            }
            else
            {
                c--;
            }
        }
        c=0;
        for(int i=0;i<x.length;i++)
        {
            if(x[i]==e)
            {
                c++;
            }
            if(c>x.length/2)
            {
                return e;
            }
        }
        return -1;
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
        int k=ele(x);
        if(k!=-1)
        {
            System.out.println("\nMajority element : "+k);
        }
        else{
            System.out.println("\nNo majority elements present");
        }
        sc.close();
    }
}
