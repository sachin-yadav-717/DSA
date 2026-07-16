package ARRAY;
import java.util.*;
public class second_largest {
    static void slargest(int x[])
    {
        int l=x[0],sl=-1000;
        for(int i=0;i<x.length;i++)
        {
            if(x[i]>l)
            {
                sl=l;
                l=x[i];
            }
            if(x[i]<l && x[i]>sl)
            {
                sl=x[i];
            }
        }
        System.out.println("The Second largest element : "+sl);
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
        slargest(x);
        sc.close();
    }
}
