package problem1;

import java.util.ArrayList;
import java.util.List;

public class Problem1_Main {

	public static int[] twoSum(int[] nums, int target) {
		if (nums.length >= 2 && nums.length <= Math.pow(10.0, 4.0)) {
			ArrayList<Integer> temp = new ArrayList<>();
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] >= Math.pow(-10.0, 9.0) && nums[i] <= Math.pow(10.0, 9.0)) {
					for (int j = i + 1; j < nums.length; j++) {
						if (target >= Math.pow(-10.0, 9.0) && target <= Math.pow(10.0, 9.0)) {
							if (nums[i] + nums[j] == target) {
								temp.add(i);
								temp.add(j);
							}
						}
					}
					if (i == nums.length - 1)
						break;
				}
			}
			int[] arr = new int[temp.size()];

			// ArrayList to Array Conversion
			for (int i = 0; i < temp.size(); i++)
				arr[i] = temp.get(i);
			return arr;
		}
		return null;
	}

	public static int[] twoSum2(int[] nums, int target) {
		List<Integer> arr = new ArrayList<>();

		for (int i : nums) {
			arr.add(i);
		}

		List<Integer> temp = new ArrayList<>();

		for (int i = 0; i < arr.size(); i++) {
			if (arr.contains(target - arr.get(i))) {
				temp.add(i);
				temp.add(arr.get(target - arr.get(i)));
			}
		}

		int[] result = new int[temp.size()];

		// ArrayList to Array Conversion
		for (int i = 0; i < temp.size(); i++) {
			result[i] = temp.get(i);
		}

		return result;
	}

	public static void main(String[] args) {
		int temp[] = { 1, 5, 5, 6 };
		int temp2[] = twoSum(temp, 6);
		for (int i = 0; i < temp2.length; i++)
			System.out.println(temp2[i]);
	}
}
