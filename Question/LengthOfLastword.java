package Question;
public class LengthOfLastword {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "  Hello World  ";
        int result = solution.lengthOfLastWord(input);
        System.out.println("Length of last word: " + result);
    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count length of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}
