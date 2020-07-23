package Arrays;

public class MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int tmpCount = 0;
        for(int num : nums) {
        	if(num == 1) {
        		tmpCount ++;
        		count = Math.max(count, tmpCount);
        	}
        	else {
        		tmpCount = 0;
        	}
        }
        return count;
    }
}
