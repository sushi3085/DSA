package sort;

// precondition: keys must start from 0 and end at n, or you say bigger than 0.
// cause we need the count of that value, and that value cannot below ZERO
// or it would be like pos[n] => pos[-9]
// and that doesn't make any sense

public class CountingSort{
	public static int[] sort(int[] arr){
		int len = arr.length;
		int[] pos = new int[len];
		for(int i=0; i<len; i++)
			pos[arr[i]]++;
		for(int i=len-1; i>=0; i--){
			pos[i] = len-pos[i];
			len = pos[i];
		}
		int[] out = new int[len];
		for(int i=0; i<len; i++){
			out[pos[i]] = arr[i];
			pos[i]++;
		}
		return out;
	}
}