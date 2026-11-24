class Solution {
    public int getDecimalValue(ListNode head) {
        int result = 0;
        
        while (head != null) {
            // Multiply current value by 2 (or left shift by 1) and add the current bit
            result = (result * 2) + head.val;
            head = head.next;
        }
        
        return result;
    }
}
