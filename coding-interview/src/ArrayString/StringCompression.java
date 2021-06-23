package ArrayString;

public class StringCompression {

    public static void main(String[] args) {
        System.out.println(compress("aabcccccaaa"));
    }

    public static String compress(String str) {
        var resp = new StringBuilder();
        var lastChar = str.charAt(0);
        var counter = 0;
        for (char c : str.toCharArray()) {
            if (lastChar == c) {
                counter++;
            } else {
                resp.append(lastChar);
                resp.append(counter);
                counter = 1;
                lastChar = c;
            }
        }
        resp.append(lastChar);
        resp.append(counter);
        var answer = resp.toString();

        if (answer.length() >= str.length())
            answer = str;
        return answer;
    }
}
