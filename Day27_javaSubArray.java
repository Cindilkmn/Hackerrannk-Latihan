import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day27_javaSubArray {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int []A= new int[n];
       for (int i=0;i<n;i++){
           A[i]=scanner.nextInt();
       }
       
        int nNegativeSum = 0;
        for (int i = 0; i < A.length; i++) {//start
            for (int j = i; j < A.length; j++) {//end
            int sum = sumOfSubArray(A, i, j);
            if (sum<0){
                nNegativeSum++;
            }
            }
        }
        System.out.println(nNegativeSum);
    }
    
    static int sumOfSubArray(int[] A, int start, int end){
        int sum = 0;
            for (int k = start; k <= end; k++) {
                sum +=A[k];
            }
            return sum;
    }

}