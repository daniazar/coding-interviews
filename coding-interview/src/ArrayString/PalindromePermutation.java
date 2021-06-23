package ArrayString;

public class PalindromePermutation {

    public static void main(String[] args) {
        System.out.println(isPalindromePermutation("tact coa"));
        System.out.println(isPalindromePermutation("god dog"));
        System.out.println(isPalindromePermutation("ggoodd"));
        System.out.println(isPalindromePermutation("bad"));

    }

    public static boolean isPalindromePermutation(String str) {
        var chars = new char[128];
        for (char c : str.toCharArray()) {
            chars[c]++;
        }
        boolean odd = false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] % 2 == 1) {
                if (odd) {
                    return false;
                } else {
                    odd = true;
                }
            }
        }
        return true;
    }
}
