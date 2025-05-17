package Wallmart;
import java.util.*;

/*
 * Problem Statement:
 * Word Search
Problem Statement:

Given an m x n grid of characters board and a string word , return true if word exists in the grid.



The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

Input Explanation:

The first line consists of two integers m and n, representing the dimensions of the board.
The next m lines consist of n characters each, representing the characters of the board.
The last line contains a string word, representing the word to search for in the board.
Output Explanation:

If the word exists in the board, output "True" on a single line.
If the word does not exist in the board, output "False" on a single line.
Constraints:

m == board.length
n = board[i].length
1 ≤ m, n ≤ 6
1 ≤ word.length ≤ 15
board and word consists of only lowercase and uppercase English letters.

Time Limit:
1 sec

Example 1:
Input
3 4
A B C E
S F C S
A D E E
ABCCED

Output
True

Example 2:
Input
3 4
A B C E
S F C S
A D E E
ABCB

Output
False
 */

class Solution {
    public boolean exist(char[][] board, String word) {
        //Write your code here
        
        int w_index = 0;
        int row = board.length;
        int col = board[0].length;
        
        for(int k=0; k<word.length();k++){
            boolean found = false;
              for(int i=0; i<row; i++){
                  for(int j = 0; j<col; j++){
                      if(board[i][j]==word.charAt(w_index))
                        {                     
                        board[i][j] = '0';
                        found = true;
                        break;
                  }
              }
              if(found) break;
        }
        if(!found)
        {
            return false;
        }
        w_index++;
    }
    
    return true;
    } 
    
}

//Do not edit this part of code
public class WordSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        char[][] board = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }
        
        String word = sc.next();
        
        Solution solution = new Solution();
        boolean result = solution.exist(board, word);
        
        System.out.println(result ? "True" : "False");
    }
}