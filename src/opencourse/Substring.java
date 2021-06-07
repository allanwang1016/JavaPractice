package opencourse;
import java.util.*;

public class Substring {
	
	public static List<String> findSubstrings (String text) {
		List<String> subStrings = new ArrayList<>();
		for (int i = 0; i < text.length(); i++) {
			for (int k = i+1; k <= text.length(); k++) {
				if (text.charAt(i) == text.charAt(k-1)) {
					if (subStrings.contains(text.substring(i,k)) == false) {
						subStrings.add(text.substring(i, k));
					}
				}
				
			}
		}
		return subStrings;
	}
	
	public static void main(String[] args) {
		String test = "abcdabc";
		System.out.println(findSubstrings(test).toString());
	}
}
