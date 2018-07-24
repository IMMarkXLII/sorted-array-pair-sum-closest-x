package algo.sumofpairclosestinsortedarray;
/**

 * @author ashish.adhikari
 */

/**
 * @author ashish.adhikari
 *
 */
public class SumOfPairClosestInSortedArray {
	public static void main(String[] args)
    {
        int arr[] =  {10, 22, 28, 29, 30, 40}, x = 54;
        int n = arr.length;
        printClosest(arr, n, x);        
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
	private static void printClosest(int[] arr, int n, int x) {
		int left = -1, right = -1;
		int diff = Integer.MAX_VALUE;
		for(int i=0, j=n-1; j>i; ) {
			if(Math.abs(arr[i] + arr[j] - x) < diff) {
				left = i; right = j;
				diff = Math.abs(arr[i]+ arr[j] - x);
			}
			if((arr[i] + arr[j]) > x)
				j--;
			else
				i++;
		}
		
		System.out.println(arr[left]);
		System.out.println(arr[right]);
	}
}
