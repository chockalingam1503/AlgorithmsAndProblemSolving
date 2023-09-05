package org.training.leetcode;

public class MergeTwoSortedListsPractise {
    public static  ListNode mergeTwoLists(ListNode list1, ListNode list2) {


        return null;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next=  new ListNode(2);
        list1.next.next=new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next=  new ListNode(3);
        list2.next.next=new ListNode(4);


        ListNode listNode = mergeTwoLists(list1, list2);
        System.out.println(listNode);
    }

}
