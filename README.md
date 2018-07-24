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
# sorted-array-pair-sum-closest-x-2-sorted-arrays
Given 2 sorted arrays and a number x, find the pair such that both elements are from different array whose sum is closest to x


```
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
```

# sorted-array-pair-sum-equals-x
Given a sorted array and a number x, find the pair in array whose sum is equal to x


```
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
```
