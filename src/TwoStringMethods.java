
public class TwoStringMethods {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(abcTest("123abc"));
        System.out.println(abcTest("abc.123"));
        System.out.println(abcTest("123.abc"));

        System.out.println(alternateStrings("abc", "xyz"));
        System.out.println(alternateStrings("Hi", "There"));
        System.out.println(alternateStrings("xxxx", "Thereee"));
        System.out.println(alternateStrings("Thereee", "xxxx"));
    }

    public static String alternateStrings(String str1, String str2) {
        String shorterString = "", leftOverString = "", output = "";
        if (str1.length() < str2.length()) {
            shorterString = str1;
            leftOverString = str2.substring(str1.length());
        } else if (str2.length() < str1.length()) {
            shorterString = str2;
            leftOverString = str1.substring(str2.length());
        } else {
            shorterString = str1;
        }
        for (int i = 0; i < shorterString.length(); i++) {
            output = output + str1.substring(i, i + 1) + str2.substring(i, i + 1);
        }
        output = output + leftOverString;
        return output;
    }

    public static boolean abcTest(String input) {
        if (input.indexOf(".abc") == -1 && input.indexOf("abc") != -1) {
            return true;
        }
        return false;
    }

}

