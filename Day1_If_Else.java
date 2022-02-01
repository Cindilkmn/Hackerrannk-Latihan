import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day1_If_Else {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (N%2==1){//OOD
            System.out.println("weird");
        }else{//even
        if(2 <=N && N<=5){
            System.out.println(" not weird");
        }else if (6 <=N && N<=20){
            System.out.println("weird");
        }else if(N>20){
            System.out.println(" not weird");
        }
        }
        scanner.close();
    }
}

