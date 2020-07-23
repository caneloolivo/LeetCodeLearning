package Arrays;

import java.util.Arrays;

public class SquaresOfASortedArray {
	public int[] sortedSquares(int[] A) {
		int n = A.length;
        int[] result = new int[n];
        for(int i = 0; i < n; i ++)
        	result[i]  = A[i] * A[i];
        Arrays.sort(result);
        return result;
    }
	
	public int[] sortedSquares2(int[] A) {
        int N = A.length;
        int j = 0;
        while (j < N && A[j] < 0)
            j++;
        int i = j-1;

        int[] ans = new int[N];
        int t = 0;

        while (i >= 0 && j < N) {
            if (A[i] * A[i] < A[j] * A[j]) {
                ans[t++] = A[i] * A[i];
                i--;
            } else {
                ans[t++] = A[j] * A[j];
                j++;
            }
        }

        while (i >= 0) {
            ans[t++] = A[i] * A[i];
            i--;
        }
        while (j < N) {
            ans[t++] = A[j] * A[j];
            j++;
        }

        return ans;
    }
}
