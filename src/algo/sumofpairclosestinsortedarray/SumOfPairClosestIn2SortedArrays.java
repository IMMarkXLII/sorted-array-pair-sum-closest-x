/**
 * @author ashish.adhikari
 */
package algo.sumofpairclosestinsortedarray;

/**
 * @author ashish.adhikari
 *
 */
public class SumOfPairClosestIn2SortedArrays {
	public static void main(String args[])
    {
        int ar1[] = {1, 4, 5, 7};
        int ar2[] = {10, 20, 30, 40};
        int m = ar1.length;
        int n = ar2.length;
        int x = 38;
        printClosest(ar1, ar2, m, n, x);
    }

	/**
	 * @param ar1
	 * @param ar2
	 * @param m
	 * @param n
	 * @param x
	 */
	private static void printClosest(int[] ar1, int[] ar2, int m, int n, int x) {
		int diff = Integer.MAX_VALUE;
		
		int left = 0;
		int right = n-1;
		
		for(int i=left, j=right; i<m && j>=0 ; ) {
			
			if(Math.abs(ar1[i] + ar2[j] - x) < diff) {
				left = i;
				right = j;
				diff = Math.abs(ar1[i] + ar2[j] - x);
			}
			if(ar1[i] + ar2[j] > x)
				j--;
			else
				i++;
		}
		
		System.out.println(ar1[left]);
		System.out.println(ar2[right]);
	}
}
