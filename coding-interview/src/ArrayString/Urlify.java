package ArrayString;

public class Urlify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var str =urlify("Mr John Smith    ".toCharArray(), 13);
		System.out.println(str);
	}

	private static char[] urlify(char[] chars, int size) {
		int spaces = 0;
		for (int i = 0; i < size - 1; i++) {
			if(chars[i] == ' ')
				spaces++;
		}
		spaces = spaces * 2;
		for (int i = size-1; i >= 0; i--) {
			if(chars[i]== ' ') {
				chars[i+spaces] = '0';
				spaces--;
				chars[i+spaces] = '2';
				spaces--;
				chars[i+spaces] = '%';
				if(spaces == 0)
					break;
			}else {
				chars[i + spaces] = chars[i];
			}
		}
		return chars;
	}
		

}
