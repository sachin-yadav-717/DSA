package MATRIX;
import java.util.*;
public class return_spiral_order {
    static List<Integer> spiral(int x[][])
    {
        List<Integer> list=new ArrayList<Integer>(x.length*x[0].length);
        int t=0,l=0,b=x.length-1,r=x[0].length-1;
        while(l<=r && t<=b)
        {
            for(int i=l;i<=r;i++)
            {
                list.add(x[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++)
            {
                list.add(x[i][r]);
            }
            r--;
            if(t<=b)
            {
                for(int i=r;i>=l;i--)
                {
                    list.add(x[b][i]);
                }
                b--;
            }
            if(l<=r)
            {
                for(int i=b;i>=t;i--)
                {
                    list.add(x[i][l]);
                }
                l++;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row Numbers : ");
        int n=sc.nextInt();
        System.out.print("Enter Column Numbers : ");
        int m=sc.nextInt();
        int x[][]=new int[n][m];
        System.out.println("\nEnter Matrix elements below ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                x[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nMatrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("List : "+spiral(x));
        sc.close();
    }
}
