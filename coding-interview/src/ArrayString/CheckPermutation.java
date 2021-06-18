package ArrayString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(IsPermutation("hola", "chau"));
		System.out.println(IsPermutation("ab", "ba"));
	}

	public static boolean IsPermutation(String str, String other) {
		if( str != null && other != null&& str.length() != other.length())
			return false;
		List<Character> chars1 = str.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		List<Character> chars2 = other.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		Collections.sort(chars1);
		Collections.sort(chars2);
		
		return chars2.equals(chars1);
		
	}
}
