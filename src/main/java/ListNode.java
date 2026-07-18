import java.util.List;

public class ListNode {

    int data;

    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }


    public static ListNode getListNodeHead1() {
        ListNode listNode1 = new ListNode(6);
        ListNode listNode2 = new ListNode(7);
        ListNode listNode3 = new ListNode(10);

        listNode1.next = listNode2;
        listNode2.next = listNode3;

        return listNode1;
    }

    public static ListNode getListNodeHead2() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        return listNode1;
    }

    public static ListNode getListNodeHead3() {
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(10);
        ListNode listNode3 = new ListNode(13);
        ListNode listNode4 = new ListNode(17);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        return listNode1;
    }

    public static ListNode getListNodeHead4() {
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(7);
        ListNode listNode3 = new ListNode(9);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        return listNode1;
    }
}
