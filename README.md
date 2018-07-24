# sorted-array-pair-sum-closest-x
Given a sorted array and a number x, find the pair in array whose sum is closest to x


```
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
```
