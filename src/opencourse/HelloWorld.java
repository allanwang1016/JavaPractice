package opencourse;
import java.util.*;

public class HelloWorld {
	public static int removeDuplicates(ArrayList<Integer> nums) {
		int pointerA = 0;
		int pointerB = 1;
		while (pointerB < nums.size()) {
			if (nums.get(pointerB) == nums.get(pointerA)) {
				nums.remove(pointerA);
			} else {
				pointerA += 1;
				pointerB += 1;
			}
		}
		return nums.size();
	}
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>(List.of(0,0,1,1,2,2,3,3,3,4));
		System.out.println("Original List: " + nums);
		System.out.println("Length of New List: " + removeDuplicates(nums));
		System.out.println("New List: " + nums);
	}

}
