import java.util.Scanner;

/*
 * Java's System.out.printf function can be used to print formatted output. 
 * The purpose of this exercise is to test your understanding of formatting output using printf.
 * 
 * 
 * Sample Input
 * java 100
 * cpp 65
 * python 50
 * 
 * Sample Output
 * ================================
 * java           100 
 * cpp            065 
 * python         050 
 * ================================
 */

public class Solution {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("================================");
        for(int index = 0; index < 3; index++){
            String stringIn=scanner.next();
            int integerIn=scanner.nextInt();
            System.out.printf("%-15s%03d%n", stringIn, integerIn);
        }
        scanner.close();
        System.out.println("================================");
    }
}