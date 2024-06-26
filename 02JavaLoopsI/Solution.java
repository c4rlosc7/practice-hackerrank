import java.io.*;

/*
 * Sample Input
 * 2
 * 
 * Sample Output
 * 
 * 2 x 1 = 2
 * 2 x 2 = 4
 * 2 x 3 = 6
 * 2 x 4 = 8
 * 2 x 5 = 10
 * 2 x 6 = 12
 * 2 x 7 = 14
 * 2 x 8 = 16
 * 2 x 9 = 18
 * 2 x 10 = 20
 * 
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (Integer index = 1; index <= 10; index++) {
            System.out.println(N + " x " + index + " = " + N*index);
        }
        bufferedReader.close();
    }
}