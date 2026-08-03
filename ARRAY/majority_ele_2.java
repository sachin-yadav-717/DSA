package ARRAY;
import java.util.*;
public class majority_ele_2 {
    static List<Integer> prat(int x[])
    {
        int c1=0,c2=0,e1=Integer.MIN_VALUE,e2=Integer.MIN_VALUE;
        for(int i=0;i<x.length;i++)
        {
            if(c1==0 && x[i]!=e2)
            {
                c1=1;
                e1=x[i];
            }
            else if(c2==0 && x[i]!=e1)
            {
                c2=1;
                e2=x[i];
            }
            else if(x[i]==e1)
            {
                c1++;
            }
            else if(x[i]==e2)
            {
                c2++;
            }
            else
            {
                c1--;
                c2--;
            }
        }
        List<Integer> list=new ArrayList<>(2);
        c1=0;c2=0;
        for(int i=0;i<x.length;i++)
        {
            if(e1==x[i])
            {
                c1++;
            }
            if(e2==x[i])
            {
                c2++;
            }
        }
        if(c1>x.length/3)
        {
            list.add(e1);
        }
        if (c2>x.length/3) {
            list.add(e2);
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of Array : "); 
        int n=sc.nextInt();
        int x[]=new int[n];
        System.out.println("Enter the Array elements " );
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        System.out.print("Array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        System.out.println("\nMajority Elements : "+prat(x));
        sc.close();
    }
}
