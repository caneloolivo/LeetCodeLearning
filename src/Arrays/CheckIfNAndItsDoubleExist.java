package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class CheckIfNAndItsDoubleExist {
	public boolean checkIfExist(int[] arr) {
		Arrays.sort(arr);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i]*2) 
					|| (map.containsKey(arr[i]/2) && arr[i] % 2==0))
				return true;
			map.put(arr[i], i);
		}
		return false;
    }
	
	public static void main(String[] args) {
		CheckIfNAndItsDoubleExist solution = new CheckIfNAndItsDoubleExist();
//		int [] arr = {10,2,5,3};
//		int [] arr = {3,1,7,11};
		int[] arr = {-10,12,-20,-8,15};
		boolean result = solution.checkIfExist(arr);
		System.out.println("El resultado es "+ result);
	}
}
