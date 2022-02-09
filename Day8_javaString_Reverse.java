import java.io.*;
import java.util.*;

public class Day8_javaString_Reverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        //cara pertama
        //boolean isPalindrome = false;
        //StringBuilder sb = new StringBuilder(s);
        //String balikan = sb.reverse().toString();
        //System.out.println(s.equals(balikan)?"Yes":"No");
        
        //cara kedua
        System.out.println(s.equals(new StringBuilder(s).reverse().toString())?"Yes":"No");
        
    }
}



