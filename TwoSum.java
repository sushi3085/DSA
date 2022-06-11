import java.util.HashMap;

public class TwoSum{
	public int[] solve(int[] arr, int target){
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			int complement = target-arr[i];
			if(map.containsKey(complement) && map.get(complement)!=i)
				return new int[]{map.get(complement), i};
			map.put(complement, i);
		}
		return new int[]{-1, -1};
	}
}