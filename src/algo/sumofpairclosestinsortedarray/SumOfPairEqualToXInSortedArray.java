package algo.sumofpairclosestinsortedarray;

import java.util.ArrayList;
import java.util.List;

/**

 * @author ashish.adhikari
 */

/**
 * @author ashish.adhikari
 *
 */
public class SumOfPairEqualToXInSortedArray {
	public static void main(String[] args)
    {
        int arr[] =  {2, 3, 10, 22, 28, 29, 30, 40}, x = 32;
        int n = arr.length;
        printEqual(arr, n, x);        
    }

	/**
	 * @param arr
	 * @param n
	 * @param x
	 * if the difference is less than the current lowest diff
	 * (could be greater than or less than), then we update the 
	 * values of left and right and diff
	 * 
	 * If the sum of left and right is more than the given sum, we move from right to left
	 * else we move from the left to right
	 */
	private static void printEqual(int[] arr, int n, int x) {
		int left = -1, right = -1;
		List<String> res = new ArrayList<>();
		int diff = Integer.MAX_VALUE;
		for(int i=0, j=n-1; j>i; ) {
			if(arr[i] + arr[j] == x) {
				res.add(arr[i] +  "+" +arr[j]);
			}
			if((arr[i] + arr[j]) > x)
				j--;
			else
				i++;
		}
		
		System.out.println(res);
	}
}
