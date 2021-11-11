public class Solve{
	// min value to get positive step by step sum.
	public int solver(int[] nums){
		int min = 0;
		int sum = 0;
		for(int i : nums){
			sum += i;
			min = Math.min(min, sum)
		}
		return min + 1;
	}
}