import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class    Day20_javaPrimality_Test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        //BigInteger bi = new BigInteger (n);
        //masuk di cara panjang
        //boolean prima = bi.isProbablePrime(1);
        
        System.out.println(new BigInteger (n).isProbablePrime(1)?"prime":"not prime");
        //System.out.println(bi.isProbablePrime(1)?"prime":"not prime");
        // System.out.println(prima?"prime":"not prime");
        
        //cara panjang
        // if (prima){
        //     System.out.println("prime");
        // }else{
        //     System.out.println("not prime");
        // }

        bufferedReader.close();
    }
}
