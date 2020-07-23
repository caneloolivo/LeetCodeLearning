package Arrays;

public class FindNumbersWithEvenNumberOfDigits {
	public int findNumbers(int[] nums) {
		int count = 0;
		for(int num: nums) {
			int digit = 0;
			while (num > 0) {
				num /= 10;
				digit++;
			}
			if(digit %2 == 0)
				count ++;
		}
		return count;
	}		
	
	public static void main(String[] args) {
		FindNumbersWithEvenNumberOfDigits solution = new FindNumbersWithEvenNumberOfDigits();
		int[] nums = {12,345,2,6,7896};
		int result = solution.findNumbers(nums);
		System.out.println("El resultado es " + result);
	}
}
