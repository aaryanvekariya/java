package     Question;

public class RotateString {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        String ss = s + s;
        return ss.contains(goal);
    }
    public static void main(String[] args) {
        RotateString rs = new RotateString();
        System.out.println(rs.rotateString("abcde", "cdeab")); // true
        System.out.println(rs.rotateString("abcde", "abced")); // false
    }
}