package org.training.leetcode;

// * Definition for singly-linked list.
public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static void main(String[] args) {

        ListNode ls1 = new ListNode(3);
        ls1.next = new ListNode(4);


    }


    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
