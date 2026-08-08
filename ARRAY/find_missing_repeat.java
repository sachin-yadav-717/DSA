package ARRAY;
import java.util.*;
public class find_missing_repeat {
    static void  find(int x[])
    {
        int n=x.length;
        long sn=(n*(n+1))/2;
        long sn2=(n*(n+1)*(2*n+1))/6;
        long s=0,s2=0;
        for(int i=0;i<n;i++)
        {
            s+=x[i];
            s2+=x[i]*x[i];
        }
        long v1=s-sn,v2=s2-sn2;
        v2=v2/v1;
        long p=(v1+v2)/2;
        long q=p-v1;
        System.out.println("Repeating : "+p);
        System.out.println("Missing : "+q);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int x[] = new int[n];
        System.out.println("Enter the array elements below ");
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        for(int i : x)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        find(x);
        sc.close();
    }
}
