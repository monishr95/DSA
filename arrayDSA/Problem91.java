package arrayDSA;

//Count Maximum Consecutive One's in the array
public class Problem91 {
	static int findMaxConsecutiveOnes(int nums[]) {
		int count = 0;
		int maximum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
			} else {
				count = 0;
			}

			maximum = Math.max(maximum, count);
			//if count is greater than maximum then maximum value gets chaged
		}
		return maximum;
	}

	public static void main(String args[]) {
		int nums[] = { 1, 1, 0, 1, 1, 1 };
		int ans = findMaxConsecutiveOnes(nums);
		System.out.println("The maximum  consecutive 1's are " + ans);
	}
}
