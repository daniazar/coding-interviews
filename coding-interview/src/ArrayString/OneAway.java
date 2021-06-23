package ArrayString;

public class OneAway {

    public static void main(String[] args) {
        System.out.println(isOneAway("pale", "ple"));
        System.out.println(isOneAway("pales", "pale"));
        System.out.println(isOneAway("pale", "bale"));
        System.out.println(isOneAway("pale", "bake"));
    }

    public static boolean isOneAway(String str, String other) {
        if (str.length() < other.length()) {
            var aux = str;
            str = other;
            other = aux;
        }

        if (str.length() - other.length() > 1) {
            return false;
        }

        boolean diff = false;
        if (str.length() - other.length() == 0) {
            for (int i = 0; i < other.length(); i++) {
                if (str.charAt(i) != other.charAt(i)) {
                    if (diff) {
                        return false;
                    } else {
                        diff = true;
                    }
                }
            }

        } else {
            var j = 0;
            for (int i = 0; i < other.length(); i++) {
                if (str.charAt(j) != other.charAt(i)) {
                    if (diff) {
                        return false;
                    } else {
                        diff = true;
                        i--;
                    }
                }
                j++;
            }
        }
        return true;
    }
}
