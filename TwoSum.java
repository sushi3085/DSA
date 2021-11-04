import java.util.HashMap;

public class TwoSum{
	public int[] solve(int[] arr, int target){
		HashMap<Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			int complement = target-arr[i];
			if(map.contains(complement) && map.get(complement)!=i)
				return new int[]{map.get(complement), i};
			map.push(complement, i);
		}
		return new int[]{-1, -1};
	}
}