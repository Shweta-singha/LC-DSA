class Solution {
    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];

        // Initialize all amounts as impossible
        Arrays.fill(dp, amount + 1);

        // Base case
        dp[0] = 0;

        // Calculate answer for every amount
        for (int i = 1; i <= amount; i++) {

            // Try every coin
            for (int coin : coins) {

                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}