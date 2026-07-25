package ARRAY;
import java.util.*;
public class rearrange_arr_sign {
    static void sign(int x[],ArrayList<Integer> P,ArrayList<Integer> N)
    {
        int p=0,n=0,i=0;
        while(p<P.size() && n<N.size())
        {
            if(i%2==0)
            {
                x[i]=P.get(p);
                p++;
            }
            else
            {
                x[i]=N.get(n);
                n++;
            }
            i++;
        }
        while(p<P.size())
        {
            x[i]=P.get(p);
            p++;
            i++;
        }
        while(n<N.size())
        {
            x[i]=N.get(n);
            n++;
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n=sc.nextInt();
        int x[]=new int[n];
        ArrayList<Integer> P=new ArrayList<>();
        ArrayList<Integer> N=new ArrayList<>();
        System.out.println("Enter the array elements below 🦴");
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            if(x[i]<0)
            {
                N.add(x[i]);
            }
            else
            {
                P.add(x[i]);
            }
        }
        System.out.print("Array Before : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        sign(x, P, N);
        System.out.print("\nArray After : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        sc.close();
    }
}
