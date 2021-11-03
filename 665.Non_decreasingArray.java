// TODO
public class Non_decreasingArray {
	public static void main(String[] args) {
		System.out.println(solve(new int[3,1,2,3]));
	}

	private static void solve(int[] arr) {
		int answer = 0;
		long[] location = new long[10000];
		Arrays.fill(location, Long.MIN_VALUE);

		for(int i=1; i<arr.length; i++) {
			if(arr[i-1] > arr[i]) answer++;
			if(location[arr[i]]==Long.MIN_VALUE) location[arr[i]] = i;
			else if(i-location[arr[i]]>2) return false;
		}
		return answer<=1;
	}

	private static void solve(int[] arr) {
		int answer = 0;
		int[] positionOf = new int[200000];
		Arrays.fill(positionOf, Integer.MIN_VALUE);

		for(int i=1; i<arr.length; i++) {
			if(arr[i-1] > arr[i]) answer++;
			if(positionOf[arr[i]]==Integer.MIN_VALUE) positionOf[arr[i]] = i;
			else {
				if(i-position[arr[i]] > 2) return false;
				position[arr[i]] = i;
			}
		}
		return answer<=1;
	}
}

// this problem can be solved in O(n) time