import java.util.*;

public class palindrom_string {

    static int palin(String s,int f,int l,int u)
    {
        if(l>=u)
        {
            return f;
        }
        if(s.charAt(l)!=s.charAt(u))
        {
            f=1;
            return f;
        }
        return palin(s, f, l+1, u-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.next();
        if (palin(s, 0, 0, s.length() - 1) == 0) {
            System.out.println("Palindrom String ");
        } else {
            System.out.println("Not Palindrom string");
        }
        sc.close();
    }
}