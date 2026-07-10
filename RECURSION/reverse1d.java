import java.util.*;
public class reverse1d {
    static int[] rev(int i,int x[])
    {
        if(i>=x.length/2)
        {
            return x;
        }
        int t=x[i];
        x[i]=x[x.length-1-i];
        x[x.length-1-i]=t;
        return rev(i+1, x);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        int x[]=new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        System.out.print("\nOriginal array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        System.out.println();
        rev(0, x);
        System.out.print("Reversed array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        sc.close();
    }
}
