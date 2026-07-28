package MATRIX;
import java.util.*;

public class set_mat_zero {
    static int[][] setz(int x[][])
    {
        boolean r=false,c=false;
        for(int i=0;i<x[0].length;i++)
            {
                if(x[0][i]==0)
                {
                    r=true;
                    break;
                }
            }       
        for(int i=0;i<x.length;i++)
            {
                if(x[i][0]==0)
                {
                    c=true;
                    break;
                }
            }       
        for(int i=1;i<x.length;i++)
        {
            for(int j=1;j<x[0].length;j++)
            {
                if(x[i][j]==0)
                {
                    x[i][0]=0;
                    x[0][j]=0;
                }
            }
        }
        for(int i=1;i<x.length;i++)
        {
            for(int j=1;j<x[0].length;j++)
            {
                if(x[i][j]!=0)
                {
                    if(x[i][0]==0 || x[0][j]==0)
                    {
                        x[i][j]=0;
                    }
                }
            }
        }
        if(r)
        {
            for(int i=0;i<x[0].length;i++)
            {
                x[0][i]=0;
            }
        }
        if(c)
        {
            for(int i=0;i<x.length;i++)
            {
                x[i][0]=0;
            }
        }
        return x;
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
        System.out.println("\nMatrix Before");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
        setz(x);
        System.out.println("\nMatrix After");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}