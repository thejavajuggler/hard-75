public class MergeNSortedLists {

    public static void main(String[] args) {

        ListNode[] lists = {ListNode.getListNodeHead1(), ListNode.getListNodeHead2(), ListNode.getListNodeHead3(), ListNode.getListNodeHead4()};

        ListNode res = mergeNSortedList(lists, 0, lists.length - 1);
        while (res != null) {
            System.out.println(res.data);
            res = res.next;
        }

    }

    private static ListNode mergeNSortedList(ListNode[] lists, int start, int end) {
        if (start > end)
            return null;
        if (start == end)
            return lists[start];
        if (start + 1 == end)
            return mergeTwoLists(lists[start], lists[end]);

            int mid = start + (end - start) / 2;
            ListNode left = mergeNSortedList(lists, start, mid);
            ListNode right =  mergeNSortedList(lists, mid + 1, end);
            return mergeTwoLists(left, right);

    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode temp = head;

        while (l1 != null && l2 != null)
        if ( l1.data <= l2.data) {
            temp.next = l1;
            l1 = l1.next;
            temp = temp.next;

        }
        else {
            temp.next = l2;
            l2 = l2.next;
            temp = temp.next;
        }
        if (l1 == null) {
            temp.next = l2;
        }
        else if (l2 == null)
            temp.next = l1;

        return head.next;

    }
}
