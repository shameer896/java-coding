import java.util.*;

class HelloWorld {
   public static void main(String[] args) {
      // Input string
      String s = "the shameer the prinson the karna";
      
      // Substring to be replaced
      String s1 = "the";
      
      // Replacement string
      String s2 = "An";
      
      // Resulting string after replacement
      String ans = "";
      
      // Loop through each character in the input string
      for (int i = 0; i < s.length(); i++) {
         int k = 0;
         
         // Check if the current character matches the first character of the substring
         // and if there are enough characters remaining in the input string for a match
         if (s.charAt(i) == s1.charAt(k) && i + s1.length() <= s.length()) {
            int j = 0;
            
            // Check for a complete match of the substring
            for (j = i; j < (i + s1.length()); j++) {
               if (s.charAt(j) != s1.charAt(k)) {
                  break;
               } else {
                  k++;
               }
            }
            
            // If a complete match is found, append the replacement string to the result
            if (j == i + s1.length()) {
               ans += (s2);
               i = j - 1; // Skip the characters in the original string that were replaced
            } else {
               // If no match is found, append the current character to the result
               ans += (s.charAt(i));
            }
         } else {
            // If no match is found, append the current character to the result
            ans += (s.charAt(i));
         }
      }
      
      // Print the final result
      System.out.print(ans);
   }
}
