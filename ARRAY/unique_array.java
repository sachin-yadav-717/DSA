package ARRAY;
import java.util.*;
public class unique_array {
    static int rd(int x[])
    {
        int i=0,j=1;
        while(j<x.length)
        {
            if(x[i]!=x[j])
            {
                x[++i]=x[j];
            }
            j++;
        }
        return i+1;
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
        int k=rd(x);
        System.out.println("Number of unique element : "+k);
        System.out.print("Unique Array : ");
        for(int i=0;i<k;i++)
        {
            System.out.print(x[i]+" ");
        }
        sc.close();
    }
}
