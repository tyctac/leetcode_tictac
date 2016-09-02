package leetcode;

public class Solution {
	public static int[] countBits(int num) {
		int count = 0;
		// int son = num;
		// while(son/2!=0) {
		// count = count +1;
		// }

		int a1[] = { 0 };
		int a2[] = { 0, 1 };

		if (num == 0)
			return a1;
		if (num == 1)
			return a2;
		int arr[] = new int[num + 1];
		arr[0] = 0;
		arr[1] = 1;
		int T = 2;
		int j = T;
		int pos;
		for (int i = 2; i <= num; i++) {
			// arr[i] = arr[]
			pos = T - j;
			arr[i] = arr[pos] + 1;
			j = j - 1;
			if (j == 0) {
				T = T + T;
				j = T;
			}

		}
		return arr;
	}

	public static int[] twoSum(int[] numbers, int target) {
		int left=0,right = numbers.length;
		int a[] = new int[2];
		a[0] = 100;
		a[1] = 200;
		if(numbers.length ==2) {
			a[0] = 0;
			a[1] = 1;
			return a;
		}
		int l,r;
		l = (left + right) /2;
		r = l+1;
		
		return a;
	}

	public static int[] singleNumber(int[] nums) {  
       int res[] = new int[2];
       int n = 0;
       for(int i=0;i<nums.length;i++)
       {
    	   n = n^nums[i];
       }
       int split = n&(~(n-1));
       res[0] = 0;
       res[1] =1;
       for (int i=0;i<nums.length;i++) {
    	   if((nums[i]&split) ==0) {
    		   res[0] = res[0] ^nums[i];
    	   }
    	   else {
    		   res[1] = res[1] ^nums[i];
    	   }
       }
       return res;
       
    } 
	
	public static void main(String[] args) {
//		int x = 5;
//		int sss[] = countBits(5);
//		for (int i = 0; i <= 5; i++) {
//			System.out.println(countBits(5)[i]);
//		}
		
		int[] a = {2,3,4,4,3,12,11,2};
		int[] b = singleNumber(a);
		for( int i =0;i<=1;i++) {
			System.out.println(b[i]);
		}
	}
	
	public static void main1(String[] args) {
//		int x = 5;
//		int sss[] = countBits(5);
//		for (int i = 0; i <= 5; i++) {
//			System.out.println(countBits(5)[i]);
//		}
		
		int[] a = {2,3,4};
		int[] b = twoSum(a, 6);
		for( int i =0;i<=1;i++) {
			System.out.println(b[i]);
		}
	}
}
