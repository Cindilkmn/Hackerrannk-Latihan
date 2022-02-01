import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day9_JavaEnd_of_file {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int k = 1;
        while(sc.hasNext()){ // deteksi eof
            String s = sc.nextLine();
            System.out.println(k+" " +s);
            k++;
        }
    }
}