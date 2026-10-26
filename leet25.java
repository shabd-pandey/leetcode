
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode ptr = head;
        ListNode ktail = null;
        ListNode newhead = null;

        while (ptr != null) {
            int count = 0;
            ptr = head;

            // Check whether k nodes are available
            while (count < k && ptr != null) {
                ptr = ptr.next;
                count++;
            }

            if (count == k) {
                ListNode rev = reverse(head, k);

                if (newhead == null) {
                    newhead = rev;
                }

                if (ktail != null) {
                    ktail.next = rev;
                }

                ktail = head;
                head = ptr;
            } else {
                break;
            }
        }

        if (ktail != null) {
            ktail.next = head;
        }

        return newhead == null ? head : newhead;
    }

    public ListNode reverse(ListNode head, int k) {
        ListNode newhead = null;
        ListNode ptr = head;

        while (k > 0) {
            ListNode newnode = ptr.next;
            ptr.next = newhead;
            newhead = ptr;
            ptr = newnode;
            k--;
        }

        return newhead;
    }
}
