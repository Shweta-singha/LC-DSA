class Solution {

    public int reverse(int x) {

        int reverse = 0;

        while (x != 0) {

            // Step 1: Extract the last digit
            int digit = x % 10;

            // Step 2: Check for positive overflow
            if (reverse > Integer.MAX_VALUE / 10 ||
                (reverse == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            // Step 3: Check for negative overflow
            if (reverse < Integer.MIN_VALUE / 10 ||
                (reverse == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            // Step 4: Build the reversed number
            reverse = reverse * 10 + digit;

            // Step 5: Remove the last digit
            x = x / 10;
        }

        return reverse;
    }
}