//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long x)
	 {
		// Your code here
		long s=0, e=x, mid=0;
		while(s <= e) {
		    mid = s + (e-s)/2;
		    if(mid*mid > x) { e = mid -1; }
            else if(mid*mid < x) { s = mid + 1;} 
            else { return mid;}
		}
		return e;
	 }
}
