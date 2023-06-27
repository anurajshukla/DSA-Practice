//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends


class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long [] a = new Long[2];
        a[0] = lcm(A, B);
        a[1] = gcd(A, B); 
        return a;
    }
    static Long gcd(Long a, Long b) {
        if (b == 0) { return a;} 
        else { return gcd(b, a % b); }
    }
    static Long lcm(Long a, Long b) {
        return (a * b) / gcd(a, b);
    }
};