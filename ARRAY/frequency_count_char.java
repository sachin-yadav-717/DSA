package ARRAY;

import java.util.HashMap;
import java.util.Scanner;

public class frequency_count_char {
    static Scanner sc=new Scanner(System.in);
    static void freq(HashMap<Character,Integer>fre)
    {
        int f=0;
        while(f==0)
        {
            System.out.print("Enter the character to search it frequency : ");
            char n=sc.next().charAt(0);
            System.out.println(n+" appears : "+fre.getOrDefault(n,0)+" times\n");
            System.out.print("Enter '1' to exit searching else '0' :");
            f=sc.nextInt();
            System.out.println();
        }
    }
    public static void main(String[] args) {
        HashMap< Character,Integer> fre=new HashMap<>();
        System.out.print("Enter a string : ");
        String s=sc.nextLine();
        System.out.println("String : "+s);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                fre.put(s.charAt(i), fre.getOrDefault(s.charAt(i),0)+1);
            }
        }
        freq(fre);
    }
}
