package Question;

 import java.util.Scanner;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        FirstUniqueChar solution = new FirstUniqueChar();
        int result = solution.firstUniqChar(input);
        
        if (result == -1) {
            System.out.println("No unique character found.");
        } else {
            System.out.println("The first unique character is at index: " + result);
        }
        
        scanner.close();
    }
}
