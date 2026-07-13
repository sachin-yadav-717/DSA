package ARRAY;
import java.util.*;

class merge_sort {

    static void merge(int x[],int l,int h)
    {
        if(l==h)
        {
            return;
        }
        merge(x, l, (l+h)/2);
        merge(x, (l+h)/2+1, h);
        ms(x,l,(l+h)/2,h);
    }
    static void ms(int x[],int l,int m, int h)
    {
        int r=m+1,le=l;
        ArrayList<Integer> list=new ArrayList<>(10);
        while(le<=m && r<=h)
        {
            if(x[le]<=x[r])
            {
                list.add(x[le]);
                le++;
            }
            else
            {
                list.add(x[r]);
                r++;
            }
        }
        while (le<=m) {
            list.add(x[le]);
            le++;
        }
        while (r<=h) {
            list.add(x[r]);
            r++;
        }
        for(int i=l;i<=h;i++)
        {
            x[i]=list.get(i-l);
        }
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
        System.out.print("Array before merge sort : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        System.out.println();
        merge(x, 0, n-1);
        System.out.print("Array after merge sort : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        sc.close();
    }
}