public class Solution {
    public static long reverseBits(long n) {
        // Ensure n is treated as a 32-bit unsigned integer
        n = n & 0xFFFFFFFFL;
        
        // Convert the long to a binary string
        String binary = Long.toBinaryString(n);
        
        // Pad with leading zeros if necessary
        while (binary.length() < 32) {
            binary = "0" + binary;
        }
        
        // Reverse the binary string
        StringBuilder reverse = new StringBuilder(binary);
        reverse.reverse();
        binary = reverse.toString();
        
        // Parse the reversed binary string as a long
        return Long.parseLong(binary, 2);
    }
}
