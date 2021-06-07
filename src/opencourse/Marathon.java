package opencourse;
import java.util.*;

public class Marathon {
	public static void main (String[] args) {
		String[] names = {
				"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"
		};
		int[] times  = {
				341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265
		};
		List<Integer> timesSorted = new ArrayList<>();
		List<String> namesList = new ArrayList<>();
		List<Integer> timesList = new ArrayList<>();
		
		for (int i = 0; i < names.length; i++) {
			namesList.add(names[i]);
			timesList.add(times[i]);
		}
		
		while (timesList.size() >= 1) {
			int index = 0;
			for (int k = 0; k < timesList.size(); k++) {
				if (timesList.get(k) < timesList.get(index)) {
					index = k;
				}
			}
			timesSorted.add(timesList.get(index));
			timesList.remove(timesList.get(index));
		}
			
		System.out.println(timesSorted);
	}
}
