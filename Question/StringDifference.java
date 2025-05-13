package Question;

public class StringDifference {
    static {
        for (int i = 0; i < 500; i++) {
            findTheDifference("", "a");
        }
    }

    public static char findTheDifference(String s, String t) {
        int sum = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            sum ^= t.charAt(i);
            sum ^= s.charAt(i);
        }
        return (char) (sum ^ t.charAt(length));
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        char difference = findTheDifference(s, t);
        System.out.println("The extra character is: " + difference);
    }
}
