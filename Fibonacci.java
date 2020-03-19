package Fibonacci;

public class Fibonacci {
	public static long check(int i) {
		if(i<=0)  return 0;
		long[] nums = new long[i+1];
		return fillArr(i, nums);
	}

	public static long fillArr(int i, long nums[]) {
		if(i<=1) {
			nums[i]=0;
			return nums[i];
		}
		if(i==2) {
			nums[i]=1;
			return nums[i];
		}
		if(i>2) {
			nums[i]=fillArr(i-1,nums) +fillArr(i-2,nums);
		}
		
		return nums[i-1]+nums[i-2];
}
}