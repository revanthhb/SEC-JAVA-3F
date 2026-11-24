class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        // Loop through each customer (each row)
        for (int[] customerAccounts : accounts) {
            int currentWealth = 0;

            // Sum up all bank balances for the current customer
            for (int balance : customerAccounts) {
                currentWealth += balance;
            }

            // Update maxWealth if this customer is richer
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }

        return maxWealth;
    }
}
