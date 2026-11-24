class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are never palindromes.
        // Numbers ending in 0 cannot be palindromes unless the number is 0 itself.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // For even-length numbers, x == revertedNumber (e.g., 1221 -> x=12, reverted=12).
        // For odd-length numbers, x == revertedNumber / 10 (e.g., 121 -> x=1, reverted=12).
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
