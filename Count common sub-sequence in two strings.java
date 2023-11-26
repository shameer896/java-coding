import java.util.*;

class main {
    public static void main(String[] args) {
        // Given strings
        String s = "abcdefg";
        String s1 = "aefbc";

        // Lengths of the strings
        int m = s.length();
        int n = s1.length();

        // Create a 2D array to store the count of common subsequences
        int[][] ans = new int[m + 1][n + 1];

        // Fill the matrix using dynamic programming
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    // Base case: If one of the strings is empty, there are no common subsequences
                    ans[i][j] = 0;
                } else if (s.charAt(i - 1) == s1.charAt(j - 1)) {
                    // Characters match, increment count based on the previous diagonal cell
                    ans[i][j] = ans[i - 1][j - 1] + 1;
                } else {
                    // Characters don't match, use the sum of counts from the top and left
                    // Subtract the count of common subsequences from the diagonal to avoid double-counting
                    ans[i][j] = ans[i - 1][j] + ans[i][j - 1] - ans[i - 1][j - 1];
                }
            }
        }

        // The bottom-right cell of the matrix contains the count of common subsequences
        System.out.print(ans[m][n]);
    }
}
