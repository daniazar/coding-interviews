package ArrayString;

public class StringRotation {
    public static void main(String args[]) {
        var str = "waterbottle";
        var str2 = "erbottlewat";
        System.out.println("word1: " + str);
        System.out.println("word2: " + str2);

        var result = str2 + str2;
        System.out.println(isSubstring(result, str));
    }

    public static boolean isSubstring(String string, String word) {
        var max = word.length();
        var counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == word.charAt(counter)) {
                counter++;
            } else {
                counter = 0;
            }
            if (counter == max) {
                return true;
            }
        }
        return false;
    }
}
